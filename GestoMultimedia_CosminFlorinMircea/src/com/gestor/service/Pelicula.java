/**
 * Práctica: Gestor Multimedia
 * Alumno: Cosmin Florin Mircea
 * Centro: IES José Luis Sampedro
 * Asignatura: Programación
 * Profesor: Fernando Poveda Sahuquillo 
 */
package com.gestor.service;

public class Pelicula extends Contenido implements Reproducible, Descargable {

	private String director;
	private int duracionMin;
	private double calidadGB;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}

	public double getCalidadGB() {
		return calidadGB;
	}

	public void setCalidadGB(double calidadGB) {
		this.calidadGB = calidadGB;
	}

	public Pelicula(String id, String titulo, int anyo, boolean premium, String director, int duracionMin,
			double calidadGB) {
		super(id, titulo, anyo, premium);
		this.director = director;
		this.duracionMin = duracionMin;
		this.calidadGB = calidadGB;
	}

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(Object object) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costeMensual() {
		// TODO Auto-generated method stub
			
		double costeMensual = 0;
		if (this.premium) {
			costeMensual = 6.99 + this.calidadGB * 0.25;
		} else {
			costeMensual = 3.99 + this.calidadGB * 0.25;
		}
		
		return Math.round(costeMensual * 100.0) / 100.0;
	}

	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		System.out.println("[PELÍCULA] " + super.mostrarFicha() + "\nDirector: " + this.director + "\nDuración: " + this.duracionMin
				+ " min\nTamaño aprox.: " + this.calidadGB + " GB");

	}

	@Override
	public double tamanyoMB() {
		// TODO Auto-generated method stub
		return this.calidadGB * 1024.0;
	}

	@Override
	public void descargar() {
		// TODO Auto-generated method stub
		System.out.println("Descargando película: '" + this.titulo + "' (" + this.tamanyoMB() + " MB)...\nTamaño (MB): "
				+ this.tamanyoMB());

	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println(
				"Reproduciendo película: " + this.titulo + "...\nDuración (segundos): " + this.duracionSgundos());
	}

	@Override
	public int duracionSgundos() {
		// TODO Auto-generated method stub
		return this.duracionMin * 60;
	}

}
