package Trabajo;

public class Hondero extends Ejercito {
	private int IdUnidad = 004;
	private String Nombre = "Honderos";
	private int Nºunidades = 80;
	private int Poder = 420;
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
		return "Hondero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", Nºunidades=" + Nºunidades + ", Poder="
				+ Poder + "]";
	}
	public Hondero() {
		super();
	}
	public Hondero(int idUnidad, String nombre, int nºunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nºunidades = nºunidades;
		Poder = poder;
	}
	
}
