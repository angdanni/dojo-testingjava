package dojo.runners.categories;

public class FasterGreeting implements GreetingManager {

	@Override
	public void sayHello(String to) {
		System.out.println("Hi ".concat(to));
	}

}
