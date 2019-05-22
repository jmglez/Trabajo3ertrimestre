package Trabajo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SolicitudinfoBBDD {//clase usada para obtener la informacion del login , en desuso
	
	private ArrayList<String> usuarios = new ArrayList<String>();
	
	private ArrayList<String> contrasenas = new ArrayList<String>();
	
	

	 ArrayList<String> loginobtenernombre () {//2 array list, 2 funciones que añadan nombre 
		ArrayList<String> usuarios = new ArrayList<String>();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT Nombre FROM usuario ");
		try {
			while(resultado.next()){
				usuarios.add(resultado.getString("Nombre"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return usuarios;
	}
	 ArrayList<String> loginobtenercontra () {//2 array list, 2 funciones que añadan nombre 
		ArrayList<String> contrasenas = new ArrayList<String>();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT Contraseña FROM usuario");
		try {
			while(resultado.next()){
				contrasenas.add(resultado.getString("Contraseña"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return contrasenas;
	}
	 public SolicitudinfoBBDD() {
		 
	 }
	public ArrayList<String> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<String> usuarios) {
		this.usuarios = usuarios;
	}
	public ArrayList<String> getContrasenas() {
		return contrasenas;
	}
	public void setContrasenas(ArrayList<String> contrasenas) {
		this.contrasenas = contrasenas;
	}
	 
}
