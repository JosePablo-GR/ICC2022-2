public class Alumno{

	String facultad;
	String nombreAlumno;
	int numeroCta;
	boolean inscrito;
	double promedio;

	// Método constructor de un alumno: "Construye una instancia del tipo de la clase" (en este caso es del tipo Alumno)
	public Alumno(String facultad, String nombreAlumno, int numeroCta, boolean inscrito, double promedio){
		this.facultad = facultad;
		this.nombreAlumno = nombreAlumno;
		this.numeroCta = numeroCta;
		this.inscrito = inscrito;
		this.promedio = promedio;
	}

	/* Métodos de acceso */
	public String getFacultad(){
		return this.facultad;
	}

	public String getNombreAlumno(){
		return this.nombreAlumno;
	}

	public int getNumeroCta(){
		return this.numeroCta;
	}

	public boolean getInscrito(){
		return this.inscrito;
	}

	public double getPromedio(){
		return this.promedio;
	}

	public String toString(){
		return "NombreAlumno: " + this.nombreAlumno
				+"\nFacultad: " + this.facultad
				+"\nNúmero de Cuenta: "+this.numeroCta
				+"\n¿Está inscrito?: "+this.inscrito
				+"\nPromedio: "+this.promedio;
	}

	/* Metodos mutantes */

	public void setFacultad(String nuevafacultad){
		this.facultad = nuevafacultad;
	} 

	public void setInscrito(boolean nuevoEstado){
		this.inscrito = nuevoEstado;
	} 

	public void setPromedio(double promedio){
		this.promedio = promedio;
	}

	public void setNombreAlumno(String nombreAlumno){
		this.nombreAlumno = nombreAlumno;

	}

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Ciencias","Pablo",987654320,false,9.1);
		Alumno a2 = new Alumno("Ingeniería","Ximena",1234,true,8.6);
		
		a1.setPromedio(10);
		a2.setPromedio(10);
		a2.setInscrito(false);
		a2.setNombreAlumno("Pablo");


		// Obtener los promedios y estados de tus alumnos (y guardarlos en variables)
		double promedioA1 = a1.getPromedio();
		double promedioA2 = a2.getPromedio();

		boolean estadoA1 = a1.getInscrito();
		boolean estadoA2 = a2.getInscrito();

		String nombreA1 = a1.getNombreAlumno();
		String nombreA2 = a2.getNombreAlumno();

	







		System.out.println("\n-Ejemplo Promedios:\n");
		if(promedioA1 == promedioA2){
			System.out.println("Promedios iguales");
		}else{
			System.out.println("Promedios diferentes");
		}


		System.out.println("\n-Ejemplo Estados:\n");
		if(estadoA1 == estadoA2){
			System.out.println("Estados iguales");
		}else{
			System.out.println("Estados diferentes");
		}


		System.out.println("\n-Ejemplo Nombres:\n");
		if(nombreA1.equals(nombreA2)){
			System.out.println("Nombres iguales");
		}else{
			System.out.println("Nombres diferentes");
		}



		/*
		//System.out.println("El alumno "+a1.getNombreAlumno()+" es de la facultad de "+a1.getFacultad()+" con número de cuenta: "+a1.getNumeroCta());
		System.out.println("ANTES: \n");
		System.out.println(a1);
		System.out.println();	

		System.out.println(a2);


		System.out.println("------------------------------------\n");
		System.out.println("DESPUES:");
		a1.setInscrito(true);
		a1.setFacultad("Contaduría");
		System.out.println(a1);
		

		a2.setInscrito(false);
		a2.setPromedio(9.6);

		System.out.println();
		System.out.println(a2);
		
		*/
		
	


		

	}


}