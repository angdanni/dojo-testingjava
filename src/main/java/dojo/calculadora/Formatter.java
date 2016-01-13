package dojo.calculadora;

import java.util.ResourceBundle;

public class Formatter {
	
	private static ResourceBundle dojoProp;

	public static String format(String cadena, int resultado) {
		dojoProp = ResourceBundle.getBundle("dojo"); 		
		return String.format(dojoProp.getString("cadena"), cadena, resultado);		
	}

}
