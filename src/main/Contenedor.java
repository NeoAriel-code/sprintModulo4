package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contenedor {
	private Scanner scanner =  new Scanner(System.in);
	private int run,rut,telefono,salud,edad,idCap,asistentes,rutCliente,op;
	private String dia,hora,lugar,duracion,fecha,nombre, nombres,apellidos,afp,direccion,comuna,titulo,fechaIngreso,area,experiencia;
	private boolean res;
	private Usuario u;
	private Profesional p;
	private Capacitacion cap;
	private Cliente cli;
	private Administrativo adm;
	
	private ArrayList<Iasesoria> listaAsesorias = new ArrayList<Iasesoria>();
	private ArrayList<Capacitacion> listaCapacitaciones = new ArrayList<Capacitacion>();
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private List<Profesional> listaProfesional = new ArrayList<Profesional>();
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	private List<Administrativo> listaAdministrativo = new ArrayList<Administrativo>();
	
	public void addUsuario (Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
	public void analizar() {
		for (Usuario usuario : listaUsuarios) {
			usuario.analizarUsuario();
		}
	}
	
	public void menu() {
		System.out.println("\nMenú");
		System.out.println("1. Almacenar Cliente");
		System.out.println("2. Almacenar Profesional");
		System.out.println("3. Almacenar Administrativo");
		System.out.println("4. Almacenar Capacitación");
		System.out.println("5. Eliminar Usuario");
		System.out.println("6. Listar Usuarios");
		System.out.println("7. Listar Usuarios por tipo");
		System.out.println("8. Listar Capacitaciones");
		System.out.println("9. Salir.");
		System.out.println("\nIngrese una opción:");
		op = scanner.nextInt();
		scanner.nextLine();
		
		switch (op) {
		case 1:
			almacenarCliente();
			break;
		case 2:
			almacenarProfesional();
			break;
		case 3:
			almacenarAdministrativo();
			break;
		case 4:
			almacenarCapacitacion();
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			listarCapacitaciones();
			break;
		case 9:
			salir();
			break;
		default: errorOpcion();
			break;
		}
	} // Cierra el metodo menu.
	
	private void almacenarCliente() {
		do {
			System.out.println("\nIngrese el nombre de Usuario: ");
			nombre = scanner.nextLine();
			if (nombre.length()<10 || nombre.length()>50) {
				System.out.println("\nError. El nombre debe tener mínimo 10 caracteres, máximo 50");
			}
		} while (nombre.length()<10 || nombre.length()>50);
		
		do {
			System.out.println("\nIngrese la fecha de nacimiento: (El formato debe ser DD/MM/AAAA)");
			fecha = scanner.nextLine();
			if (fecha.length()<1) {
				System.out.println("\nError.La fecha de nacimiento es obligatoria.");
			} 
		} while (fecha.length()<1);
		
		do {
			System.out.println("\n Ingrese el RUN del usuario: ");
			run = scanner.nextInt();
			scanner.nextLine();
			if (run > 99999999) {
				System.out.println("\nError.El RUN debe ser menor a 99.999.999");
			}
		} while (run > 99999999);
		
		do {
			System.out.println("\n Ingrese el RUT del usuario: ");
			rut = scanner.nextInt();
			scanner.nextLine();
			if (rut > 99999999) {
				System.out.println("\nError.El RUT debe ser menor a 99.999.999");
			}
		} while (rut > 99999999);
		
		do {
			System.out.println("\nIngrese los nombres del cliente: ");
			nombres = scanner.nextLine();
			if (nombres.length()<5 || nombres.length()>30) {
				System.out.println("\nError. Los nombres debe tener mínimo 5 caracteres, máximo 30");
			}
		} while (nombres.length()<5 || nombres.length()>30);
		
		do {
			System.out.println("\nIngrese los apellidos del cliente: ");
			apellidos = scanner.nextLine();
			if (apellidos.length()<5 || apellidos.length()>30) {
				System.out.println("\nError. Los apellidos debe tener mínimo 5 caracteres, máximo 30");
			}
		} while (apellidos.length()<5 || apellidos.length()>30);
		
		do {
			System.out.println("\nIngrese el teléfono del cliente: ");
			telefono = scanner.nextInt();
			scanner.nextLine();
			if (telefono<1) {
				System.out.println("\nError.El teléfono es obligatorio.");
			} 
		} while (telefono<1);
		
		do {
			System.out.println("\nIngrese la AFP del cliente: ");
			afp = scanner.nextLine();
			if (afp.length()<4 || afp.length()>30) {
				System.out.println("\nError. La AFP ingresada debe tener mínimo 4 caracteres, máximo 30");
			}
		} while (afp.length()<4 || afp.length()>30);
		
		
		do {
			System.out.println("\nIngrese el sistema de salud del cliente: 1(Fonasa) o 2(Isapre)");
			salud = scanner.nextInt();
			scanner.nextLine();
			if (salud != 1 && salud != 2) {
				System.out.println("\nError. El sistema de salud debe ser una de las dos opciones. ");
			}
		} while (salud != 1 && salud != 2);
		
		do {
			System.out.println("\nIngrese la dirección del cliente: ");
			direccion = scanner.nextLine();
			if (direccion.length()<1 || direccion.length()>70) {
				System.out.println("\nError. La dirección debe tener máximo 70 caracteres");
			}
		} while (direccion.length()<1 || direccion.length()>70);
		
		do {
			System.out.println("\nIngrese la comuna del cliente: ");
			comuna = scanner.nextLine();
			if (comuna.length()<1 || comuna.length()>50) {
				System.out.println("\nError. La comuna debe tener máximo 50 caracteres");
			}
		} while (comuna.length()<1 || comuna.length()>50);
		
		do {
			System.out.println("\n Ingrese la edad del cliente: ");
			edad = scanner.nextInt();
			scanner.nextLine();
			if (edad <= 0 || edad >150) {
				System.out.println("\nError.La edad debe ser un número mayor o igual a cero, y menor a 150. años.");
			}
		} while (edad <= 0 || edad >150);
		
		cli = new Cliente();
		cli.setNombre(nombre);
		cli.setFecha(fecha);
		cli.setRun(run);
		cli.setNombres(nombres);
		cli.setApellidos(apellidos);
		cli.setTelefono(telefono);
		cli.setAfp(afp);
		cli.setSalud(salud);
		cli.setDireccion(direccion);
		cli.setComuna(comuna);
		cli.setEdad(edad);
		listaCliente.add(cli);
		menu();
	} // Cierra el metodo almacenarCliente.
	
	private void almacenarProfesional() {
		do {
			System.out.println("\nIngrese el nombre de Usuario: ");
			nombre = scanner.nextLine();
			if (nombre.length()<10 || nombre.length()>50) {
				System.out.println("\nError. El nombre debe tener mínimo 10 caracteres, máximo 50");
			}
		} while (nombre.length()<10 || nombre.length()>50);
		
		do {
			System.out.println("\nIngrese la fecha de nacimiento: (El formato debe ser DD/MM/AAAA)");
			fecha = scanner.nextLine();
			if (fecha.length()<1) {
				System.out.println("\nError.La fecha de nacimiento es obligatoria.");
			} 
		} while (fecha.length()<1);
		
		do {
			System.out.println("\n Ingrese el RUN del usuario: ");
			run = scanner.nextInt();
			scanner.nextLine();
			if (run > 99999999) {
				System.out.println("\nError.El RUN debe ser menor a 99.999.999");
			}
		} while (run > 99999999);
		
		do {
			System.out.println("Ingrese el título del profesional: ");
			titulo = scanner.nextLine();
			if (titulo.length()<10 || titulo.length()>50) {
				System.out.println("\nError. El título debe tener mínimo 10 caracteres, máximo 50");
			}
		} while (titulo.length()<10 || titulo.length()>50);
		
		do {
			System.out.println("\nIngrese la fecha de ingreso del profesional: (El formato debe ser DD/MM/AAAA)");
			fechaIngreso = scanner.nextLine();
			if (fechaIngreso.length()<1) {
				System.out.println("\nError.La fecha de ingreso es obligatoria.");
			} 
		} while (fechaIngreso.length()<1);
		
		p = new Profesional();
		p.setNombre(nombre);
		p.setFecha(fecha);
		p.setRun(run);
		p.setTitulo(titulo);
		p.setFechaIngreso(fechaIngreso);
		listaProfesional.add(p);
		menu();
			
	} // Cierra el metodo almacenarProfesional.
	
	private void almacenarAdministrativo() {
		do {
			System.out.println("\nIngrese el nombre de Usuario: ");
			nombre = scanner.nextLine();
			if (nombre.length()<10 || nombre.length()>50) {
				System.out.println("\nError. El nombre debe tener mínimo 10 caracteres, máximo 50");
			}
		} while (nombre.length()<10 || nombre.length()>50);
		
		do {
			System.out.println("\nIngrese la fecha de nacimiento: (El formato debe ser DD/MM/AAAA)");
			fecha = scanner.nextLine();
			if (fecha.length()<1) {
				System.out.println("\nError.La fecha de nacimiento es obligatoria.");
			} 
		} while (fecha.length()<1);
		
		do {
			System.out.println("\n Ingrese el RUN del usuario: ");
			run = scanner.nextInt();
			scanner.nextLine();
			if (run > 99999999) {
				System.out.println("\nError.El RUN debe ser menor a 99.999.999");
			}
		} while (run > 99999999);
		
		do {
			System.out.println("\nIngrese el área del administrativo: ");
			area = scanner.nextLine();
			if (area.length()<5 || area.length()<20 ) {
				System.out.println("\nError.El campo área es obligatorio y debe tener un mínimo de 5 caracteres, y un máximo de 20.");
			} 
		} while (area.length()<5 || area.length()<20);
		
		do {
			System.out.println("\nIngrese la experiencia previa del administrativo: ");
			experiencia = scanner.nextLine();
			if (experiencia.length()<1 || experiencia.length()>100 ) {
				System.out.println("\nError.El campo experiencia previa debe tener un máximo de 100 caracteres.");
			} 
		} while (experiencia.length()<1 || experiencia.length()>100);
		
		adm = new Administrativo();
		adm.setNombre(nombre);
		adm.setFecha(fecha);
		adm.setRun(run);
		adm.setArea(area);
		adm.setExperiencia(experiencia);
		listaAdministrativo.add(adm);
		menu();
		
	} // Cierra el metodo almacenarAdministrativo.
	
	private void almacenarCapacitacion() {
		do {
			System.out.println("\nIngrese el identificador de la capacitación: ");
			idCap = scanner.nextInt();
			res = false;
				for (int i = 0; i < listaCapacitaciones.size(); i++) {
					cap = listaCapacitaciones.get(i);
					if (idCap == cap.getIdCapacitacion()) {
						res = true;
						System.out.println("\nError.El identificador" + idCap + "ya existe.");
						break;
					}
				}
		} while (res);
		
		do {
			System.out.println("\nIngrese el rut del cliente: ");
			rutCliente = scanner.nextInt();
			scanner.nextLine();
			if (rutCliente<8) {
				System.out.println("\nError.El rut del cliente es obligatorio.");
			} 
		} while (rutCliente<8);
		
		do {
			System.out.println("\nIngrese el día en el que se realizará de la capacitación: ");
			dia = scanner.nextLine();
			if (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves") && !dia.equals("viernes") && !dia.equals("sabado") && !dia.equals("domingo")) {
				System.out.println("\nError.El día ingresado debe ser entre lunes a domingo.");
			} 
		} while (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves") && !dia.equals("viernes") && !dia.equals("sabado") && !dia.equals("domingo"));
		
		do {
			System.out.println("Ingrese la hora en la que se realizará la capacitación: (El formato debe ser HH:MM)");
			hora = scanner.nextLine();
			if (!hora.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
				System.out.println("Error.La hora ingresada debe ser entre las 00:00 y 23:59.");
			}
		} while (!hora.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$"));
		
		do {
			System.out.println("Ingrese el lugar donde se realizará la capacitación: ");
			lugar = scanner.nextLine();
			if (lugar.length()<10 || lugar.length()>50) {
				System.out.println("\nError. El lugar debe tener mínimo 10 caracteres, máximo 50");
			}
		} while (lugar.length()<10 || lugar.length()>50);
		
		do {
			System.out.println("Ingrese la duración de la capacitación: ");
			duracion = scanner.nextLine();
			if (duracion.length()>70) {
				System.out.println("\nError. la duración debe tener un máximo 70 caracteres.");
			}
		} while (duracion.length()>70);
		
		do {
			System.out.println("\nIngrese la cantidad de asistentes: ");
			asistentes = scanner.nextInt();
			if (asistentes>1000) {
				System.out.println("\nError.La cantidad de asistentes debe ser menor a 1000.");
			} 
		} while (asistentes>1000);
		
		cap = new Capacitacion();
		cap.setIdCapacitacion(idCap);
		cap.setRutCliente(rutCliente);
		cap.setDia(dia);
		cap.setHora(hora);
		cap.setLugar(lugar);
		cap.setDuracion(duracion);
		cap.setAsistentes(asistentes);
		listaCapacitaciones.add(cap);
		menu();
	} // Cierra el metodo almacenarCapacitacion.
	
	
	private void listarCapacitaciones() {
		if (listaCapacitaciones.isEmpty()) {
			System.out.println("Error. No hay capacitaciones registradas para listar.");
		} else {
			System.out.println("\nListado de capacitaciones: ");
			for (int i = 0; i < listaCapacitaciones.size(); i++) {
				cap = listaCapacitaciones.get(i);
				System.out.println("Identificador: " + cap.getIdCapacitacion());
				System.out.println("Rut cliente: " + cap.getRutCliente());
				System.out.println("Dia: " + cap.getDia());
				System.out.println("Hora: " + cap.getDia());
				System.out.println("Lugar: " + cap.getLugar());
				System.out.println("Duración: " + cap.getDuracion());
				System.out.println("Cantidad de asistentes: " + cap.getAsistentes());
			}
		}
		menu();
	} // Cierra el metodo listarCapacitaciones.
	
	private void salir() {
		System.out.println("\nSaliendo..");
		System.exit(0);
	} // Cierra el metodo salir
	
	private void errorOpcion() {
		System.out.println("\nOpción inválida.");
		menu();
	} // Cierra el metodo errorOpcion.
	
	
} // Cierra la clase Contenedor.
