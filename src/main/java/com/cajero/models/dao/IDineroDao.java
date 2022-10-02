package com.cajero.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cajero.models.entity.Dinero;

public interface IDineroDao extends CrudRepository<Dinero, Long> {
	
	

}
