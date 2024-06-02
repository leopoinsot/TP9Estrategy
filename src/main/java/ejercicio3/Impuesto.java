package ejercicio3;

public class Impuesto implements CalculadorDePrecio{
	private double porcentaje;

	public Impuesto(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public double calcular(double monto) {
		return monto + (monto * (porcentaje / 100));
	}
}
