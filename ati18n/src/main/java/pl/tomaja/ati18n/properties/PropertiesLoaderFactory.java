package pl.tomaja.ati18n.properties;

/**
 * @author atomaja
 */
public class PropertiesLoaderFactory {

	public static PropertiesLoader create() {
		return new ClassPathPropertiesLoader();
	}
}
