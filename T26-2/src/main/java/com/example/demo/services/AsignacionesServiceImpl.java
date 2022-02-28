/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAsignacionesDAO;
import com.example.demo.dto.AsignacionID;
import com.example.demo.dto.Asignaciones;

/**
 * @author Fenrir
 *
 */
@Service
public class AsignacionesServiceImpl implements IAsignacionesServices{
	
	@Autowired
	
	IAsignacionesDAO iAsignacionesDAO;
	
	@Override
	public List<Asignaciones> obtenerAsignaciones() {
		// TODO Auto-generated method stub
		return iAsignacionesDAO.findAll();
	}

	@Override
	public Asignaciones obtenerAsignacionesID(AsignacionID id) {
		// TODO Auto-generated method stub
		return iAsignacionesDAO.findById(id).get();
	}

	@Override
	public Asignaciones guardarAsignaciones(Asignaciones asignacion) {
		// TODO Auto-generated method stub
		return iAsignacionesDAO.save(asignacion);
	}

	@Override
	public Asignaciones modificarAsignaciones(Asignaciones asignacion, AsignacionID id) {
		// TODO Auto-generated method stub
		return iAsignacionesDAO.save(asignacion);
	}

	@Override
	public void eliminarAsignaciones(AsignacionID id) {
		// TODO Auto-generated method stub
		iAsignacionesDAO.deleteById(id);
	}

}
