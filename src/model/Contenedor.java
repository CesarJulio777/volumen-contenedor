package model;

public class Contenedor{
	
	private double ancho;
	private double alto;
	private double largo;
	
	public Contenedor(double a, double h, double l){
		ancho = a;
		alto = h;
		largo = l;
		
	}
	
	public double calcularVolumendeContenedor(){
		double volumen = 0;
		volumen = (ancho*alto*largo);
			return volumen;
	}
	

}