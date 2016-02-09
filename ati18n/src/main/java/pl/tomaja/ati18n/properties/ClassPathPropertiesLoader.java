package pl.tomaja.ati18n.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;

import pl.tomaja.ati18n.resolvers.bundle.BundleFilenameResolver;

/**
 * @author atomaja
 */
class ClassPathPropertiesLoader implements PropertiesLoader {

	@Override
	public Properties loadProperties(BundleFilenameResolver resolver, Locale locale) {
		Properties props = new Properties();
		final String filename = resolver.getBundleFilename(locale);
		InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
		if(is == null) {
			throw new RuntimeException("Cannot find bundle file: " + filename);
		}
		
		try {
			props.load(is);
			return props;
		} catch (IOException e) {
			throw new RuntimeException("Unable to load bundle file: " + filename, e);
		}
	}
}
