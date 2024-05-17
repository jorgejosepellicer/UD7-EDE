package ex1;

public class Prestamo {
	private double cantidad;
	
	public Prestamo(double cantidad) {
		this.cantidad=cantidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return Double.toString(this.cantidad);
	}
}
//Primera subida