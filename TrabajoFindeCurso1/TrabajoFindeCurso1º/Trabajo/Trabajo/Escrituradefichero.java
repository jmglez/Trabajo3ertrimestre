package Trabajo;
import java.io.*;
public class Escrituradefichero {// clase usada para escribir en un fichero , actualmente en desuso por falta de tiempo para implementacion
	public void Escribirfichero() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {//esto se usa para indicar la direccion dle fichero y escribir en el
			fichero	= new FileWriter("C:\\Users\\josem\\git\\trabajo3ertrimestre\\TrabajoFindeCurso1\\TrabajoFindeCurso1º\\Trabajo\\Trabajo\\archivo.txt");
			pw = new PrintWriter(fichero);
			for(int i = 0; i < 10 ; i++)
				pw.println("El ganador es:" + i );
				System.out.println("funciona");
			
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
