
package pl.tomaja.ati18n.resolvers.property;

import java.lang.reflect.Method;

/**
 * @author atomaja
 */
public class SimplePropertyNameResolver implements MessagePropertyNameResolver {

	@Override
	public String getPropertyName(Class<?> bundleClass, Method method, Object[] args) {
		return method.getName();
	}
}
