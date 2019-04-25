package Trabajo;

public class Piquero extends Ejercito {
	private int IdUnidad = 005;
	private String Nombre = "Piqueros";
	private int Nºunidades = 100;
	private int Poder = 390;
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
		return "Piquero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", Nºunidades=" + Nºunidades + ", Poder="
				+ Poder + "]";
	}
	public Piquero() {
		super();
	}
	public Piquero(int idUnidad, String nombre, int nºunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nºunidades = nºunidades;
		Poder = poder;
	}
	
}
