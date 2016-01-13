package dojo.runners.categories;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import dojo.runners.categories.FasterGreeting;

@RunWith(Parameterized.class)
public class FasterGreetingTest {

	private FasterGreeting greeting = new FasterGreeting();
	
	private String inputName;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { "Dani" }, { "Roberto" }  
           });
    }
	
    public FasterGreetingTest(String input) {
    	inputName= input;
    }
    
	@Category(FastTests.class)
	@Test
	public void sayHelloTest() {
		greeting.sayHello(inputName);
	}

}
