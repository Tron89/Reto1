package retos;

import java.io.IOException;
import java.util.Scanner;

public class Reto1 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		/*
		  opt = Opcion del usuario
		  num1 y num2 = Solo se crearan cuando la opcion este entre 1 y 4
		  num = Solo se creara cuando la opcion este entre 5 y 8
		 */

		// Iniciamos el bucle
        do {
			// Imprimimos las opciones
			System.out.print("""
===========================
Elige la operacion:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Par
6. Impar
7. Positivo
8. Negativo
0. Salir
===========================
->""");

			int opt;

			// Verificamos que lo introducido sea un numero
			try {
                opt = sn.nextInt();
            } catch (Exception e) {
                System.out.println("\nEso no es un numero. Introduze un numero valido");
                sn.next();
				continue;
            }

			// Si la opcion es 0, que termine el programa
			if (opt == 0) {
				break;
			}

			if (opt >= 1 && opt <= 4) { // Si es de 1 a 4, pedira 2 numeros
				int num1;
				int num2;

				// Verificar que se hayan introducido numeros enteros
				while (true){
					try {
						System.out.print("\nDame el primer numero: ");
						num1 = sn.nextInt();
						System.out.print("Dame el segundo numero: ");
						num2 = sn.nextInt();
						break;
					} catch (Exception e){
						System.out.println("Solo numeros enteros.");
						sn.next();
					}
				}

				switch (opt) {
					case 1 -> System.out.println("La suma es: "+FuncionesReto1.sumar(num1,num2)); // Llamar a la funcion suma
					case 2 -> System.out.println("La resta es: "+FuncionesReto1.restar(num1, num2)); // Llamar a la funcion resta
					case 3 -> System.out.println("La multiplicacion es: "+FuncionesReto1.multiplicar(num1, num2)); // Llamar a la funcion multiplicar
					case 4 -> System.out.println("La division es: "+FuncionesReto1.dividir(num1, num2)); // Llamar a la funcion dividir
				}
			} else if (opt >= 5 && opt <= 8) { // Si es de 5 a 8, pedira 1 numero
				int num;

				// Verificar que se haya introducido un numero entero
				while (true){
					try {
						System.out.print("\nDame un numero: ");
						num = sn.nextInt();
						break;
					} catch (Exception e){
						System.out.println("Un numero entero.");
						sn.next();
					}
				}

				switch (opt){
					case 5 -> System.out.println("Es "+num+" par: "+FuncionesReto1.esPar(num)); // Llamar a la funcion esPar
					case 6 -> System.out.println("Es "+num+" impar: "+FuncionesReto1.esImpar(num)); // Llamar a la funcion esImpar
					case 7 -> System.out.println("Es "+num+" positivo: "+FuncionesReto1.esPositivo(num)); // Llamar a la funcion esPositivo
					case 8 -> System.out.println("Es "+num+" negativo: "+FuncionesReto1.esNegativo(num)); // Llamar a la funcion esNegativo
				}
			} else { // Se a introducido algo que no esta entre 1 y 8
				System.out.println("Elige un numero entre los siguientes: ");
				continue;
			}

			// Pausar el codigo hasta que se presione enter
			System.out.println("\nPresiona enter para continuar...");
			try {
                System.in.read();
            } catch (IOException _) {
            }

        } while (true);

		// Se a salido del codigo
		System.out.println("\nEl programa a finalizado.");
		sn.close(); // Matamos/Cerramos el probre scanner :(
	}
}