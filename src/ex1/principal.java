package ex1;

//Programa main
public class Principal {
	
	public static void main(String[] args) {
		
		Profesor profe = new Profesor("Vicent", 21, "695263711");
		
		profe.printInformacioPersonal();
		
		Prestamo p=new Prestamo(5000);
		profe.añadirPrestamo(p);
		
		profe.printListaPrestamos();
	}

}
