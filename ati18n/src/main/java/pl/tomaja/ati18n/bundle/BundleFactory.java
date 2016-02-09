package pl.tomaja.ati18n.bundle;

import java.lang.reflect.Proxy;

/**
 * @author atomaja
 */
public class BundleFactory {

	@SuppressWarnings("unchecked")
	public <T> T create(Class<?> bundleType, I18NContainer localeContainer) {
		return (T) Proxy.newProxyInstance(bundleType.getClassLoader(), 
				new Class[]{bundleType}, 
				new BundleInvocationHandler(bundleType, localeContainer));
	}
}
