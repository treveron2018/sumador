
public class ASumar {
	private String valor_inicial;
	
	/**
	 * Constructor de la clase pasandole solo un digito por parámetro.
	 * @param string número de un dígito
	 */
    public ASumar(String string) {
        this.valor_inicial = string;
    }
    
    /**
     * Muestra el resultado de la operación, dependiendo de si es un número solo, dos o el número es negativo.
     * @return
     */
    public String mostrar() {
        String numero = valor_inicial;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
        else if (numero.substring(0, 1).equals("-")) {
        	return "";
        }
        else if (numero.length() > 1) {
            int suma = 0;

            for (int i = 0; i < valor_inicial.length(); i++) {
                // Cadena de un dígito.
                String digito = valor_inicial.substring(i, i + 1);
                suma = suma + Integer.parseInt(digito);
            }
            return Integer.toString(suma);
        }
        return null;
    }
}