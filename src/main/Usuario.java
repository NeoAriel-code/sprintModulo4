package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario implements Iasesoria {

	private String nombre;
	private String fecha;
	private int run;
	
	public Usuario() {
	} // Cierra el constructor vacio de la clase Usuario.



	public Usuario(String nombre, String fecha, int run) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.run = run;
	} // Cierra el constructor con parametros de la clase Usuario.


	@Override public void analizarUsuario() {
		System.out.println("Nombre de usuario: " +this.getNombre());
	}

	// Getters and Setters de la clase Usuario.
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public int getRun() {
		return run;
	}



	public void setRun(int run) {
		this.run = run;
	}
	
	public int mostrarEdad() {
		 LocalDate dateNow = LocalDate.now();
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 String formattedDate = dateNow.format(myFormatObj);
		 String stringDate = formattedDate.toString();
		 String[] dateString = stringDate.split("-");
		 String[] userDateString = fecha.split("-");
		 int yDateInt = Integer.parseInt(dateString[2]);
		 int uDateInt = Integer.parseInt(userDateString[2]);
		 
		 return yDateInt-uDateInt ;
	 } // Cierra el metodo mostrarEdad de la clase Usuario.

	// Metodo toString() de la clase Usuario.
	@Override
	public String toString() {
		return "Datos del usuario: \nNombre: " + nombre + "\nFecha de nacimiento: " + fecha+ "\nRut: " + run  ;
	}
	
	
} // Cierra la clase Usuario.

