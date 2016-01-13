package dojo.runners.categories;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import dojo.runners.categories.SlowGreeting;

@RunWith(Parameterized.class)
public class SlowGreetingTest {

	private SlowGreeting greeting = new SlowGreeting();
	
	private String inputName;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { "Dani" }, { "Roberto" }  
           });
    }
    
    public SlowGreetingTest(String input) {
    	inputName = input;
    }
	
	@Category(SlowTests.class)
	@Test
	public void sayHelloTest() {
		greeting.sayHello(inputName);
	}

}
