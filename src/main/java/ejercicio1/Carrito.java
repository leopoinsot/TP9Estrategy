package ejercicio1;

import java.util.List;

public class Carrito {
	private Cliente cliente;
	private List<Producto> productos;

	private Empresa empresa;

	public Carrito(Cliente cliente,Producto... productos) {
		this.cliente = cliente;
		this.productos = List.of(productos);
	}

	public double costoTotal(){
		if(empresa != null){
			double total = 0;
			for(Producto producto: productos){
				total = total + producto.obtenerPrecio();
			}
			return total + empresa.calcularEnvio();
		}
		throw new RuntimeException("Agregar empresa de transporte");
	}

	public void agregarEmpresa(Empresa empresa){
		this.empresa = empresa;
	}
}
