package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	private Contenedor c;
	
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Welcome to the Container Volume Calculator! ");
			System.out.println("Select an option");
			System.out.println("1. Calculate Total Volume of the container and merchandise");
			System.out.println("2. Calculate Average volume of 3 containers");
			System.out.println("3. Exit");
		
			int option = 0;
				while(option !=3){
					option = sc.nextInt();
                
			switch(option){
				case 1:
				System.out.println("Ingrese el ancho del contenedor");
				double a = sc.nextDouble();
				System.out.println("Ingrese el alto del contenedor");
				double h = sc.nextDouble();
				System.out.println("Ingrese el largo del contenedor");
				double l = sc.nextDouble();
				Contenedor c = new Contenedor(a,h,l);
				System.out.println("The volume of the container is: " + c.calcularVolumendeContenedor());
				break;

				case 2:
				double acumulado = 1;
				double contenedores = 0;
				System.out.println("Ingrese la cantidad de contenedores a promediar");
				double contain = sc.nextDouble();
				
				while(acumulado <= contain){
					System.out.println("Ingrese el volumen del contenedor numero: " + acumulado);
					double cn = sc.nextDouble();
					contenedores += cn;
					acumulado ++;
				}
				
				double promedio = contenedores/contain;
				
				System.out.println("The average volume of the containers is: "+ promedio);
				
				break;

				default:
				break;
			}
		
		}
		
	}

		
}	