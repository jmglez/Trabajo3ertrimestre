package Trabajo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Trabajo.Conexion;

public class Unidad extends Ejercitoazul{//clase diseñada para contener los parametros usados por las otras clases
	private int IdUnidad;
	private String Nombre ;
	private int Nºunidades ;
	private int Poder ;
	

	public Unidad(int idUnidad, String nombre, int nºunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nºunidades = nºunidades;
		Poder = poder;
	}
	
	public int getIdUnidad() {
		return IdUnidad;
	}
	public void setIdUnidad(int idUnidad) {
		IdUnidad = idUnidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getNºunidades() {
		return Nºunidades;
	}
	public void setNºunidades(int nºunidades) {
		Nºunidades = nºunidades;
	}
	public int getPoder() {
		return Poder;
	}
	public void setPoder(int poder) {
		Poder = poder;
	}
	@Override
	public String toString() {
		return "Espadachin [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", Nºunidades=" + Nºunidades + ", Poder="
				+ Poder + "]";
	}

	
	
}
