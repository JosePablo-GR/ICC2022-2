import java.util.Scanner;

	public class Circulo{
	public static void main(String []args){

	System.out.println("Este programa permite calcular el área y volumen de un círculo");

	Scanner in = new Scanner(System.in);

	System.out.println("Ingrese el valor del radio (r): ");

	double r = in.nextDouble();
	double area;
	double volumen;

	System.out.println("");

	area = 4*Math.PI*r*r;
	volumen = (4/3)*Math.PI*r*r;


	if(r<1){
	System.out.println("No se puede calcular con ese valor");
	}else{
	System.out.println("");
	System.out.println("El área del un círculo con radio "+r+"cm es: "+area+" cm2");
	System.out.println("y su volumen es: "+volumen+" cm3");
	}

}

}
