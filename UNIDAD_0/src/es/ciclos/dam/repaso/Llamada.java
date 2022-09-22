package es.ciclos.dam.repaso;

public abstract class Llamada {
	
	private String origen;
	private String destino;
	protected int duracion;
	private int coste;
	
	public abstract double calcularCosteTotal();
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	

}
