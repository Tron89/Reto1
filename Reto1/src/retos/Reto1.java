package retos;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		
		while(true){
			
			System.out.println("===========================");
			System.out.println("Elige la operacion: ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			System.out.println("===========================");
			
			
			try {
				System.out.println("");
				int num = sn.nextInt();
				
		        switch (num) {
		        case 1:
		            System.out.println("Es uno.");
		            break;
		        case 2:
		            System.out.println("Es dos.");
		            break;
		        case 3:
		            System.out.println("Es tres.");
		            break;
		        case 4:
		            System.out.println("Es cuatro.");
		            break;
		        case 5:
		            System.out.println("Es cinco.");
		            break;
		        case 6:
		            System.out.println("Es seis.");
		            break;
		        case 7:
		            System.out.println("Es siete.");
		            break;
		        case 8:
		            System.out.println("Es ocho.");
		            break;
		        case 0:
		            System.out.println("Es un cero.");
		            break;
		        default:
		            System.out.println("Elige un numero entre los siguientes: ");
		            break;
		        }
		        
			} catch (Exception e) {
				System.out.println( "Eso no es un numero, Introduze un numero valido");
				sn.next();
			}
			
		}
		
	}

}
