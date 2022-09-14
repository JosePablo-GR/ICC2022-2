	import java.util.Scanner;

	public class Cubo{
	public static void main(String [] args){

	System.out.println("Este programa permite calcular el área y el volumen de un cubo");

	Scanner in = new Scanner(System.in);

	System.out.println("Ingrese la longitud de las aristas (a): ");

	double a = in.nextDouble();
	double area;
	double volumen;


	area = 6*a*a;
	volumen = a*a*a;


	if(a<1){
	System.out.println("No se puede calcular con ese valor");
	}else{
	System.out.println("");
	System.out.println("El área de un cubo con longitud "+a+"cm es: "+area+" cm2");
	System.out.println("y su volumen es: "+volumen+" cm3");
	}


}



}
