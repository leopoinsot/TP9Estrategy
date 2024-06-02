package ejercicio3;

public class Libro extends Producto{
	public Libro(double precio, CalculadorDePrecio descuento, CalculadorDePrecio impuesto) {
		super(precio, descuento, impuesto);
	}

	@Override
	public double precioFinal() {
		if (precio > 100) {
			envioGratis = true;
		}
		double total = impuesto.calcular(descuento.calcular(precio));
		return envioGratis(total);
	}
}
