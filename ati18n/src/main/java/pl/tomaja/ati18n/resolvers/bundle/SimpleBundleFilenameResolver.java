package pl.tomaja.ati18n.resolvers.bundle;

import java.util.Locale;

/**
 * @author atomaja
 */
public class SimpleBundleFilenameResolver implements BundleFilenameResolver {

	private final String prefix;
	
	private final String suffix;
	
	public SimpleBundleFilenameResolver(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}

	@Override
	public String getBundleFilename(Locale locale) {
		return String.format("%s-%s%s", prefix, locale.toString(), suffix);
	}
}
