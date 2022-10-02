package com.cajero.models.service;

import java.util.List;

import com.cajero.models.entity.Dinero;
import com.cajero.models.request.DineroRequest;
import com.cajero.utils.response.Response;

public interface IDineroService {
	
	public Response<List<Dinero>> consultarDinero();
	
	public Response<List<Dinero>> transaccionRetirar(DineroRequest dinero);

}
