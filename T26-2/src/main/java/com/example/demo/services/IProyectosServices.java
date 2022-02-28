package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Proyectos;

public interface IProyectosServices {
	
	public List<Proyectos> obtenerProyectos();
	
	public Proyectos obtenerProyectosID(String id);
	
	public Proyectos guardarProyectos(Proyectos proyecto);
	
	public Proyectos modificarProyectos(Proyectos proyecto, String id);
	
	public void eliminarProyectos(String id);
}
