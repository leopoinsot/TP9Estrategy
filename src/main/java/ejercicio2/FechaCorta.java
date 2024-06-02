package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaCorta implements FormatoFecha{
	@Override
	public String cambiarFormato(LocalDate fecha) {
		DateTimeFormatter formatterCorto = DateTimeFormatter.ofPattern("d-MM-yyyy");
		return fecha.format(formatterCorto);
	}
}
