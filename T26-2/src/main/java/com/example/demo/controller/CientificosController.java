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
import com.example.demo.dto.Cientificos;
import com.example.demo.services.CientificosServiceImpl;
import com.example.demo.services.ICientificosServices;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class CientificosController {
	
	@Autowired
	
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> obtenerCientificos(){
		return cientificosServiceImpl.obtenerCientificos();
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientificos obtenerCientificosID(@PathVariable(name="id") String id) {
		return cientificosServiceImpl.obtenerCientificosID(id);
	}
	
	@PostMapping("/cientificos")
	public Cientificos guardarCajero(@RequestBody Cientificos cientifico) {
		return cientificosServiceImpl.guardarCientificos(cientifico);
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientificos modificarCientificos(@RequestBody Cientificos cientifico, @PathVariable(name="id") String id) {
		Cientificos cientificoSeleccionado = new Cientificos();
		Cientificos cientificoModificado = new Cientificos();
		cientificoSeleccionado = cientificosServiceImpl.obtenerCientificosID(id);
		cientificoSeleccionado.setDNI(cientifico.getDNI());
		cientificoSeleccionado.setNomApels(cientifico.getNomApels());
		return cientificoModificado = cientificosServiceImpl.guardarCientificos(cientificoModificado);
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientificos(@PathVariable(name="id") String id) {
		cientificosServiceImpl.eliminarCientificos(id);
	}


}
