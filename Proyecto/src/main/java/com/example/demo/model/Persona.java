package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import com.sun.istack.NotNull;

@Entity
@Table (name = "persona")
public class Persona {
	
	@Id
	
	private Long identificacion;
	@NotNull

	private String nombre;
	private String genero;
	private String estadocivil;
	private String fechanacimiento;
	private String telefono;
	private String direccion;
	private String email;
	
	
	
	
	public Persona () {
		
	}




	public Persona(Long identificacion, String nombre, String genero, String estadocivil, String fechanacimiento,
			String telefono, String direccion, String email) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.genero = genero;
		this.estadocivil = estadocivil;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}




	public Long getIdentificacion() {
		return identificacion;
	}




	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getGenero() {
		return genero;
	}




	public void setGenero(String genero) {
		this.genero = genero;
	}




	public String getEstadocivil() {
		return estadocivil;
	}




	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}




	public String getFechanacimiento() {
		return fechanacimiento;
	}




	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
		
}