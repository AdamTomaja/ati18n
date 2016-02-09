package pl.tomaja.ati18n.bundle;

/**
 * @author atomaja
 */
public class BundleManager<T> {

	private final BundleFactory factory;
	private final Class<T> bundleType;
	
	private I18NContainer container;
	private T bundle;

	public BundleManager(BundleFactory factory, Class<T> bundleType) {
		this.factory = factory;
		this.bundleType = bundleType;
	}
	
	public T get() {
		if(bundle == null) {
			container = new I18NContainer();
			bundle = factory.create(bundleType, container);
		}
		
		return bundle;
	}

	public BundleFactory getBundleFactory() {
		return factory;
	}
	
	public I18NContainer getContainer() {
		return container;
	}
	
	public static <T> BundleManager<T> withDefaultFactory(Class<T> bundleType) {
		return new BundleManager<T>(new BundleFactory(), bundleType);
	}
}
