package model;

public class Barco{
	
	private Contenedor c1;
	private Contenedor c2;
	private Contenedor c3;
	
	public Barco(){
		
	}
	
	public void setContenedor1(double w, double h, double l){
		c1 = new Contenedor(w,h,l);
	}
	
	public void setContenedor2(double w, double h, double l){
		c2 = new Contenedor(w,h,l);
	}
	
	public void setContenedor3(double w, double h, double l){
		c3 = new Contenedor(w,h,l);
	}
	
	public double calculateVolumeAverage(){
		double average;
		
		double vol1 = c1.calcularVolumendeContenedor();
		double vol2 = c2.calcularVolumendeContenedor();
		double vol3 = c3.calcularVolumendeContenedor();
		
		average = ((vol1+vol2+vol3)/3);
		
		return average; 
	}
	
}