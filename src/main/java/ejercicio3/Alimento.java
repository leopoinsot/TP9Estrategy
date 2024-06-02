package ejercicio3;

public class Alimento extends Producto{
	public Alimento(double precio, CalculadorDePrecio descuento, CalculadorDePrecio impuesto) {
		super(precio, descuento, impuesto);
	}

	@Override
	public double precioFinal() {
		if (precio > 200) {
			envioGratis = true;
		}
		if (precio > 100) {
			descuento = new Descuento(0.15);
		}
		double total = impuesto.calcular(descuento.calcular(precio));
		return envioGratis(total);
	}
}
