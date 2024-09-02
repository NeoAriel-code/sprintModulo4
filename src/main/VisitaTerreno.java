package main;

import java.time.LocalTime;

public class VisitaTerreno {

	private int idVisita;
	private String rutCliente;
	private String dia;
	private LocalTime hora;
	private String lugar;
	private String comentario;
	
	
	public VisitaTerreno() {
		
	} // Cierra el constructor vacio de la clase VisitaTerreno.


	public VisitaTerreno(int idVisita, String rutCliente, String dia, LocalTime hora, String lugar, String comentario) {
		super();
		this.idVisita = idVisita;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentario = comentario;
	} // Cierra el constructor con parametros de la clase VisitaTerreno.


	// Getters and Setters de la clase VisitaTerreno.
	public int getIdVisita() {
		return idVisita;
	}


	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
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


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	//  Metodo toString() de la clase VisitaTerreno.
	@Override
	public String toString() {
		return "Información de la visita en terreno: \nID de la visita: "+ idVisita + "\nRut Cliente: "+rutCliente+ "\nDía de la visita: "+dia+ "\nHora de la visita: "+hora+ "\nLugar visita: "+lugar+ "\nComentarios visita: "+comentario;
	}
	
	
} // Cierra la clase VisitaTerreno.

