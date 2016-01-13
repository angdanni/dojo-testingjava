package dojo.runners.categories;

public class SlowGreeting implements GreetingManager {
 
	
	@Override
	public void sayHello(String to) {
		StringBuffer greeting = new StringBuffer(24 + to.length());
		greeting.append("Hello ").append(to).append(", nice to meet you");
		System.out.println(greeting.toString());
	}

}
