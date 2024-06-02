package ejercicio1;

public abstract class Destino {
	protected double precio;

	public Destino(double precio) {
		this.precio = precio;
	}
	public double costoFijo(){
		return precio;
	}

	public String nombre(){
		return "";
	}
}
