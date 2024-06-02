package ejercicio2;

import java.time.LocalDate;

public class Persona {
	private LocalDate fechaDeNacimiento;

	public Persona(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String cambiarFormato(FormatoFecha formatoFecha){
		return formatoFecha.cambiarFormato(fechaDeNacimiento);
	}
}
