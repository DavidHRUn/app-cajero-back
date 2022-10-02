package com.cajero.models.request;

import java.io.Serializable;
import java.util.List;

import com.cajero.models.entity.Dinero;

import lombok.Getter;
import lombok.Setter;

/**
 * Declaración de Dinero Request para envío de listado
 * 
 * @author davic
 * @version 0.1 02/10/2022
 */

@Getter

@Setter
public class DineroRequest implements Serializable {
	
	private List<Dinero> dinero;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
