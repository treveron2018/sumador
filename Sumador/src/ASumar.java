
public class ASumar {
	
String valor_inicial;

/**
 * Constructor de la clase ASumar.
 * @param string número que será sumado, en forma de cadena de caracteres
 */
	public ASumar(String string) {
		this.valor_inicial=string;

	}

	
	/**
	 * muestra el resultado de la suma  (si el número es de un dígito, muestra el número)
	 * @return resultado de la suma
	 */
	public String mostrar() {
		String numero=valor_inicial;
		if(numero.length()==1) {
			return (numero+" = "+ numero);
		}

		return null;
	}
	

}
