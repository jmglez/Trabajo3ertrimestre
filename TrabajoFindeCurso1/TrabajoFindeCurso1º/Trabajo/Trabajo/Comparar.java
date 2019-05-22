package Trabajo;

import javax.swing.JLabel;

public class Comparar { //esta clase hace que el programa compare ambos resultados de la suma de los poderes y los compare entre si

	private int Ejercitoazul; //variable del poder total del ejercito azul
	private int Ejercitorojo; //variable del poder total del ejercito azul
	private static int Poderejercitoazul;//variable usada para transportar el texto del jlabel para saber el poder
	private static int Poderejercitorojo;
	static SelecciondeEjercitos comp = new SelecciondeEjercitos();
	
	public static boolean comparacion(int poderejercitoazul2, int poderejercitorojo2) { //obtencion de las variables y comparacion de las mismas
		Poderejercitoazul=Integer.parseInt(comp.getLblNewLabel_2().getText());
		 Poderejercitorojo=Integer.parseInt(comp.getLblNewLabel_3().getText());
		
		boolean comparar = true; //boleano para comparar
		if(Poderejercitoazul < Poderejercitorojo ) {
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
