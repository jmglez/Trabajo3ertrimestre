package Trabajo;

public class Caballero extends Ejercito {
	private int IdUnidad = 006;
	private String Nombre = "Caballeria";
	private int Nºunidades = 60;
	private int Poder = 490;
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
		return "Caballero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", Nºunidades=" + Nºunidades + ", Poder="
				+ Poder + "]";
	}
	public Caballero() {
		super();
	}
	public Caballero(int idUnidad, String nombre, int nºunidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		Nºunidades = nºunidades;
		Poder = poder;
	}
	
}
