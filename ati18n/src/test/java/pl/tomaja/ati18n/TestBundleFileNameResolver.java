
package pl.tomaja.ati18n;

import java.util.Locale;

import pl.tomaja.ati18n.resolvers.bundle.BundleFilenameResolver;

/**
 * @author atomaja
 */
public class TestBundleFileNameResolver implements BundleFilenameResolver {

	@Override
	public String getBundleFilename(Locale locale) {
		return "test.properties";
	}
}
