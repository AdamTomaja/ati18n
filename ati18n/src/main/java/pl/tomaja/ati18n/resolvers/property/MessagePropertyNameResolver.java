package pl.tomaja.ati18n.resolvers.property;

import java.lang.reflect.Method;

/**
 * @author atomaja
 */
@FunctionalInterface
public interface MessagePropertyNameResolver {

	String getPropertyName(Class<?> bundleClass, Method method, Object[] args);
	
}
