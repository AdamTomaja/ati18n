package pl.tomaja.ati18n.resolvers.bundle;

import java.util.Locale;

/**
 * @author atomaja
 */
public interface BundleFilenameResolver {

	String getBundleFilename(Locale locale);
	
}
