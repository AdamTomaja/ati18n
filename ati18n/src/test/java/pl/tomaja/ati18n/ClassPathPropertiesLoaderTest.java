package pl.tomaja.ati18n;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import pl.tomaja.ati18n.properties.ClassPathPropertiesLoader;

/**
 * @author atomaja
 */
public class ClassPathPropertiesLoaderTest {

	@Test
	public void loadTest() {
		ClassPathPropertiesLoader loader = new ClassPathPropertiesLoader();
		Properties props = loader.loadProperties(new TestBundleFileNameResolver(), null);
		Assert.assertEquals("Hello World", props.get("test"));
	}
}
