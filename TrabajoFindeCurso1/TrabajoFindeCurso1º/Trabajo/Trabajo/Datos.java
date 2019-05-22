package Trabajo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Datos {//clase que sirve para obtener en la base de datos los  
	private int IdUnidadEspadachin ;
	private String NombreEspadachin ;//datos para usarlos en otros lugares
	private int NunidadesEspadachin ;
	private int PoderEspadachin ;
	private int IdUnidadArquero ;
	private String NombreArquero ;
	private int NunidadesArquero ;
	private int PoderArquero ;
	private int IdUnidadHondero ;
	private String NombreHondero ;
	private int NunidadesHondero ;
	private int PoderHondero ;
	private int IdUnidadLancero ;
	private String NombreLancero;
	private int NunidadesLancero ;
	private int PoderLancero ;
	private int IdUnidadPiquero ;
	private String NombrePiquero ;
	private int NunidadesPiquero ;
	private int PoderPiquero;
	private int IdUnidadCaballero ;
	private String NombreCaballero ;
	private int NunidadesCaballero ;
	private int PoderCaballero ;
	
	 ArrayList<Unidad> datos = new ArrayList<Unidad>();//array list de datos para obtener la informacion de las unidades

	 public Datos() {
	 Conexion.Conectar();
		/* Ejecutar la conexion*/
		ResultSet datoespadachin = Conexion.EjecutarSentencia("SELECT * FROM unidades where IdUnidad=1" ); //consulta select par aobtener los datos
    // System.out.println(NombreEspadachin);
     try {
    	// getNombreEspadachin();
			while(datoespadachin.next()){ //datos que se quieren obtener
				
				IdUnidadEspadachin=datoespadachin.getInt("IdUnidad");
				getNombreEspadachin();
				NombreEspadachin=datoespadachin.getString("Nombre_unidad");
				NunidadesEspadachin=datoespadachin.getInt("Nºunidades");
				PoderEspadachin=datoespadachin.getInt("Poder");
				Unidad datespadachin = new Unidad(IdUnidadEspadachin, NombreEspadachin, NunidadesEspadachin, PoderEspadachin );
			     
			     datos.add(datespadachin);
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
     
     
     // recogida de datos del arquero
     ResultSet datoarquero = Conexion.EjecutarSentencia("SELECT * FROM unidades where IdUnidad=2" );
     System.out.println();
    
     try {
			while(datoarquero.next()){
				if (datoarquero.getInt("IdUnidad") == 2) {
				IdUnidadArquero=datoarquero.getInt("IdUnidad");
				}
				NombreArquero=datoarquero.getString("Nombre_unidad");
				NunidadesArquero=datoarquero.getInt("Nºunidades");
				PoderArquero=datoarquero.getInt("Poder");
				  Unidad datArquero = new Unidad(IdUnidadArquero, NombreArquero, NunidadesArquero, PoderArquero );
				     
				     datos.add(datArquero);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
  
     
     
     ResultSet datohondero = Conexion.EjecutarSentencia("SELECT * FROM unidades where IdUnidad=3" );
     System.out.println();
    
     try {
			while(datohondero.next()){
				if (datohondero.getInt("IdUnidad") == 3) {
				IdUnidadHondero=datohondero.getInt("IdUnidad");
				}
				NombreHondero=datohondero.getString("Nombre_unidad");
				NunidadesHondero=datohondero.getInt("Nºunidades");
				PoderHondero=datohondero.getInt("Poder");
				 Unidad dathondero = new Unidad(IdUnidadHondero, NombreHondero, NunidadesHondero, PoderHondero );
			     
			     datos.add(dathondero);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
    
     
     
     
     ResultSet datolancero = Conexion.EjecutarSentencia("SELECT * FROM unidades where IdUnidad=4" );
     System.out.println();
    
     try {
			while(datolancero.next()){
				if (datolancero.getInt("IdUnidad") == 4) {
				IdUnidadLancero=datolancero.getInt("IdUnidad");
				}
				NombreLancero=datolancero.getString("Nombre_unidad");
				NunidadesLancero=datolancero.getInt("Nºunidades");
				PoderLancero=datolancero.getInt("Poder");
				Unidad datLancero = new Unidad(IdUnidadLancero, NombreLancero, NunidadesLancero, PoderLancero );
			     
			     datos.add(datLancero);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
     
     
     ResultSet datopiquero = Conexion.EjecutarSentencia("SELECT * FROM unidades where IdUnidad=5" );
     System.out.println();
    
     try {
			while(datopiquero.next()){
				if (datopiquero.getInt("IdUnidad") == 5) {
				IdUnidadPiquero=datopiquero.getInt("IdUnidad");
				}
				NombrePiquero=datopiquero.getString("Nombre_unidad");
				NunidadesPiquero=datopiquero.getInt("Nºunidades");
				PoderPiquero=datopiquero.getInt("Poder");
				Unidad datPiquero = new Unidad(IdUnidadPiquero, NombrePiquero, NunidadesPiquero, PoderPiquero );
			     
			     datos.add(datPiquero);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
     
     
     ResultSet datocaballero = Conexion.EjecutarSentencia("SELECT * FROM unidades where IdUnidad=6" );
     System.out.println();
    
     try {
			while(datocaballero.next()){
				if (datocaballero.getInt("IdUnidad") == 6) {
				IdUnidadCaballero=datocaballero.getInt("IdUnidad");
				}
				NombreCaballero=datocaballero.getString("Nombre_unidad");
				NunidadesCaballero=datocaballero.getInt("Nºunidades");
				PoderCaballero=datocaballero.getInt("Poder");
				Unidad datCaballero = new Unidad(IdUnidadLancero, NombreLancero, NunidadesLancero, PoderLancero );
			     
			     datos.add(datCaballero);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
    
	}
	 
	 
	 
	public Datos(int idUnidadEspadachin, String nombreEspadachin, int nunidadesEspadachin, int poderEspadachin,
			int idUnidadArquero, String nombreArquero, int nunidadesArquero, int poderArquero, int idUnidadHondero,
			String nombreHondero, int nunidadesHondero, int poderHondero, int idUnidadLancero, String nombreLancero,
			int nunidadesLancero, int poderLancero, int idUnidadPiquero, String nombrePiquero, int nunidadesPiquero,
			int poderPiquero, int idUnidadCaballero, String nombreCaballero, int nunidadesCaballero, int poderCaballero,
			ArrayList<Unidad> datos) {
		super();
		IdUnidadEspadachin = idUnidadEspadachin;
		NombreEspadachin = nombreEspadachin;
		NunidadesEspadachin = nunidadesEspadachin;
		PoderEspadachin = poderEspadachin;
		IdUnidadArquero = idUnidadArquero;
		NombreArquero = nombreArquero;
		NunidadesArquero = nunidadesArquero;
		PoderArquero = poderArquero;
		IdUnidadHondero = idUnidadHondero;
		NombreHondero = nombreHondero;
		NunidadesHondero = nunidadesHondero;
		PoderHondero = poderHondero;
		IdUnidadLancero = idUnidadLancero;
		NombreLancero = nombreLancero;
		NunidadesLancero = nunidadesLancero;
		PoderLancero = poderLancero;
		IdUnidadPiquero = idUnidadPiquero;
		NombrePiquero = nombrePiquero;
		NunidadesPiquero = nunidadesPiquero;
		PoderPiquero = poderPiquero;
		IdUnidadCaballero = idUnidadCaballero;
		NombreCaballero = nombreCaballero;
		NunidadesCaballero = nunidadesCaballero;
		PoderCaballero = poderCaballero;
		this.datos = datos;
	}



	public  int getIdUnidadEspadachin() {
		return IdUnidadEspadachin;
		
	}

	public void setIdUnidadEspadachin(int idUnidadEspadachin) {
		IdUnidadEspadachin = idUnidadEspadachin;
		
	}

	public String getNombreEspadachin() {
		return NombreEspadachin;
	}

	public void setNombreEspadachin(String nombreEspadachin) {
		NombreEspadachin = nombreEspadachin;
	}

	public  int getNunidadesEspadachin() {
		return NunidadesEspadachin;
	}

	public void setNunidadesEspadachin(int nunidadesEspadachin) {
		NunidadesEspadachin = nunidadesEspadachin;
	}

	public  int getPoderEspadachin() {
		return PoderEspadachin;
	}

	public void setPoderEspadachin(int poderEspadachin) {
		PoderEspadachin = poderEspadachin;
	}

	public int getIdUnidadArquero() {
		return IdUnidadArquero;
	}

	public void setIdUnidadArquero(int idUnidadArquero) {
		IdUnidadArquero = idUnidadArquero;
	}

	public String getNombreArquero() {
		return NombreArquero;
	}

	public void setNombreArquero(String nombreArquero) {
		NombreArquero = nombreArquero;
	}

	public int getNunidadesArquero() {
		return NunidadesArquero;
	}

	public void setNunidadesArquero(int nunidadesArquero) {
		NunidadesArquero = nunidadesArquero;
	}

	public int getPoderArquero() {
		return PoderArquero;
	}

	public void setPoderArquero(int poderArquero) {
		PoderArquero = poderArquero;
	}

	public int getIdUnidadHondero() {
		return IdUnidadHondero;
	}

	public void setIdUnidadHondero(int idUnidadHondero) {
		IdUnidadHondero = idUnidadHondero;
	}

	public String getNombreHondero() {
		return NombreHondero;
	}

	public void setNombreHondero(String nombreHondero) {
		NombreHondero = nombreHondero;
	}

	public int getNunidadesHondero() {
		return NunidadesHondero;
	}

	public void setNunidadesHondero(int nunidadesHondero) {
		NunidadesHondero = nunidadesHondero;
	}

	public int getPoderHondero() {
		return PoderHondero;
	}

	public void setPoderHondero(int poderHondero) {
		PoderHondero = poderHondero;
	}

	public int getIdUnidadLancero() {
		return IdUnidadLancero;
	}

	public void setIdUnidadLancero(int idUnidadLancero) {
		IdUnidadLancero = idUnidadLancero;
	}

	public String getNombreLancero() {
		return NombreLancero;
	}

	public void setNombreLancero(String nombreLancero) {
		NombreLancero = nombreLancero;
	}

	public int getNunidadesLancero() {
		return NunidadesLancero;
	}

	public void setNunidadesLancero(int nunidadesLancero) {
		NunidadesLancero = nunidadesLancero;
	}

	public int getPoderLancero() {
		return PoderLancero;
	}

	public void setPoderLancero(int poderLancero) {
		PoderLancero = poderLancero;
	}

	public int getIdUnidadPiquero() {
		return IdUnidadPiquero;
	}

	public void setIdUnidadPiquero(int idUnidadPiquero) {
		IdUnidadPiquero = idUnidadPiquero;
	}

	public String getNombrePiquero() {
		return NombrePiquero;
	}

	public void setNombrePiquero(String nombrePiquero) {
		NombrePiquero = nombrePiquero;
	}

	public int getNunidadesPiquero() {
		return NunidadesPiquero;
	}

	public void setNunidadesPiquero(int nunidadesPiquero) {
		NunidadesPiquero = nunidadesPiquero;
	}

	public int getPoderPiquero() {
		return PoderPiquero;
	}

	public void setPoderPiquero(int poderPiquero) {
		PoderPiquero = poderPiquero;
	}

	public int getIdUnidadCaballero() {
		return IdUnidadCaballero;
	}

	public void setIdUnidadCaballero(int idUnidadCaballero) {
		IdUnidadCaballero = idUnidadCaballero;
	}

	public String getNombreCaballero() {
		return NombreCaballero;
	}

	public void setNombreCaballero(String nombreCaballero) {
		NombreCaballero = nombreCaballero;
	}

	public int getNunidadesCaballero() {
		return NunidadesCaballero;
	}

	public void setNunidadesCaballero(int nunidadesCaballero) {
		NunidadesCaballero = nunidadesCaballero;
	}

	public int getPoderCaballero() {
		return PoderCaballero;
	}

	public void setPoderCaballero(int poderCaballero) {
		PoderCaballero = poderCaballero;
	}

	public ArrayList<Unidad> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<Unidad> datos) {
		this.datos = datos;
	}
	 /*private void intentomostrar() {
		 try {
			 Conexion obj = new Conexion();
			 obj.EjecutarSentencia("Poder");
			 String sql = "select + from unidades";
			 obj.getConexion()
			 while(obj.x) {
				 
			 }
		 } catch (Exception e) {
		
			 
		 }*/
	 }
	 

