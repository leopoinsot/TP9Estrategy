package ejercicio3;

public class Descuento implements CalculadorDePrecio{

	private double porcentaje;

	public Descuento(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public double calcular(double monto) {
		return monto - (porcentaje/100) * monto;
	}

}
