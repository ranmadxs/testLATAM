package com.testlatam.exception;

public class LatamException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1393865653384762446L;

	private String descripcion;
	private String codigo;

	public LatamException(String message, String codigo, Throwable cause) {
		super(message, cause);
		this.descripcion = message;
		this.codigo = codigo;
	}

	public LatamException(String message, Throwable cause) {
	    super(message, cause);
		this.descripcion = message;
	}

	public LatamException(String descripcion, String codigo) {
		super(descripcion);
		this.descripcion = descripcion;
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
