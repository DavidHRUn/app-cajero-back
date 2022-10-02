package com.cajero.utils.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Instantiates a new response.
 * 
 * @author davic
 *
 * @param successfulResponse the successful response
 * @param message            the message
 * @param data               the data
 * @param error              the error
 */

@AllArgsConstructor

@Builder

@Getter

@Setter
public class Response<T> implements Serializable {
	/**
	 * 
	 * /** The successful response.
	 */
	private boolean successfulResponse;

	/** The message. */
	private String message;

	/** The data. */
	private transient T data;

	/** The error. */
	private String error;

	public Response(boolean successfulResponse, String message, T data) {
		this.successfulResponse = successfulResponse;
		this.message = message;
		this.data = data;
	}

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4815280892143599107L;

}
