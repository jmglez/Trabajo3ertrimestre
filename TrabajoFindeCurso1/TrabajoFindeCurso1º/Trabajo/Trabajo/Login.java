package Trabajo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Login {
	public Login() {
		
	}
	public boolean comprobar (String usuario, String contrasena) {//eso se usa para obtener el usuario y la contraseña introducidos y compararlos con la base de datos
		boolean acceso = false;
		
	SolicitudinfoBBDD nombre = new SolicitudinfoBBDD(); 
		ArrayList<String> nombres = nombre.loginobtenernombre(); 	
		ArrayList<String> contras = nombre.loginobtenercontra();
		nombre.setUsuarios(nombres);
		nombre.setContrasenas(contras);
		for (int i = 0 ; i<nombre.getUsuarios().size();i++) {
			if(usuario.equals(nombre.getUsuarios().get(i))) {
				if(contrasena.equals(nombre.getContrasenas().get(i))) {
					acceso=true;
				}else {
					acceso=false;
				}
			}else {
				acceso = false;
			}
		}
		return acceso;
		
		/*ResultSet buscarUsuario = Conexion.EjecutarSentencia("SELECT Nombre FROM usuario ");
		try {
			while (buscarUsuario.next()) {
				if (usuario.equals(buscarUsuario.getString("Nombre"))&&(contrasena.equals(buscarUsuario.getString("Contraseña")))) {
					acceso = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return acceso;*/
	}
	
	
	
	}

