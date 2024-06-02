package ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

	@Test
	void costoTotalEnvioCorreoArgentino() {
		var cliente = new Cliente("452609897","leonel");
		var producto = new Producto("cocacola",500,4f);
		var destino = new CapitalFederal(500);
		var correoArgentino = new CorreoArgentino(destino);
		var carrito = new Carrito(cliente,producto);
		carrito.agregarEmpresa(correoArgentino);
		assertEquals(1000,carrito.costoTotal());
	}

	@Test
	void costoTotalEnvioColectivoSur() {
		var cliente = new Cliente("452609897","leonel");
		var producto = new Producto("cocacola",500,31f);
		var destino = new CapitalFederal(1000);
		var carrito = new Carrito(cliente,producto);
		var colectivoSur = new ColectivoSur(destino,5f,30f,500,2000,producto);
		carrito.agregarEmpresa(colectivoSur);
		assertEquals(3500,carrito.costoTotal());
	}
}