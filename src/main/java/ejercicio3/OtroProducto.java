package ejercicio3;

public class OtroProducto extends Producto{
	public OtroProducto(double precio, CalculadorDePrecio descuento, CalculadorDePrecio impuesto) {
		super(precio, descuento, impuesto);
	}

	@Override
	public double precioFinal() {
		if (precio > 200) {
			envioGratis = true;
		}
		if (precio > 50) {
			descuento = new Descuento(0.05);
		}
		double total = impuesto.calcular(descuento.calcular(precio));
		return envioGratis(total);
	}
}
