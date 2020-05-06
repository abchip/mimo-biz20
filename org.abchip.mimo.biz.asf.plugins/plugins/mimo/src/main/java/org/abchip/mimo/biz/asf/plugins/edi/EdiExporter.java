package org.abchip.mimo.biz.asf.plugins.edi;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.asf.plugins.entity.EcoreUtils;
import org.abchip.mimo.edi.entity.EntityPackage;
import org.abchip.mimo.edi.message.MessagePackage;
import org.abchip.mimo.edi.transmission.TransmissionPackage;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.osgi.service.log.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EdiExporter {

	private static final Logger LOGGER = Logs.getLogger(EdiExporter.class);

	private Document document;
	private List<EPackage> ePackages = null;

	public EdiExporter(Document document) {
		this.document = document;
		this.ePackages = new ArrayList<EPackage>();
		this.ePackages.add(EntityPackage.eINSTANCE);
		this.ePackages.add(MessagePackage.eINSTANCE);
		this.ePackages.add(TransmissionPackage.eINSTANCE);
	}

	public Document getDocument() {
		return this.document;
	}

	public static void main(String[] args) {

		// create XML document
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		try {
			documentBuilder = documentFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			LOGGER.error(e.getMessage());
			return;
		}
		Document document = documentBuilder.newDocument();

		EdiExporter exporter = new EdiExporter(document);
		exporter.export();

		// create the xml file
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(System.out);

			transformer.transform(domSource, streamResult);
		} catch (TransformerException e) {
			LOGGER.error(e.getMessage());
		}
	}

	public void export() {

		// root element
		Element entityModel = this.getDocument().createElement("entitymodel");
		entityModel.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		entityModel.setAttribute("xsi:noNamespaceSchemaLocation", "http://ofbiz.apache.org/dtds/entitymodel.xsd");

		Element title = this.getDocument().createElement("title");
		title.setTextContent("edi");
		entityModel.appendChild(title);

		Element description = this.getDocument().createElement("description");
		entityModel.appendChild(description);

		Element copyright = this.getDocument().createElement("copyright");
		entityModel.appendChild(copyright);

		Element version = this.getDocument().createElement("version");
		entityModel.appendChild(version);

		this.getDocument().appendChild(entityModel);

		for (EPackage ePackage : ePackages)
			export(entityModel, ePackage, true);
	}

	public void export(Element root, EPackage ePackage, boolean subPackages) {

		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;

				if (eClass.isAbstract())
					continue;

				appendEClass(root, eClass);
			} else if (eClassifier instanceof EEnum) {
			} else if (eClassifier instanceof EDataType) {
			} else {
				LOGGER.warn("Classifier {} not found", eClassifier.getName());
			}
		}

		if (subPackages) {
			for (EPackage eSubPackage : ePackage.getESubpackages())
				export(root, eSubPackage, true);
		}
	}

	public void appendEClass(Element root, EClass eClass) {

		Element entity = this.getDocument().createElement("entity");
		entity.setAttribute("entity-name", eClass.getName());
		entity.setAttribute("package-name", EcoreUtils.packageToName(eClass.getEPackage()));
		root.appendChild(entity);

		EClass eSuper = eClass.getESuperTypes().iterator().next();

		// fields
		for (EAttribute eAttribute : eClass.getEAllAttributes()) {

			if (org.abchip.mimo.entity.EntityPackage.eINSTANCE.getEntityIdentifiable().getEStructuralFeature(eAttribute.getName()) != null)
				continue;
//			if (org.abchip.mimo.entity.EntityPackage.eINSTANCE.getEntityInfo().getEStructuralFeature(eAttribute.getName()) != null)
//				continue;

			if (!eSuper.isAbstract()) {
				if (eSuper.getEAllAttributes().contains(eAttribute) && !eAttribute.isID())
					continue;
			}

			if (eAttribute.isMany())
				continue;

			Element field = this.getDocument().createElement("field");
			field.setAttribute("name", eAttribute.getName());

			// type switch
			// id
			if (eAttribute.isID())
				field.setAttribute("type", "id");
			// description
			else if (eAttribute.getName().equals("text"))
				field.setAttribute("type", "description");
			// body
			else if (eAttribute.getName().equals("body"))
				field.setAttribute("type", "object");
			// blob
			else if (eAttribute.getEType().equals(EcorePackage.Literals.EBYTE_ARRAY))
				field.setAttribute("type", "object");
			// string
			else if (eAttribute.getEType().equals(EcorePackage.Literals.ESTRING))
				field.setAttribute("type", "value");
			// boolean
			else if (eAttribute.getEType().equals(EcorePackage.Literals.EBOOLEAN))
				field.setAttribute("type", "indicator");
			// date
			else if (eAttribute.getEType().equals(EcorePackage.Literals.EDATE))
				field.setAttribute("type", "date-time");
			// enum
			else if (eAttribute.getEType() instanceof EEnum)
				field.setAttribute("type", "value");
			else {
				LOGGER.warn("Unknown field {}", field);
			}
			entity.appendChild(field);
		}

		// id attribute
		if (eClass.getEIDAttribute() != null) {
			Element primKey = this.getDocument().createElement("prim-key");
			primKey.setAttribute("field", eClass.getEIDAttribute().getName());
			entity.appendChild(primKey);
		}
		// composite key
		else {
			for (EAttribute eAttribute : eClass.getEAllAttributes()) {

				EAnnotation eAnnotation = eAttribute.getEAnnotation(Slot.NS_PREFIX_SLOT);
				if (eAnnotation == null)
					continue;
				if (!eAnnotation.getDetails().containsKey("key"))
					continue;

				Element primKey = this.getDocument().createElement("prim-key");
				primKey.setAttribute("field", eAttribute.getName());
				entity.appendChild(primKey);
			}
		}

		// relations
		for (EReference eReference : eClass.getEAllReferences()) {

			if (org.abchip.mimo.entity.EntityPackage.eINSTANCE.getEntityIdentifiable().getEStructuralFeature(eReference.getName()) != null)
				continue;

			if (!eSuper.isAbstract()) {
				if (eSuper.getEAllReferences().contains(eReference))
					continue;
			}

			/*
			 * Element relation = this.getDocument().createElement("relation");
			 * relation.setAttribute("type", "one");
			 * relation.setAttribute("rel-entity-name", frameName);
			 * relation.setAttribute("fk-name", ModelUtils.toDatabaseFkName(new String[] {
			 * eClass.getName(), frameName })); entity.appendChild(relation);
			 * 
			 * Element keyMap = this.getDocument().createElement("key-map");
			 * keyMap.setAttribute("field-name", eAttributeDomain.getName());
			 * keyMap.setAttribute("rel-field-name", eFrameRef.getEIDAttribute().getName());
			 * relation.appendChild(keyMap);
			 */
		}
	}
}