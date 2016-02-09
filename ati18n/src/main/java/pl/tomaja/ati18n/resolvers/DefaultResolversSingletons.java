package pl.tomaja.ati18n.resolvers;

import pl.tomaja.ati18n.resolvers.bundle.BundleFilenameResolver;
import pl.tomaja.ati18n.resolvers.bundle.SimpleBundleFilenameResolver;
import pl.tomaja.ati18n.resolvers.property.MessagePropertyNameResolver;
import pl.tomaja.ati18n.resolvers.property.SimplePropertyNameResolver;

/**
 * @author atomaja
 */
public class DefaultResolversSingletons {

	private static final MessagePropertyNameResolver PROPERTY_RESOLVER = new SimplePropertyNameResolver();
	private static final BundleFilenameResolver BUNDLE_RESOLVER = new SimpleBundleFilenameResolver("bundle", ".properties");
	
	public static MessagePropertyNameResolver properties() {
		return PROPERTY_RESOLVER;
	}
	
	public static BundleFilenameResolver bundle() {
		return BUNDLE_RESOLVER;
	}
}
