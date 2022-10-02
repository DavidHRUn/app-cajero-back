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

@RestController
@CrossOrigin(origins = { Environment.CORS_ANGULAR_DEFAULT })
@RequestMapping("/app-dinero")
public class DineroController {

	@Autowired
	private IDineroService dineroService;

	@GetMapping("/getDinero")
	public Response<List<Dinero>> getDinero() {
		return dineroService.consultarDinero();
	}

	@PostMapping("/transaccionRetirar")
	public Response<List<Dinero>> retirarEfectivo(@RequestBody DineroRequest dineroRequest) {
		return dineroService.transaccionRetirar(dineroRequest);
	}

}
