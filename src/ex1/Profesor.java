package ex1;

import java.util.ArrayList;
import java.util.List;
import ex1.Persona;

public class Profesor extends Persona {
	
	private String nombre;
	private int edad;
	private List<Prestamo> prestamos;
	
	//Constructor heredado
	public Profesor(String nombre, int edad, String nTelefono) {
		super(nTelefono);
		this.nombre = nombre;
		this.edad = edad;
		prestamos=new ArrayList<Prestamo>();
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//----------------
	
	public void printInformacioPersonal() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Telefono: " + nTelefono);
		
	}
	
	public void añadirPrestamo(Prestamo p) {
		prestamos.add(p);
	}
	
	public void printListaPrestamos() {
		
		for (Prestamo p: prestamos) {
			System.out.println(p);
		}
	}

}
