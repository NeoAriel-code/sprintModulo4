package main;

import java.time.LocalTime;

public class Capacitacion {

	private int idCapacitacion;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int asistentes;
	
	public Capacitacion() {
	} // Cierra el constructor vacio de la clase Capacitacion;

	public Capacitacion(int idCapacitacion, int rutCliente, String dia, String hora, String lugar,
			String duracion, int asistentes) {
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.asistentes = asistentes;
	}

	// Getters and Setter de la Clase Capacitacion;
	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}
	
	public void mostrarDetalle() {
		System.out.println("La capacitación será en "+ this.getLugar()+ " a las "+ this.getHora()+ " Hrs" +" del día "+ this.getDia() + " y durará " + this.getDuracion() + " minutos");
		
	}

	// Metodo toString() de la Clase Capacitacion.
	@Override
	public String toString() {
		return "Datos de la capacitación: \nID: "+ idCapacitacion + "\nRut cliente: "+rutCliente + "\nDía de la capacitación: "+dia+ "\nHora: "+hora+ "\nLugar: "+lugar+ "\nDuración capacitación: "+duracion+ "\nCantidad de asistentes: "+asistentes+" Asistentes";
	}

} // Cierra la clase Capacitacion.
