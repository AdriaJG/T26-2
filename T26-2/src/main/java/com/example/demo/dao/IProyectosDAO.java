/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Proyectos;

/**
 * @author Fenrir
 *
 */
public interface IProyectosDAO extends JpaRepository<Proyectos, String> {

}
