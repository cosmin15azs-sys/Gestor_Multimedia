/**
 * Práctica: Gestor Multimedia
 * Alumno: Cosmin Florin Mircea
 * Centro: IES José Luis Sampedro
 * Asignatura: Programación
 * Profesor: Fernando Poveda Sahuquillo 
 */
package com.gestor.service;

public class CursoOnline extends Contenido implements Descargable {

	private String plataforma;
	private int horas;
	private double materialesMB;

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getMaterialesMB() {
		return materialesMB;
	}

	public void setMaterialesMB(double materialesMB) {
		this.materialesMB = materialesMB;
	}

	public CursoOnline(String id, String titulo, int anyo, boolean premium, String plataforma, int horas,
			double materialesMB) {
		super(id, titulo, anyo, premium);
		this.plataforma = plataforma;
		this.horas = horas;
		this.materialesMB = materialesMB;
	}

	public CursoOnline() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double costeMensual() {
		// TODO Auto-generated method stub
		double costeMensual = 0;
		if (this.premium) {
			costeMensual = 9.99 + this.materialesMB / 1024.0 * 0.20;
		} else {
			costeMensual = 5.99 + this.materialesMB / 1024 * 0.20;
		}

		return Math.round(costeMensual * 100.0) / 100.0;
	}

	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		System.out.println("[CURSO ONLINE] " + super.mostrarFicha() + "\nPlataforma: " + this.plataforma + "\nHoras: " + this.horas
				+ " horas\nMateriales (MB): " + this.materialesMB + " MB");

	}

	@Override
	public double tamanyoMB() {
		// TODO Auto-generated method stub
		return this.materialesMB;
	}

	@Override
	public void descargar() {
		// TODO Auto-generated method stub
		System.out.println("Descargando curso: '" + this.titulo + "' (" + this.tamanyoMB() + " MB)...\nTamaño (MB): "
				+ this.tamanyoMB());

	}

}
