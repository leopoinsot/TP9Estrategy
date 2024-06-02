package ejercicio1;

public class Producto {
	private String nombre;
	private double precio;
	private float peso;

	public Producto(String nombre, double precio, float peso) {
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
	}

	public double obtenerPrecio() {
		return precio;
	}

	public float obtenerPeso() {
		return peso;
	}
}
