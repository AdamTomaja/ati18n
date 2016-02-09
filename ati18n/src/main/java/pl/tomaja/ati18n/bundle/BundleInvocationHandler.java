package pl.tomaja.ati18n.bundle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.MessageFormat;

/**
 * @author atomaja
 */
public class BundleInvocationHandler implements InvocationHandler {

	private static final String NO_MESSAGE_PLACEHOLDER_FORMAT = "!%s!";
	
	private final I18NContainer container;
	private final Class<?> bundleClass;
	
	public BundleInvocationHandler(Class<?> bundleClass, I18NContainer container) {
		this.bundleClass = bundleClass;
		this.container = container;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		final String propertyName = container.getNameResolver().getPropertyName(bundleClass, method, args);
		
		final String message = (String) container.getProperties(bundleClass)
				.get(propertyName);
		
		if(message == null) {
			DefaultValue defaultValue = method.getAnnotation(DefaultValue.class);
			if(defaultValue == null) {
				return String.format(NO_MESSAGE_PLACEHOLDER_FORMAT, propertyName);
			}
			
			return defaultValue.value();
		}
		
		MessageFormat format = new MessageFormat(message);
		return format.format(args);
	}
}
