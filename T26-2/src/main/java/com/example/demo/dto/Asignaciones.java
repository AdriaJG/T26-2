/**
 * 
 */
package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author Fenrir
 *
 */
@Entity
@Table(name="asignado_a")
@IdClass(AsignacionID.class)
public class Asignaciones {
	@Id
	Cientificos cientifico;
	
	@Id
	Proyectos proyecto;

	public Asignaciones() {
		super();
	}

	public Asignaciones(Cientificos cientifico, Proyectos proyecto) {
		super();
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public Cientificos getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}

	public Proyectos getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyectos proyecto) {
		this.proyecto = proyecto;
	}
	
}
