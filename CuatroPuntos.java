public class CuatroPuntos {

	public static void main(String[] args) {

		//Coordenadas del punto 1
		double x1 = 1.0;
		double y1 = 2.2;

		//Coordenadas del punto 2
		double x2 = 4.3;
		double y2 = -1.2;

		//Añadimos dos puntos más (P3 y P4)
		//Coordenadas del punto 3
		double x3 = -2.2;
		double y3 = 6.1;

		//Coordenadas del punto 4
		double x4 = -11.5;
		double y4 = -3.8;

		/**
		//Imprimir en qué cuadrante está cada uno de los puntos
		if(x1>0 && y1>0) {
			System.out.println("El punto 1 está en el cuadrante 1");
		} else if(x1<0 && y1>0) {
			System.out.println("El punto 1 está en el cuadrante 2");
		} else if(x1<0 && y1<0) {
			System.out.println("El punto 1 está en el cuadrante 3");
		} else if(x1>0 && y1<0) {
			System.out.println("El punto 1 está en el cuadrante 4");
		} else {
			System.out.println("El punto 1 está en uno de los ejes");
		}


		if(x2>0 && y2>0) {
			System.out.println("El punto 2 está en el cuadrante 1");
		} else if(x2<0 && y2>0) {
			System.out.println("El punto 2 está en el cuadrante 2");
		} else if(x2<0 && y2<0) {
			System.out.println("El punto 2 está en el cuadrante 3");
		} else if(x2>0 && y2<0) {
			System.out.println("El punto 2 está en el cuadrante 4");
		} else {
			System.out.println("El punto 2 está en uno de los ejes");
		}*/


		//Realiza la comparacion de dos puntos P1 (x1,y1) y P2 (x2,y2)
		//double d = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		//System.out.println("La distancia entre los dos puntos es: " + d);

		// Realizamos comparaciones del punto P1 a el P2
		double p1p2 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("Distancia de P1 a P2: "+p1p2);

		// Realizamos comparaciones del punto P1 a el P3
		double p1p3 = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
		System.out.println("Distancia de P1 a P3: "+p1p3);

		// Realizamos comparaciones del punto P1 a el P4
		double p1p4 = Math.sqrt(Math.pow((x4-x1),2) + Math.pow((y4-y1),2));
		System.out.println("Distancia de P1 a P4: "+p1p4);

		// Realizamos comparaciones del punto P2 a el P3
		double p2p3 = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
		System.out.println("Distancia de P2 a P3: "+p2p3);

		// Realizamos comparaciones del punto P2 a el P4
		double p2p4 = Math.sqrt(Math.pow((x4-x2),2) + Math.pow((y4-y2),2));
		System.out.println("Distancia de P2 a P4: "+p2p4);

		// Realizamos comparaciones del punto P3 a el P4
		double p3p4 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
		System.out.println("Distancia de P3 a P4: "+p3p4);

		System.out.println("");

		if((p1p2>p1p3) && (p1p2>p1p4) && (p1p2>p2p3) &&(p1p2>p2p4) && (p1p2>p3p4)){
			System.out.println("La distancia entre P1 y P2 es la más larga de todas, equivale a: "+p1p2);
		}

		if((p1p3>p1p2) && (p1p3>p1p4) && (p1p3>p2p3) &&(p1p3>p2p4) && (p1p3>p3p4)){
			System.out.println("La distancia entre P1 y P3 es la más larga de todas, equivale a: "+p1p3);
		}

		if((p1p4>p1p2) && (p1p4>p1p3) && (p1p4>p2p3) &&(p1p4>p2p4) && (p1p4>p3p4)){
			System.out.println("La distancia entre P1 y P4 es la más larga de todas, equivale a: "+p1p4);
		}

		if((p2p3>p1p2) && (p2p3>p1p3) && (p2p3>p1p4) &&(p2p3>p2p4) && (p2p3>p3p4)){
			System.out.println("La distancia entre P2 y P3 es la más larga de todas, equivale a: "+p2p3);
		}

		if((p2p4>p1p2) && (p2p4>p1p3) && (p2p4>p1p4) &&(p2p4>p2p3) && (p2p4>p3p4)){
			System.out.println("La distancia entre P2 y P4 es la más larga de todas, equivale a: "+p2p4);
		}

		if((p3p4>p1p2) && (p2p4>p1p3) && (p2p4>p1p4) &&(p2p4>p2p3) && (p2p4>p2p4)){
			System.out.println("La distancia entre P3 y P4 es la más larga de todas, equivale a: "+p3p4);
		}

	}

}
