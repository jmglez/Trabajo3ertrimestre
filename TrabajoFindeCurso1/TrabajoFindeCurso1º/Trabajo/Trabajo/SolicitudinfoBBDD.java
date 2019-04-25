package Trabajo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SolicitudinfoBBDD {
	
	//ArrayList<String> usuarios = new ArrayList<String>();
	
	//ArrayList<String> contrasenas = new ArrayList<String>();

	static ArrayList<String> loginobtenernombre () {//2 array list, 2 funciones que añadan nombre 
		ArrayList<String> usuarios = new ArrayList<String>();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT nombre FROM usuario ");
		try {
			while(resultado.next()){
				usuarios.add(resultado.getString("nombre"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return usuarios;
	}
	static ArrayList<String> loginobtenercontra () {//2 array list, 2 funciones que añadan nombre 
		ArrayList<String> contrasenas = new ArrayList<String>();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT contraseña FROM usuario");
		try {
			while(resultado.next()){
				contrasenas.add(resultado.getString("contraseña"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return contrasenas;
	}
}
