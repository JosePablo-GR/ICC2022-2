import java.util.Scanner;

public class Divisa{
public static void main(String []args){

Scanner in = new Scanner(System.in);

System.out.println("BIENVENIDO A LA CASA DE CAMBIO");
System.out.println("Selecciona una de las siguientes opciones: ");
System.out.println("1. Realizar compra de divisas");
System.out.println("2. Realizar venta de divisas");

System.out.println("");

	int op = in.nextInt();

System.out.println("");

	if(op == 1){

System.out.println("Seleccione la moneda que desea adquirir");
System.out.println("1. Dólar estadounidense");
System.out.println("2. Dólar canadiense");
System.out.println("3. Euro");
System.out.println("4. Yen japonés");

System.out.println("");

	int seleccion = in.nextInt();
	double dusa = 20.66;
	double dcad = 16.29;
	double euro = 22.85;
	double yen = 0.18;


System.out.println("");

	if(seleccion == 1){
		System.out.println("Por favor escriba solamente la cantidad de pesos mexicanos de los que dispone: ");
		double mActual = in.nextDouble();
		System.out.println("");


		System.out.println("Usted digitó: $"+mActual);

		double mCambio = mActual/dusa;

			if(mActual < dusa){
			System.out.println("y no es el mínimo requerido, lo sentimos no puede hacer su compra");
			}else{
			System.out.println("y son equivalentes a: "+mCambio+" dólares estadounidenses");
			}


}

	if(seleccion == 2){
		System.out.println("Por favor escriba solamente la cantidad de pesos mexicanos de los que dispone: ");
		double mActual = in.nextDouble();
		System.out.println("");


		System.out.println("Usted digitó: $"+mActual);

		double mCambio = mActual/dcad;

			if(mActual < dcad){
			System.out.println("y no es el mínimo requerido, lo sentimos no puede hacer su compra");
			}else{
			System.out.println("y son equivalentes a: "+mCambio+" dólares canadienses");
			}

}

	if(seleccion == 3){
		System.out.println("Por favor escriba solamente la cantidad de pesos mexicanos de los que dispone: ");
		double mActual = in.nextDouble();
		System.out.println("");


		System.out.println("Usted digitó: $"+mActual);

		double mCambio = mActual/euro;

			if(mActual < euro){
			System.out.println("y no es el mínimo requerido, lo sentimos no puede hacer su compra");
			}else{
			System.out.println("y son equivalentes a: "+mCambio+" euros");
			}

}

		if(seleccion == 4){
			System.out.println("Por favor escriba solamente la cantidad de pesos mexicanos de los que dispone: ");
			double mActual = in.nextDouble();
			System.out.println("");


			System.out.println("Usted digitó: $"+mActual);

			double mCambio = mActual/yen;

			if(mActual < yen){
			System.out.println("y no es el mínimo requerido, lo sentimos no puede hacer su compra");
			}else{
			System.out.println("y son equivalentes a: "+mCambio+" yens");
			}


}



		if(seleccion<1 || seleccion>4){
		System.out.println("La opción no es válida, por favor intente de nuevo");
}


	} if (op == 2){

System.out.println("Selecciona la moneda que tienes disponible para vender:");
System.out.println("5. Dólar estadounidense");
System.out.println("6. Dólar canadiense");
System.out.println("7. Euro");
System.out.println("8. Yen japonés");

System.out.println("");

	int seleccion = in.nextInt();
	double dusa = 20.10;
	double dcad = 16;
	double euro = 22.55;
	double yen = 0.10;

System.out.println("");

	if(seleccion == 5){
		System.out.println("Escribe la cantidad que tienes de esa moneda");
		double mActual = in.nextDouble();
		System.out.println("");

		double mCambio = mActual*dusa;


			if(mActual>=1){
			System.out.println("Tus "+mActual+" dólares estadounidenses son equivalentes a $"+mCambio);
			}else{
			System.out.println("Lo sentimos, la cantidad registrada no es válida");
			}

} //if5

	if(seleccion==6){
		System.out.println("Escribe la cantidad que tienes de esa moneda");
		double mActual = in.nextDouble();
		System.out.println("");

		double mCambio = mActual*dcad;

			if(mActual>=1){
			System.out.println("Tus "+mActual+" dólares caadienses son equivalentes a $"+mCambio);
			}else{
			System.out.println("Lo sentimos, la cantidad registrada no es válida");
			}

}//if6

	if(seleccion==7){
		System.out.println("Escribe la cantidad que tienes de esa moneda");
		double mActual = in.nextDouble();
		System.out.println("");

		double mCambio = mActual*euro;

			if(mActual>=1){
			System.out.println("Tus "+mActual+" euros son equivalentes a $"+mCambio);
			}else{
			System.out.println("Lo sentimos, la cantidad registrada no es válida");
			}

}//if7

	if(seleccion==8){
		System.out.println("Escribe la cantidad que tienes de esa moneda");
		double mActual = in.nextDouble();
		System.out.println("");

		double mCambio = mActual*yen;

			if(mActual>=1){
			System.out.println("Tus "+mActual+" yens son equivalentes a $"+mCambio);
			}else{
			System.out.println("Lo sentimos, la cantidad registrada no es válida");
			}
}//if8



		if(seleccion<5 || seleccion>8){
		System.out.println("La opción no es válida, por favor intente de nuevoo");
		}


} //if final

	if (op<1 || op>2){
        System.out.println("La opción no es válida, por favor intente de nuevo");
        }


}
}
