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

@Service
public class DineroServiceImpl implements IDineroService {

	@Autowired
	private IDineroDao dineroDao;

	@Override
	public Response<List<Dinero>> consultarDinero() {
		List<Dinero> dinero = (List<Dinero>) dineroDao.findAll();
		return new Response<>(true, MessageResponse.SUCCESS_CONSULTA, dinero);
	}

	@Override
	public Response<List<Dinero>> transaccionRetirar(DineroRequest dinero) {
		dineroDao.deleteAll();
		for (Dinero dineroIterable : dinero.getDinero()) {
			dineroDao.save(dineroIterable);
		}

		return consultarDinero();
	}

}
