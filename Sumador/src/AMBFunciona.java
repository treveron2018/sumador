
public class AMBFunciona {

	public static void main(String[] args) {
		ASumar suma = new ASumar("5");
		System.out.println("El resultado de un solo dígito es: " + suma.mostrar());
		
		ASumar suma2 = new ASumar("-5");
		System.out.println("El resultado de un número negativo es: " + suma2.mostrar());
		
		ASumar suma3 = new ASumar("123456789");
		System.out.println("El resultado de más de un dígito es: " + suma3.mostrar());

	}

}
