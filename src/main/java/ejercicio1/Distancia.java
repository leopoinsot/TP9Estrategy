package ejercicio1;

public class Distancia {
	private Destino destino;
	private OtroDestino ubicacion;

	private ServicioDistancia servicioDistancia;

	public Distancia(ServicioDistancia servicioDistancia, Destino destino, OtroDestino ubicacion) {
		this.servicioDistancia = servicioDistancia;
		this.ubicacion = ubicacion;
		this.destino = destino;
	}

	public double calcular(){
		return servicioDistancia.calcular(ubicacion.nombre(),destino.nombre());
	}
}
