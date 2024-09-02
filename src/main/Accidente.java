package main;

import java.time.LocalTime;

public class Accidente {
	
	private int idAccidente;
	private String rutCliente;
	private String dia;
	private LocalTime hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	public Accidente() {
		super();
	} // Cierra el constructor vacio de la clase Accidente.

	public Accidente(int idAccidente, String rutCliente, String dia, LocalTime hora, String lugar, String origen,
			String consecuencias) {
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	} // Cierra el constructor con parametros de la clase Accidente.
	
	// Getters and Setter de la clase Accidente.
	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	// Metodo toString() de la clase Accidente.
	@Override
	public String toString() {
		return "Datos del accidente: \nID del accidente: "+idAccidente + "\nDía del accidente: "+dia+ "\nHora del accidente: "+hora+ "\nLugar del accidente: "+lugar+ "\nOrigen del accidente: "+origen+ "\nConsecuencias del accidente: "+consecuencias;
	}
	
	
} // Cierra la clase Accidente.
