package dojo.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dojo.calculadora.Extractor;
import dojo.calculadora.ExtractorInterface;

public class ExtractorTest {
	private ExtractorInterface extractor;
	
	  @Before
	  public void setUp() {
		    this.extractor = new Extractor();
		  }
	  @After
	  public void tearDown() {
	    this.extractor = null;
	  }
	  
	  @Test
	  public void testExtraerOperadorOK() {
	     String op = "4+5";
	     String resultadoEsperado = "+";
	     String resultadoObtenido = (String) this.extractor.extraerOperador(op);
	     assertEquals(resultadoEsperado, resultadoObtenido);
	  }
	  
	  @Test
	  public void testExtraerOperadorKO() {
	     String op = "4+5";
	     String resultadoEsperado = "-";
	     String resultadoObtenido = (String) this.extractor.extraerOperador(op);
	     assertNotEquals(resultadoEsperado, resultadoObtenido);
	  }
	  
	
}
