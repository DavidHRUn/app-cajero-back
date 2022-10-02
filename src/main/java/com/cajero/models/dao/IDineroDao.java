package com.cajero.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cajero.models.entity.Dinero;

/** 
 * Declaración de interfaz de acceso a datos a la entidad Dinero
 * 
 * @author davic
 * @version 0.1 02/10/2022
 */
public interface IDineroDao extends CrudRepository<Dinero, Long> {
	
	

}
