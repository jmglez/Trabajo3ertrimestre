package Trabajo;
import Trabajo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Metodosloguin {
 Conexion metodosConexion = new Conexion();
 public int validar_ingreso(){
	 String usuario = InterfazJuego.Intusuario.getText();
	 String clave = String.valueOf(InterfazJuego.Intcontase�a.getPassword());
	 int resultado=0;
	 String SSQL="SELECT * FROM usuario WHERE usuario='"+usuario+"' AND clave=md5('"+clave+"')";
	 Connection conect = null;
	 try {
		 conect =  metodosConexion.getConexion();
		 Statement st = conect.createStatement();
		 ResultSet rs = st.executeQuery(SSQL);

		 if(rs.next()){

		    resultado=1;}
	    } catch (SQLException ex) {
	    	 JOptionPane.showMessageDialog(null, ex, "Error de conexi�n", JOptionPane.ERROR_MESSAGE);
	    }finally{
	    	/*try {

	           conect.close();

	        } catch (SQLException ex) {

	            JOptionPane.showMessageDialog(null, ex, "Error de desconexi�n", JOptionPane.ERROR_MESSAGE);

	        }*/
	    }
	return 0;}
}
