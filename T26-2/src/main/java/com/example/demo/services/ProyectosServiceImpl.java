/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProyectosDAO;
import com.example.demo.dto.Proyectos;

/**
 * @author Fenrir
 *
 */
@Service
public class ProyectosServiceImpl implements IProyectosServices{
	
	@Autowired
	
	IProyectosDAO iProyectosDAO;
	
	@Override
	public List<Proyectos> obtenerProyectos() {
		// TODO Auto-generated method stub
		return iProyectosDAO.findAll();
	}

	@Override
	public Proyectos obtenerProyectosID(String id) {
		// TODO Auto-generated method stub
		return iProyectosDAO.findById(id).get();
	}

	@Override
	public Proyectos guardarProyectos(Proyectos proyecto) {
		// TODO Auto-generated method stub
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public Proyectos modificarProyectos(Proyectos proyecto, String id) {
		// TODO Auto-generated method stub
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public void eliminarProyectos(String id) {
		// TODO Auto-generated method stub
		iProyectosDAO.deleteById(id);
	}

}
