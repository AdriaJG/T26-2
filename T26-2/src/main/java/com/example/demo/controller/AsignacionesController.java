/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.AsignacionID;
import com.example.demo.dto.Asignaciones;
import com.example.demo.services.AsignacionesServiceImpl;
import com.example.demo.services.IAsignacionesServices;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class AsignacionesController {
	
	@Autowired
	
	AsignacionesServiceImpl asignacionesServiceImpl;
	
	@GetMapping("/asignaciones")
	public List<Asignaciones> obtenerAsignaciones(){
		return asignacionesServiceImpl.obtenerAsignaciones();
	}
	
	@GetMapping("/asignaciones/{id}")
	public Asignaciones obtenerAsignacionesID(@PathVariable(name="id") AsignacionID id) {
		return asignacionesServiceImpl.obtenerAsignacionesID(id);
	}
	
	@PostMapping("/asignaciones")
	public Asignaciones guardarCajero(@RequestBody Asignaciones asignacion) {
		return asignacionesServiceImpl.guardarAsignaciones(asignacion);
	}
	
	@PutMapping("/asignaciones/{id}")
	public Asignaciones modificarAsignaciones(@RequestBody Asignaciones asignacion, @PathVariable(name="id") AsignacionID id) {
		Asignaciones asignacionSeleccionado = new Asignaciones();
		Asignaciones asignacionModificado = new Asignaciones();
		asignacionSeleccionado = asignacionesServiceImpl.obtenerAsignacionesID(id);
		asignacionSeleccionado.setCientifico(asignacion.getCientifico());
		asignacionSeleccionado.setProyecto(asignacion.getProyecto());
		return asignacionModificado = asignacionesServiceImpl.guardarAsignaciones(asignacionModificado);
	}
	
	@DeleteMapping("/asignaciones/{id}")
	public void eliminarAsignaciones(@PathVariable(name="id") AsignacionID id) {
		asignacionesServiceImpl.eliminarAsignaciones(id);
	}


}
