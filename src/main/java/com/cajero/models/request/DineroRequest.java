package com.cajero.models.request;

import java.io.Serializable;
import java.util.List;

import com.cajero.models.entity.Dinero;

import lombok.Getter;
import lombok.Setter;


@Getter

@Setter

public class DineroRequest implements Serializable {
	
	private List<Dinero> dinero;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
