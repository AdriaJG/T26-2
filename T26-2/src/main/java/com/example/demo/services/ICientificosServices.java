package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Cientificos;

public interface ICientificosServices {
	
	public List<Cientificos> obtenerCientificos();
	
	public Cientificos obtenerCientificosID(String id);
	
	public Cientificos guardarCientificos(Cientificos cientifico);
	
	public Cientificos modificarCientificos(Cientificos cientifico, String id);
	
	public void eliminarCientificos(String id);
}
