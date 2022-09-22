package es.ciclos.dam.repaso;

public class Local extends Llamada {

	private static final double precio = 0.15;
	
	public double calcularCosteTotal() {
		
		return precio*duracion;
	}
	
	
}
