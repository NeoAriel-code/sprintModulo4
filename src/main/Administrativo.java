package main;

public class Administrativo extends Usuario {
	private String area;
	private String experiencia;
	public Administrativo() {
		super();
		
	}// Cierra el constructor vacio Administrativo.
	
	public Administrativo(String nombre, String fecha, int run, String area, String experiencia) {
		super(nombre, fecha, run);
		this.area = area;
		this.experiencia = experiencia;
	} // Cierra el constructor con parametros de Administrativo.
	
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: "+this.getArea() + " \nExperiencia previa: "+this.getExperiencia());
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}
	
	
	
} // Cierra la clase Administrativo.
