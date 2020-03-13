package org.abchip.mimo.biz.product;

import org.abchip.mimo.application.Application;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class BizActivatorImpl implements BundleActivator {

	private static Application APPLICATION = null;
	
	public static Application getApplication() {
		return APPLICATION;
	}
	
	protected static void setApplication(Application application) {
		APPLICATION = application;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {

		ClassLoader parentLoader = Thread.currentThread().getContextClassLoader();
		ClassLoader bizLoader = new BizClassLoaderImpl(parentLoader);
		Thread.currentThread().setContextClassLoader(bizLoader);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		ClassLoader bizLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(bizLoader.getParent());
	}

	private class BizClassLoaderImpl extends ClassLoader {

		public BizClassLoaderImpl(ClassLoader originalLoader) {
			super(originalLoader);
		}

		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException {

			if (name.equals("org.apache.ofbiz.base.container.ContainerLoader")) {
				return BizApplicationLoaderImpl.class;
			} else {
				return super.loadClass(name);
			}
		}
	}
}