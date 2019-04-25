package Trabajo;

import java.util.ArrayList;

public class Login {
	static boolean comprobar (String usuario, String contrasena) {
		boolean a = true;
		ArrayList<String> nombres = SolicitudinfoBBDD.loginobtenernombre(); 	
		ArrayList<String> contras = SolicitudinfoBBDD.loginobtenercontra();
		for (int i = 0 ; i<nombres.size();i++) {
			if(usuario.equals(nombres.get(i))) {
				
			}
		}
		return a;
		
	}
}
