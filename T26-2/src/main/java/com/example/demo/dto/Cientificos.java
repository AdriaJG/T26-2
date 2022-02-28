/**
 * 
 */
package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Fenrir
 *
 */
@Entity
@Table(name="cientificos")
public class Cientificos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String DNI;
	
	@Column(name="nomapels")
	String nomApels;

	public Cientificos(String dNI, String nomApels) {
		super();
		DNI = dNI;
		this.nomApels = nomApels;
	}

	public Cientificos() {
		super();
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@Override
	public String toString() {
		return "Cientificos [DNI=" + DNI + ", nomApels=" + nomApels + "]";
	}

}
