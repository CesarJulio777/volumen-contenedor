package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	private Contenedor c;
	
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Container Volume Calculator! ");
		
		Barco b = new Barco();
		
		int option = 0;
		while(option !=6){
			System.out.println("============");
			System.out.println("Options Menu");
			System.out.println("============");
			System.out.println("1. New Container 1");
			System.out.println("2. New Container 2");
			System.out.println("3. New Container 3");
			System.out.println("4. Calculate Total Volume of the containers");
			System.out.println("5. Calculate Average volume of 3 containers");
			System.out.println("6. Exit");
			System.out.print("Enter the option: ");
		
			option = sc.nextInt();
			double a, h, l;
			switch(option){
				case 1:
					System.out.print("Ingrese el ancho del contenedor 1: ");
					a = sc.nextDouble();
					System.out.print("Ingrese el alto del contenedor 1: ");
					h = sc.nextDouble();
					System.out.print("Ingrese el largo del contenedor 1: ");
					l = sc.nextDouble();
					b.setContenedor1(a,h,l);
					System.out.println("Se ha registrado un nuevo contenedor 1");
				break;
				case 2:
					System.out.print("Ingrese el ancho del contenedor 2: ");
					a = sc.nextDouble();
					System.out.print("Ingrese el alto del contenedor 2: ");
					h = sc.nextDouble();
					System.out.print("Ingrese el largo del contenedor 2: ");
					l = sc.nextDouble();
					b.setContenedor2(a,h,l);
					System.out.println("Se ha registrado un nuevo contenedor 2: ");
				break;
				case 3:
					System.out.print("Ingrese el ancho del contenedor 3: ");
					a = sc.nextDouble();
					System.out.print("Ingrese el alto del contenedor 3: ");
					h = sc.nextDouble();
					System.out.print("Ingrese el largo del contenedor 3: ");
					l = sc.nextDouble();
					b.setContenedor3(a,h,l);
					System.out.println("Se ha registrado un nuevo contenedor 3");
				break;

				case 4:
					double total = b.calculateTotalVolume();
					System.out.println("The total volume is: "+total);
				break;
				
				case 5:
					double average = b.calculateVolumeAverage();
					System.out.println("Volume Avarage is: " + average);
				break;
				
				case 6:
					System.out.println("Thank you for using this program. Good bye!");
				break;

				default:
					System.out.println("The option "+option+" there is not in the menu");
				break;
			}
		
		}
		
	}

		
}	