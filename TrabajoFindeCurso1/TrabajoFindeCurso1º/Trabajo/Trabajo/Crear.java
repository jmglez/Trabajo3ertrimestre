package Trabajo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Crear {
	private int id;
	private String nombre;
	private int poder;
	private int nunidades;
	
	public void crear() {
		Conexion.Conectar();
		
		ResultSet Crear = Conexion.EjecutarSentencia("INSERT INTO unidades  VALUES (" + id +", " + nombre +"," + poder + "," + nunidades +" );" );
		
		try {
	    	// getNombreEspadachin();
				while(Crear.next()){
					
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		
	}
	
}
