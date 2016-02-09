package pl.tomaja.ati18n;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

import pl.tomaja.ati18n.resolvers.bundle.BundleFilenameResolver;
import pl.tomaja.ati18n.resolvers.bundle.SimpleBundleFilenameResolver;

public class SimpleBundleFilenameResolverTest {

	@Test
	public void getBundleFilenameTest() {
		BundleFilenameResolver resolver = new SimpleBundleFilenameResolver("abc", ".qwe");
		Assert.assertEquals("abc-test.qwe", resolver.getBundleFilename(new Locale("test")));
	}
}
