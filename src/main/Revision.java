package main;

public class Revision {
	
	private int idRevision;
	private int idVisita;
	private String nombre;
	private String detalle;
	private int estado;
	
	public Revision() {
	} // Cierra el constructor vacio de clase Revision.

	public Revision(int idRevision, int idVisita, String nombre, String detalle, int estado) {
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombre = nombre;
		this.detalle = detalle;
		this.estado = estado;
	} // Cierra el constructor con parametros de la clase Revision.
	
	// Getters and Setters de la clase Revision.
	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	// Metodo toString() de la clase Revision.
	@Override
	public String toString() {
		return "Información de la revisión: \nID de la revisión: "+idRevision + "\nID de la visita en terreno: "+ idVisita+ "\nNombre alusivo: "+ nombre+ "\nEstado: "+ estado;
	}
	
} // Cierra la clase Revision.
