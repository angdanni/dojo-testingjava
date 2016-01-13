package dojo.calculadora;

public class Calculadora {
    public int dimeElResultadoDe(String cadena, Extractor extractor){
        
        //sacamos los operandos
        int [] operandos = extractor.extraerOperandos(cadena);
        
        //sacamos el operador
        String operador = extractor.extraerOperador(cadena);
        int resultado = 0;
        
        //elegimos la operacion
        switch(operador){
	        case "+":
	            resultado = operandos[0]+operandos[1];
	           break;
	        case "-":
	            resultado = operandos[0]-operandos[1];
	            break;
	        default:
	        	throw new IllegalArgumentException("Operator not allowed");
        }
        
        //devolvemos el resultado
        return resultado;
    }
    
    public String dimeElResultadoConFormato(String cadena, Extractor extractor) {
    	int resultado = dimeElResultadoDe(cadena, extractor);
    	
    	return Formatter.format(cadena, resultado);
    }

}
