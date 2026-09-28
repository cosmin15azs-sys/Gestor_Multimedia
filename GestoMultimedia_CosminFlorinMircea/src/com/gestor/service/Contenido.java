/**
 * Práctica: Gestor Multimedia
 * Alumno: Cosmin Florin Mircea
 * Centro: IES José Luis Sampedro
 * Asignatura: Programación
 * Profesor: Fernando Poveda Sahuquillo 
 */
package com.gestor.service;

public abstract class Contenido {

	protected String id;
	protected String titulo;
	protected int anyo;
	protected boolean premium;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public Contenido(String id, String titulo, int anyo, boolean premium) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anyo = anyo;
		this.premium = premium;
	}

	public Contenido() {
		super();
	}

	public String mostrarFicha() {
		String ficha = this.id + " - " + this.titulo + " (" + this.anyo + ") Premium=" + this.premium;
		return ficha;
	}

	public abstract double costeMensual();

	public abstract void mostrarDetalle();

}
