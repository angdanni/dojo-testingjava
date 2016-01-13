package dojo.calculadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import dojo.runners.categories.SlowTests;

@Category(SlowTests.class)
@RunWith(PowerMockRunner.class)
@PrepareForTest(Formatter.class)
public class CalculadoraTest {

	@Mock
	private Extractor extractor;
		
	private Calculadora calculadora = new Calculadora();
	
	
	  @Test
	  public void sumaTest() {
	     //Given
		 String opSuma = "4+5";
	     int[] operandos={4,5};
	     int resultadoEsperado = 9;
	     
	     //When
	     when(extractor.extraerOperador(anyString())).thenReturn("+");
	     when(extractor.extraerOperandos(anyString())).thenReturn(operandos);
	     
	     int expected = this.calculadora.dimeElResultadoDe(opSuma,extractor);
	     
	     //Then
	     assertEquals(resultadoEsperado, expected);
	  }
	  
	  @Test
	  public void restaTest() {
		//Given
	     String opResta = "8-3";
	     int[] operandos={8,3};
	     int resultadoEsperado = 5;
	     
	     //When
	     when(extractor.extraerOperador(anyString())).thenReturn("-");
	     when(extractor.extraerOperandos(anyString())).thenReturn(operandos);
	     
	     int resultadoObtenido = this.calculadora.dimeElResultadoDe(opResta,extractor);
	     
	     //Then
	     assertEquals(resultadoEsperado, resultadoObtenido);
	  }
	  
	  @Test(expected = IllegalArgumentException.class)
	  public void invalidOperatorTest() {
		 //Given
	     String operacionNoPermitida = "8*8";
	     int[] operandos={8,8};

	     when(extractor.extraerOperador(anyString())).thenReturn("*");
	     when(extractor.extraerOperandos(anyString())).thenReturn(operandos);
	     
	     this.calculadora.dimeElResultadoDe(operacionNoPermitida,extractor);
	   
	  }
	  
	  @Test
	  public void restaConFromatoTest() {
		//Given
	     String opResta = "8-3";
	     String resultadoEsperado = "El resultado de 8-3 es 5";
	     int[] operandos={8,3};
	     
	     PowerMockito.mockStatic(Formatter.class);
	     
	     
	     //When
	     when(extractor.extraerOperador(anyString())).thenReturn("-");
	     when(extractor.extraerOperandos(anyString())).thenReturn(operandos);
	     when(Formatter.format(opResta, 5)).thenReturn(resultadoEsperado);
	     
	     String resultadoObtenido = this.calculadora.dimeElResultadoConFormato(opResta, extractor);
	     
	     //Then
	     assertEquals(resultadoEsperado, resultadoObtenido);
	  }
	  

	  

}
