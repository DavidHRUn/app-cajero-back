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
 * Gets the creacion.
 *
 * @return the creacion
 */
@Getter

/**
 * Sets the creacion.
 *
 * @param creacion the new creacion
 */
@Setter

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder

/**
 * Instantiates a new Dinero.
 *
 * @param id           the id
 * @param denominacion the denominación
 * @param cantidad     the cantidad
 */
@AllArgsConstructor

/**
 * Instantiates a new usuario.
 */
@NoArgsConstructor

@Entity
@Table(name = "dinero")
public class Dinero implements Serializable {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dinero")
	private Long id;

	/** The nombre. */
	@Column(name = "denominacion")
	private String denominacion;

	/** The apellido. */
	@Column(name = "cantidad")
	private int cantidad;

	/**
	 * 
	 */
	private static final long serialVersionUID = 247930896234737639L;
}
