package Trabajo;

public class Arquero extends Ejercito{
	private int IdUnidad = 002;
	private String Nombre = "Arqueros";
	private int N�unidades = 90;
	private int Poder = 400;
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
		return "Arquero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", N�unidades=" + N�unidades + ", Poder="
				+ Poder + "]";
	}
	public Arquero() {
		super();
	}
	public Arquero(int idUnidad, String nombre, int n�unidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		N�unidades = n�unidades;
		Poder = poder;
	}
	
}
