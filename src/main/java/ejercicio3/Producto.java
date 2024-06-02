package ejercicio3;

public class Producto {
	protected double precio;
	protected boolean envioGratis;
	protected CalculadorDePrecio descuento;
	protected CalculadorDePrecio impuesto;

	public Producto(double precio, CalculadorDePrecio descuento, CalculadorDePrecio impuesto) {
		this.precio = precio;
		this.envioGratis = false;
		this.descuento = descuento;
		this.impuesto = impuesto;
	}
	public double precioFinal() {
		return 0;
	}

	public double envioGratis(double monto){
		if (envioGratis) {
			monto -= 10;
		}
		return monto;
	}

	/*public double precioFinal() {
		double impuestos = 0;
		double descuentos = 0;



		} else if (tipo == TipoProducto.MEDICINA) {
			impuestos = 0;
		} else {
			impuestos = 0.15;
		}
		return total;
	}*/
}
