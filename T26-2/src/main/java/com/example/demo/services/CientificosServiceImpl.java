/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICientificosDAO;
import com.example.demo.dto.Cientificos;

/**
 * @author Fenrir
 *
 */
@Service
public class CientificosServiceImpl implements ICientificosServices{
	
	@Autowired
	
	ICientificosDAO iCientificosDAO;
	
	@Override
	public List<Cientificos> obtenerCientificos() {
		// TODO Auto-generated method stub
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos obtenerCientificosID(String id) {
		// TODO Auto-generated method stub
		return iCientificosDAO.findById(id).get();
	}

	@Override
	public Cientificos guardarCientificos(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public Cientificos modificarCientificos(Cientificos cientifico, String id) {
		// TODO Auto-generated method stub
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public void eliminarCientificos(String id) {
		// TODO Auto-generated method stub
		iCientificosDAO.deleteById(id);
	}

}
