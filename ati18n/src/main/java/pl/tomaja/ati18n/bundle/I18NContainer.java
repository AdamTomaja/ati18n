package pl.tomaja.ati18n.bundle;

import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;

import pl.tomaja.ati18n.properties.PropertiesLoader;
import pl.tomaja.ati18n.properties.PropertiesLoaderFactory;
import pl.tomaja.ati18n.resolvers.DefaultResolversSingletons;
import pl.tomaja.ati18n.resolvers.bundle.BundleFilenameResolver;
import pl.tomaja.ati18n.resolvers.property.MessagePropertyNameResolver;

/**
 * @author atomaja
 */
public class I18NContainer {

	private final HashMap<Locale, Properties> properties = new HashMap<Locale, Properties>();

	private MessagePropertyNameResolver nameResolver = DefaultResolversSingletons.properties();
	private BundleFilenameResolver bundleResolver = DefaultResolversSingletons.bundle();
	private PropertiesLoader loader = PropertiesLoaderFactory.create();
	
	private Locale locale;

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		if(!isLocaleLoaded(locale)) {
			reloadLocale(locale);
		}
		
		this.locale = locale;
	}

	public Properties reloadLocale(Locale locale) {
		Properties props = loader.loadProperties(bundleResolver, locale);
		properties.put(locale, props);
		return props;
	}
	
	public boolean isLocaleLoaded(Locale locale) {
		return properties.get(locale) != null;
	}
	
	public MessagePropertyNameResolver getNameResolver() {
		return nameResolver;
	}

	public void setNameResolver(MessagePropertyNameResolver nameResolver) {
		this.nameResolver = nameResolver;
	}
	
	public BundleFilenameResolver getBundleResolver() {
		return bundleResolver;
	}

	public void setBundleResolver(BundleFilenameResolver bundleResolver) {
		this.bundleResolver = bundleResolver;
	}

	public Properties getProperties(Class<?> bundleClass) {
		return properties.get(locale);
	}
}
