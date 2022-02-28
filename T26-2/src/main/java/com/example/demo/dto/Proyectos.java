/**
 * 
 */
package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Fenrir
 *
 */
@Entity
@Table(name="proyecto")
public class Proyectos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="horas")
	private int horas;

	public Proyectos(String id, String nombre, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	public Proyectos() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	

}
