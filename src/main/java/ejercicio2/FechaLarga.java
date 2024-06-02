package ejercicio2;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FechaLarga implements FormatoFecha{
	@Override
	public String cambiarFormato(LocalDate fecha) {
		int day = fecha.getDayOfMonth();
		String month = fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		int year = fecha.getYear();
		return String.format("%d de %s de %d", day, month, year);
	}
}
