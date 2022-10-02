package com.cajero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cajero.models.entity.Dinero;
import com.cajero.models.request.DineroRequest;
import com.cajero.models.service.IDineroService;
import com.cajero.utils.Environment;
import com.cajero.utils.response.Response;

/**
 * Declaración de clase controller, que implementa métodos del service
 * 
 * @author davic
 * @version 0.1 02/10/2022
 */
@RestController
@CrossOrigin(origins = { Environment.CORS_ANGULAR_DEFAULT })
@RequestMapping("/app-dinero")
public class DineroController {

	/** Inyección de dependencias */
	@Autowired
	private IDineroService dineroService;

	/**
	 * Método que permite listar el dinero existente
	 *
	 * @return un listado / arreglo del dinero
	 */
	@GetMapping("/getDinero")
	public Response<List<Dinero>> getDinero() {
		return dineroService.consultarDinero();
	}

	/**
	 * Método que permite actualizar los registros de Dinero y efectuar el retiro de
	 * efectivo
	 *
	 * @param dineroRequest permite enviar el listado de dinero mediante un request
	 * @return un listado / arreglo del dinero
	 */
	@PostMapping("/transaccionRetirar")
	public Response<List<Dinero>> retirarEfectivo(@RequestBody DineroRequest dineroRequest) {
		return dineroService.transaccionRetirar(dineroRequest);
	}

}
