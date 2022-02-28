/**
 * 
 */
package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Fenrir
 *
 */
public class AsignacionID implements Serializable{
	@ManyToOne
	@JoinColumn(name="cientifico")
	Cientificos cientifico;

	@ManyToOne
	@JoinColumn(name="proyecto")
	Proyectos proyecto;

	public AsignacionID(Cientificos cientifico, Proyectos proyecto) {
		super();
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public AsignacionID() {
		super();
	}

}
