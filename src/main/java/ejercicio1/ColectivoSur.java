package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ColectivoSur extends Empresa {
	private float pesoMinimo;
	private float pesoMaximo;
	private double costoPesoMinimo;
	private double costoPesoMaximo;

	private List<Producto> productos = new ArrayList<>();

	public ColectivoSur(Destino destino, float pesoMinimo, float pesoMaximo, double costoPesoMinimo, double costoPesoMaximo, Producto...productos) {
		super(destino);
		this.pesoMinimo = pesoMinimo;
		this.pesoMaximo = pesoMaximo;
		this.costoPesoMinimo = costoPesoMinimo;
		this.costoPesoMaximo = costoPesoMaximo;
		this.productos = List.of(productos);
	}
	public double calcularEnvio(){
		double total = destino.costoFijo();
		if(superoPesoMaximo()){
			return total + costoPesoMaximo;
		}else if(superoPesoMinimo()){
			return total + costoPesoMinimo;
		}
		return total;
	}

	private boolean superoPesoMinimo(){
		if(pesoMinimo < pesoProductos()){
			return true;
		}
		return false;
	}

	private boolean superoPesoMaximo(){
		if(pesoMaximo < pesoProductos()){
			return true;
		}
		return false;
	}

	private float pesoProductos(){
		float pesoTotal = 0;
		for(Producto producto: productos){
			pesoTotal = pesoTotal + producto.obtenerPeso();
		}
		return pesoTotal;
	}
}
