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
import com.example.demo.dto.Proyectos;
import com.example.demo.services.ProyectosServiceImpl;
import com.example.demo.services.IProyectosServices;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class ProyectosController {
	
	@Autowired
	
	ProyectosServiceImpl proyectosServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyectos> obtenerProyectos(){
		return proyectosServiceImpl.obtenerProyectos();
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyectos obtenerProyectosID(@PathVariable(name="id") String id) {
		return proyectosServiceImpl.obtenerProyectosID(id);
	}
	
	@PostMapping("/proyectos")
	public Proyectos guardarCajero(@RequestBody Proyectos proyecto) {
		return proyectosServiceImpl.guardarProyectos(proyecto);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyectos modificarProyectos(@RequestBody Proyectos proyecto, @PathVariable(name="id") String id) {
		Proyectos proyectoSeleccionado = new Proyectos();
		Proyectos proyectoModificado = new Proyectos();
		proyectoSeleccionado = proyectosServiceImpl.obtenerProyectosID(id);
		proyectoSeleccionado.setId(proyecto.getId());
		proyectoSeleccionado.setNombre(proyecto.getNombre());
		proyectoSeleccionado.setHoras(proyecto.getHoras());
		return proyectoModificado = proyectosServiceImpl.guardarProyectos(proyectoModificado);
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyectos(@PathVariable(name="id") String id) {
		proyectosServiceImpl.eliminarProyectos(id);
	}


}
