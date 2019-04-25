package Trabajo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Conexion {
	static String dbName = "comparatorarmy";
	static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String url ="jdbc:mysql://localhost:3307/"+dbName+timeZone ;
	static String user="root";
	static String pass="manolo";
	
	
	static Connection conexion ;
	static Statement consulta ;
	static ResultSet resultado ;
	
	public static void Conectar() {
		try {
			conexion = DriverManager.getConnection(url,user,pass);
			consulta = conexion.createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static ResultSet EjecutarSentencia(String sentencia) {
		try {
		resultado = consulta.executeQuery(sentencia);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	public static void EjecutarUpdate(String sentencia) {
		try {
			consulta.executeUpdate(sentencia);
			System.out.println("done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void CerrarConexion() {
		try {
			consulta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConexion() {
		return conexion;
	}
	public static void setConexion(Connection conexion) {
		Conexion.conexion = conexion;
	}
	@Override
	public String toString() {
		return "Conexion [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
