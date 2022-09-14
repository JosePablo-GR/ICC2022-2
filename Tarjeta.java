 	import java.util.Scanner;

	public class Tarjeta{

	public static void main(String []args){


	System.out.println("Este programa sirve como una tarjeta de presentación: ");
	System.out.println("Por favor ingresa tu nombre completo, seguido de tu correo, número telefónico y edad");

	Scanner in = new Scanner(System.in);

	long numero;

	String nombre = in.nextLine();
	String correo = in.nextLine();
	int edad = in.nextInt();
	numero = in.nextLong();

	System.out.println("");
	System.out.println("Gracias, tu tarjeta quedó de la siguiente manera: ");
	System.out.println("");

	System.out.println("Nombre completo: "+nombre);
	System.out.println("Correo: "+correo);
	System.out.println("Edad: "+edad+" años");
	System.out.println("Número telefónico: "+numero);
	System.out.println("");
	System.out.println("Fin del programa.");




}

}
