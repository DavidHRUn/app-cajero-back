package com.cajero.models.service;

import java.util.List;

import com.cajero.models.entity.Dinero;
import com.cajero.models.request.DineroRequest;
import com.cajero.utils.response.Response;

/**
 * Declaración de métodos de comportamiento de Dinero
 * 
 * @author davic
 * @version 0.1 02/10/2022
 */
public interface IDineroService {
	
	/**
	 * Método que permite listar todo el dinero
	 * 
	 * @return Retorna un response de un listado de Dinero
	 */
	public Response<List<Dinero>> consultarDinero();
	
	/**
	 * Método que permite actualizar registros de dinero y retirar efectivo
	 * 
	 * @return Retorna un response de un listado de Dinero
	 */
	public Response<List<Dinero>> transaccionRetirar(DineroRequest dinero);

}
