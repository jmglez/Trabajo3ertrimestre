package Trabajo;

public class Lancero extends Ejercito {
	private int IdUnidad = 003;
	private String Nombre = "Lanceros";
	private int N�unidades = 120;
	private int Poder = 330;
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
		return "Lancero [IdUnidad=" + IdUnidad + ", Nombre=" + Nombre + ", N�unidades=" + N�unidades + ", Poder="
				+ Poder + "]";
	}
	public Lancero() {
		super();
	}
	public Lancero(int idUnidad, String nombre, int n�unidades, int poder) {
		super();
		IdUnidad = idUnidad;
		Nombre = nombre;
		N�unidades = n�unidades;
		Poder = poder;
	}
	
}
