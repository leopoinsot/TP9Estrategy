package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Empresa {
	protected Destino destino;

	public Empresa(Destino destino) {
		this.destino = destino;
	}

	public double calcularEnvio(){
		return destino.costoFijo();
	}
}
