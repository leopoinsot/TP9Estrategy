package ejercicio3;

public class Medicina extends Producto{

	public Medicina(double precio, CalculadorDePrecio descuento, CalculadorDePrecio impuesto) {
		super(precio, descuento, impuesto);
	}

	@Override
	public double precioFinal() {
		if (precio > 100) {
			envioGratis = true;
		}
		if (precio > 50) {
			descuento = new Descuento(0.1);
		}
		double total = impuesto.calcular(descuento.calcular(precio));
		return envioGratis(total);
	}
}
