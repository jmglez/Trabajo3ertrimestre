package archivo;
import java.io.*;
public class Escrituradefichero {
	  public static void main(String[] args) {
		  FileWriter fichero = null;
			PrintWriter pw = null;
			try {
				fichero	= new FileWriter("C:\\Users\\josem\\git\\trabajo3ertrimestre\\TrabajoFindeCurso1\\TrabajoFindeCurso1�\\Trabajo\\archivo\\archivo.txt");
				pw = new PrintWriter(fichero);
				for(int i = 0; i < 10 ; i++)
					pw.println("El ganador es:" + i );
				
				}catch (Exception e){
					e.printStackTrace();
			}finally {
				try {
					if(null != fichero)
						fichero.close();
				}catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	}
	  
}
