package Trabajo;

import java.awt.EventQueue;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) { //este es el main su funcion principal es la de iniciar el programa
		EventQueue.invokeLater(new Runnable() {
			public void run() {//con esta clase llamamos a que se inicie el programa
				try {
					SelecciondeEjercitos frame = new SelecciondeEjercitos(); //objeto del menu principal del programa para invocarlo
					frame.setVisible(true); //invocacion del programa
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
