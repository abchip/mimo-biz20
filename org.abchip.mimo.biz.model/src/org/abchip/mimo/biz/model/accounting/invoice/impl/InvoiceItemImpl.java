/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.invoice.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.feature.ProductFeature;
import org.abchip.mimo.biz.model.product.inventory.InventoryItem;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getInvoiceItemType <em>Invoice Item Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getOverrideGlAccount <em>Override Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getOverrideOrgParty <em>Override Org Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getParentInvoiceId <em>Parent Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getParentInvoiceItemSeqId <em>Parent Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getProductFeature <em>Product Feature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getSalesOpportunity <em>Sales Opportunity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthGeo <em>Tax Auth Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthParty <em>Tax Auth Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthorityRateSeq <em>Tax Authority Rate Seq</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#isTaxableFlag <em>Taxable Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceItemImpl extends EntityTypedImpl<InvoiceItemType> implements InvoiceItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice getInvoice() {
		return (Invoice)eGet(InvoicePackage.Literals.INVOICE_ITEM__INVOICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoice(Invoice newInvoice) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__INVOICE, newInvoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return (BigDecimal)eGet(InvoicePackage.Literals.INVOICE_ITEM__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ITEM__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItem() {
		return (InventoryItem)eGet(InvoicePackage.Literals.INVOICE_ITEM__INVENTORY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItem(InventoryItem newInventoryItem) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__INVENTORY_ITEM, newInventoryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemType getInvoiceItemType() {
		return (InvoiceItemType)eGet(InvoicePackage.Literals.INVOICE_ITEM__INVOICE_ITEM_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemType(InvoiceItemType newInvoiceItemType) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__INVOICE_ITEM_TYPE, newInvoiceItemType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getOverrideGlAccount() {
		return (GlAccount)eGet(InvoicePackage.Literals.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccount(GlAccount newOverrideGlAccount) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT, newOverrideGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOverrideOrgParty() {
		return (Party)eGet(InvoicePackage.Literals.INVOICE_ITEM__OVERRIDE_ORG_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideOrgParty(Party newOverrideOrgParty) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__OVERRIDE_ORG_PARTY, newOverrideOrgParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemSeqId() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemSeqId(String newInvoiceItemSeqId) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID, newInvoiceItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentInvoiceId() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ITEM__PARENT_INVOICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentInvoiceId(String newParentInvoiceId) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__PARENT_INVOICE_ID, newParentInvoiceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentInvoiceItemSeqId() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentInvoiceItemSeqId(String newParentInvoiceItemSeqId) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID, newParentInvoiceItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return (Product)eGet(InvoicePackage.Literals.INVOICE_ITEM__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeature getProductFeature() {
		return (ProductFeature)eGet(InvoicePackage.Literals.INVOICE_ITEM__PRODUCT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeature(ProductFeature newProductFeature) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__PRODUCT_FEATURE, newProductFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(InvoicePackage.Literals.INVOICE_ITEM__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunity getSalesOpportunity() {
		return (SalesOpportunity)eGet(InvoicePackage.Literals.INVOICE_ITEM__SALES_OPPORTUNITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunity(SalesOpportunity newSalesOpportunity) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__SALES_OPPORTUNITY, newSalesOpportunity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getTaxAuthGeo() {
		return (Geo)eGet(InvoicePackage.Literals.INVOICE_ITEM__TAX_AUTH_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeo(Geo newTaxAuthGeo) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__TAX_AUTH_GEO, newTaxAuthGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getTaxAuthParty() {
		return (Party)eGet(InvoicePackage.Literals.INVOICE_ITEM__TAX_AUTH_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthParty(Party newTaxAuthParty) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__TAX_AUTH_PARTY, newTaxAuthParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityRateProduct getTaxAuthorityRateSeq() {
		return (TaxAuthorityRateProduct)eGet(InvoicePackage.Literals.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateSeq(TaxAuthorityRateProduct newTaxAuthorityRateSeq) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ, newTaxAuthorityRateSeq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxableFlag() {
		return (Boolean)eGet(InvoicePackage.Literals.INVOICE_ITEM__TAXABLE_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxableFlag(boolean newTaxableFlag) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__TAXABLE_FLAG, newTaxableFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUom() {
		return (Uom)eGet(InvoicePackage.Literals.INVOICE_ITEM__UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUom(Uom newUom) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM__UOM, newUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case InvoicePackage.INVOICE_ITEM__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case InvoicePackage.INVOICE_ITEM__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case InvoicePackage.INVOICE_ITEM__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case InvoicePackage.INVOICE_ITEM__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return InvoicePackage.INVOICE_ITEM__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return InvoicePackage.INVOICE_ITEM__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return InvoicePackage.INVOICE_ITEM__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return InvoicePackage.INVOICE_ITEM__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InvoiceItemImpl
