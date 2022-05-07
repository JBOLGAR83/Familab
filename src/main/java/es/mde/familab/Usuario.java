package es.mde.familab;

import java.time.LocalDate;
import java.util.List;

public class Usuario {

	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private List<Analitica>analiticas;

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Analitica> getAnaliticas() {
		return analiticas;
	}

	public void setAnaliticas(List<Analitica> analiticas) {
		this.analiticas = analiticas;
	}

	public Usuario() {

	}

	public Usuario(int dni, String nombre, LocalDate fechaNacimiento, List<Analitica> analiticas) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.analiticas = analiticas;
	}

	

}