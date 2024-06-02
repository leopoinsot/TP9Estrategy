package ejercicio3;

public class Main {
	public static void main(String[] args) {
		var alimento = new Alimento(130, new Descuento(0),new Impuesto(5));
		var libro = new Libro(30,new Descuento(10),new Impuesto(10));
		var medicina = new Medicina(330, new Descuento(0), new Impuesto(0));
		var otroProducto = new OtroProducto(130, new Descuento(0), new Impuesto(15));

		System.out.println(alimento.precioFinal());
		System.out.println(libro.precioFinal());
		System.out.println(medicina.precioFinal());
		System.out.println(otroProducto.precioFinal());
	}
}
