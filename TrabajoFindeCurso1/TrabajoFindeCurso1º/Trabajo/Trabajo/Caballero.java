package Trabajo;

public class Caballero extends Ejercito {
	private int IdUnidad = 006;
	private String Nombre = "Caballeria";
	private int N�unidades = 60;
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
		return "Caballero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", N�unidades=" + N�unidades + ", Poder="
				+ Poder + "]";
	}
	public Caballero() {
		super();
	}
	public Caballero(int idUnidad, String nombre, int n�unidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		N�unidades = n�unidades;
		Poder = poder;
	}
	
}
