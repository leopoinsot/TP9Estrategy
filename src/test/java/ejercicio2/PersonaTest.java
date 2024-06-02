package ejercicio2;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

	@Test
	void fechaDeNacimientoCorta() {
		var persona = new Persona(LocalDate.now().minusDays(2));
		var formatoFechaCorta = new FechaCorta(){
			@Override
			public String cambiarFormato(LocalDate fecha) {
				return "3-06-1986";
			}
		};
		assertEquals("3-06-1986",persona.cambiarFormato(formatoFechaCorta));
	}

	@Test
	void fechaDeNacimientoLargo() {
		var persona = new Persona(LocalDate.now().minusDays(2));
		var formatoFechaLargo = new FechaLarga(){
			@Override
			public String cambiarFormato(LocalDate fecha) {
				return "3 de Junio de 1986";
			}
		};
		assertEquals("3 de Junio de 1986",persona.cambiarFormato(formatoFechaLargo));
	}
}