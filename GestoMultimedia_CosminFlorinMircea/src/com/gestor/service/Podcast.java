/**
 * Práctica: Gestor Multimedia
 * Alumno: Cosmin Florin Mircea
 * Centro: IES José Luis Sampedro
 * Asignatura: Programación
 * Profesor: Fernando Poveda Sahuquillo 
 */
package com.gestor.service;

public class Podcast extends Contenido implements Reproducible {

	private String anfitrion;
	private int episodios;
	private int duracionMinPorEpisodio;

	public String getAnfitrion() {
		return anfitrion;
	}

	public void setAnfitrion(String anfitrion) {
		this.anfitrion = anfitrion;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public int getDuracionMinPorEpisodio() {
		return duracionMinPorEpisodio;
	}

	public void setDuracionMinPorEpisodio(int duracionMinPorEpisodio) {
		this.duracionMinPorEpisodio = duracionMinPorEpisodio;
	}

	public Podcast(String id, String titulo, int anyo, boolean premium, String anfitrion, int episodios,
			int duracionMinPorEpisodio) {
		super(id, titulo, anyo, premium);
		this.anfitrion = anfitrion;
		this.episodios = episodios;
		this.duracionMinPorEpisodio = duracionMinPorEpisodio;
	}

	public Podcast() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costeMensual() {
		// TODO Auto-generated method stub
		double costeMensual = 0;
		if (this.premium) {
			costeMensual = 4.99 + this.episodios * 0.05;
		} else {
			costeMensual = this.episodios * 0.05;
		}

		return Math.round(costeMensual * 100.0) / 100.0;
	}

	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		System.out.println("[PODCAST] " + super.mostrarFicha() + "\nAnfitrión: " + this.anfitrion + "\nEpisodios: " + this.episodios
				+ "\nDuración del episodio (min): " + this.duracionMinPorEpisodio + " min");

	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo podcast: " + this.titulo + "...\nEpisodio: " + this.episodios
				+ "\nDuración (minutos): " + this.getDuracionMinPorEpisodio());

	}

	@Override
	public int duracionSgundos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
