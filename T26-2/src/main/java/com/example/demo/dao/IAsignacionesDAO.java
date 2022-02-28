/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.AsignacionID;
import com.example.demo.dto.Asignaciones;

/**
 * @author Fenrir
 *
 */
public interface IAsignacionesDAO extends JpaRepository<Asignaciones, AsignacionID> {

}
