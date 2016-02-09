package pl.tomaja.ati18n.properties;

import java.util.Locale;
import java.util.Properties;

import pl.tomaja.ati18n.resolvers.bundle.BundleFilenameResolver;

/**
 * @author atomaja
 */
public interface PropertiesLoader {

	Properties loadProperties(BundleFilenameResolver resolver, Locale locale);
	
}
