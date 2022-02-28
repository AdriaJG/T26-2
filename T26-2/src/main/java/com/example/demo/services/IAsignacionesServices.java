package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.AsignacionID;
import com.example.demo.dto.Asignaciones;

public interface IAsignacionesServices {
	
	public List<Asignaciones> obtenerAsignaciones();
	
	public Asignaciones obtenerAsignacionesID(AsignacionID id);
	
	public Asignaciones guardarAsignaciones(Asignaciones asignacion);
	
	public Asignaciones modificarAsignaciones(Asignaciones asignacion, AsignacionID id);
	
	public void eliminarAsignaciones(AsignacionID id);
}
