package Trabajo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Trabajo.Conexion;

public class Unidad extends Ejercitoazul{//clase dise�ada para contener los parametros usados por las otras clases
	private int IdUnidad;
	private String Nombre ;
	private int N�unidades ;
	private int Poder ;
	

	public Unidad(int idUnidad, String nombre, int n�unidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		N�unidades = n�unidades;
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
	public int getN�unidades() {
		return N�unidades;
	}
	public void setN�unidades(int n�unidades) {
		N�unidades = n�unidades;
	}
	public int getPoder() {
		return Poder;
	}
	public void setPoder(int poder) {
		Poder = poder;
	}
	@Override
	public String toString() {
		return "Espadachin [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", N�unidades=" + N�unidades + ", Poder="
				+ Poder + "]";
	}

	
	
}
