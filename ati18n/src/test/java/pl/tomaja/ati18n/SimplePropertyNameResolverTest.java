package pl.tomaja.ati18n;

import org.junit.Assert;
import org.junit.Test;

import pl.tomaja.ati18n.resolvers.property.MessagePropertyNameResolver;
import pl.tomaja.ati18n.resolvers.property.SimplePropertyNameResolver;

public class SimplePropertyNameResolverTest {

	@Test
	public void testGetPropertyName() throws NoSuchMethodException, SecurityException {
		MessagePropertyNameResolver resolver = new SimplePropertyNameResolver();
		Assert.assertEquals("testGetPropertyName", resolver.getPropertyName(null, this.getClass().getMethod("testGetPropertyName"), null));
	}
}
