package Trabajo;

public class contadorpoderejercitoazul {//la clase borrada por error , pero esta clase almacenaria la suma de todos los poderes totales
	int Sumapoderazul;
	Datos dato = new Datos()
;	public void sumapoder() {
		Sumapoderazul=(dato.getPoderEspadachin()+ dato.getPoderArquero()+ dato.getPoderHondero() + dato.getPoderLancero() + dato.getPoderPiquero() + dato.getPoderCaballero());
				
	}
public int getSumapoderazul() {
	return Sumapoderazul;
}
public void setSumapoderazul(int sumapoderazul) {
	Sumapoderazul = sumapoderazul;
}
public Datos getDato() {
	return dato;
}
public void setDato(Datos dato) {
	this.dato = dato;
}
public contadorpoderejercitoazul() {
	super();
	Sumapoderazul = Sumapoderazul;
	this.dato = dato;
}
	


}
