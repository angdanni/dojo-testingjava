package dojo.calculadora;

public class Extractor implements ExtractorInterface{

    public int[] extraerOperandos(String cadena) {
        int [] operandos = {Integer.parseInt(cadena.charAt(0)+""), Integer.parseInt(cadena.charAt(2)+"")};
        return operandos;
    }

    public String extraerOperador(String cadena) {
        return String.valueOf(cadena.charAt(1));
    }

}
