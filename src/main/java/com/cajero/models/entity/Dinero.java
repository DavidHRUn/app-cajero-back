package com.cajero.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Declaración de clase pojo del modelo Dinero
 * 
 * @author davic
 * @version 0.1 02/10/2022
 */

@Getter

@Setter

@Builder

@AllArgsConstructor

@NoArgsConstructor

@Entity
@Table(name = "dinero")
public class Dinero implements Serializable {

	/** Atributo id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dinero")
	private Long id;

	/** Atributo denominacion. */
	@Column(name = "denominacion")
	private String denominacion;

	/** Atributo cantidad. */
	@Column(name = "cantidad")
	private int cantidad;

	/**
	 * 
	 */
	private static final long serialVersionUID = 247930896234737639L;
}
