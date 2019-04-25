package Trabajo;

public class Comparar {

	private int Ejercitoazul;
	private int Ejercitorojo;
	public boolean comparacion(int Ejercitoazul, int Ejercitorojo) {
		boolean comparar = true;
		if(Ejercitoazul < Ejercitorojo ) {
			comparar = true;
		}else {
			comparar = false;
		}
		return comparar;
		
	}
	public int getEjercitoazul() {
		return Ejercitoazul;
	}
	public void setEjercitoazul(int ejercitoazul) {
		Ejercitoazul = ejercitoazul;
	}
	public int getEjercitorojo() {
		return Ejercitorojo;
	}
	public void setEjercitorojo(int ejercitorojo) {
		Ejercitorojo = ejercitorojo;
	}
	public Comparar(int ejercitoazul, int ejercitorojo) {
		Ejercitoazul = ejercitoazul;
		Ejercitorojo = ejercitorojo;
	}
	public Comparar() {

	}
}
