package Trabajo;

public class unidades {//clase diseñada para contener el numero de unidades en general
	private int contadorEspadachin ;
	private int contadorArquero ;
	private int contadorHondero ;
	private int contadorlancero ;
	private int contadorPiquero ;
	private int contadorCaballeria ;
	
	public int getContadorEspadachin() {
		return contadorEspadachin;
	}
	public void setContadorEspadachin(int contadorEspadachin) {
		this.contadorEspadachin = contadorEspadachin;
	}
	public int getContadorArquero() {
		return contadorArquero;
	}
	public void setContadorArquero(int contadorArquero) {
		this.contadorArquero = contadorArquero;
	}
	public int getContadorHondero() {
		return contadorHondero;
	}
	public void setContadorHondero(int contadorHondero) {
		this.contadorHondero = contadorHondero;
	}
	public int getContadorlancero() {
		return contadorlancero;
	}
	public void setContadorlancero(int contadorlancero) {
		this.contadorlancero = contadorlancero;
	}
	public int getContadorPiquero() {
		return contadorPiquero;
	}
	public void setContadorPiquero(int contadorPiquero) {
		this.contadorPiquero = contadorPiquero;
	}
	public int getContadorCaballeria() {
		return contadorCaballeria;
	}
	public void setContadorCaballeria(int contadorCaballeria) {
		this.contadorCaballeria = contadorCaballeria;
	}
	@Override
	public String toString() {
		return "unidades [contadorEspadachin=" + contadorEspadachin + ", contadorArquero=" + contadorArquero
				+ ", contadorHondero=" + contadorHondero + ", contadorlancero=" + contadorlancero + ", contadorPiquero="
				+ contadorPiquero + ", contadorCaballeria=" + contadorCaballeria + "]";
	}
	public unidades(int contadorEspadachin, int contadorArquero, int contadorHondero, int contadorlancero,
			int contadorPiquero, int contadorCaballeria) {
		super();
		this.contadorEspadachin = contadorEspadachin;
		this.contadorArquero = contadorArquero;
		this.contadorHondero = contadorHondero;
		this.contadorlancero = contadorlancero;
		this.contadorPiquero = contadorPiquero;
		this.contadorCaballeria = contadorCaballeria;
	}
	
	public unidades() {
		
	}
	
	void setcontadorEspadachin(int contadorEspadachin) {
		contadorEspadachin++;
	}
}
