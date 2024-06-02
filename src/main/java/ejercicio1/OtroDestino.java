package ejercicio1;

public class OtroDestino extends Destino{
	private double interes;
	private Distancia distancia;

	public OtroDestino(double precio, Distancia distancia, double interes, Producto...productos) {
		super(precio);
		this.distancia = distancia;
		this.interes  = interes;
	}
	public double costoFijo(){
		return this.precio + interes * 100; //distancia.calcular()
	}
}
