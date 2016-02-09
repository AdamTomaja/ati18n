package pl.tomaja.ati18n_test;

import java.util.Locale;

import pl.tomaja.ati18n.bundle.BundleManager;

public class App {
	public static void main(String[] args) {
		BundleManager<ExampleBundle> manager = BundleManager.withDefaultFactory(ExampleBundle.class);
		ExampleBundle bundle = manager.get();
		manager.getContainer().setLocale(Locale.getDefault());
		System.out.println(bundle.carsCount(256));
		manager.getContainer().setLocale(new Locale("pl_PL"));
		System.out.println(bundle.carsCount(512));
		System.out.println(bundle.helloWorld("Adam", 20));
		System.out.println(bundle.noValue());
		System.out.println(bundle.seriouslyNoValue());		
	}	
}
