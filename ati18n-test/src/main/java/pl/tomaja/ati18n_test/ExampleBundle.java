package pl.tomaja.ati18n_test;

import pl.tomaja.ati18n.bundle.DefaultValue;

/**
 * @author atomaja
 */
public interface ExampleBundle {

	String carsCount(int count);
	String helloWorld(String name, int age);
	
	@DefaultValue("I dont know!")
	String noValue();
	
	String seriouslyNoValue();
}
