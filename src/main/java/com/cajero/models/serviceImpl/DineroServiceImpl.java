package com.cajero.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cajero.models.dao.IDineroDao;
import com.cajero.models.entity.Dinero;
import com.cajero.models.request.DineroRequest;
import com.cajero.models.service.IDineroService;
import com.cajero.utils.MessageResponse;
import com.cajero.utils.response.Response;

/**
 * Declaración de clase de servicio, que implementa métodos del comportamiento
 * de IDineroService
 * 
 * @author davic
 * @version 0.1 02/10/2022
 */

@Service
public class DineroServiceImpl implements IDineroService {

	/**
	 * Inyección de dependencias
	 */
	@Autowired
	private IDineroDao dineroDao;

	/**
	 * Método de capa de servicio que permite listar el dinero
	 * 
	 * @return Retorna un listado de dinero
	 */
	@Override
	public Response<List<Dinero>> consultarDinero() {
		List<Dinero> dinero = (List<Dinero>) dineroDao.findAll();
		return new Response<>(true, MessageResponse.SUCCESS_CONSULTA, dinero);
	}

	/**
	 * Método de capa de servicio que permite actualizar registro y retirar efectivo
	 * 
	 * @return Retorna un listado de dinero
	 */
	@Override
	public Response<List<Dinero>> transaccionRetirar(DineroRequest dinero) {
		dineroDao.deleteAll();
		dineroDao.saveAll(dinero.getDinero());
		return consultarDinero();
	}

}
