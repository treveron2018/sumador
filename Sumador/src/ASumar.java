
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
	 * devuelve la suma de los dígitos que se le pasan mediante un String
	 * @return suma de los dígitos
	 */
    public int total() {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            String digito = valor_inicial.substring(i, 1);
            suma = suma + Integer.getInteger(digito);
        }
        return suma;

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
		if (Integer.parseInt(numero)<0) {
			return null;
		}
		else {
			numero=valor_inicial.substring(0,1);
			System.out.print(numero);
			for(int i=1;i<valor_inicial.length();i++) {
				System.out.print(" + "+valor_inicial.substring(i,i+1));
			}
			
			System.out.print(" = ");
			
			Integer suma=new Integer(total());			
			return suma.toString();
		}
	}
	

}
