package retos;

public class FuncionesReto1 {
	// Operaciones
	public static int sumar(int a, int b) {
		return a+b;
	}
	public static int restar(int a, int b) {
		return a-b;
	}
	
	// Comprobaciones
	public static boolean esPar(int a) {
		return a % 2 == 0;
	}
	public static boolean esImpar(int a) {
		return a % 2 == 1;
	}


	// Operaciones matematicas
	public static int multiplicar(int a, int b) {
		return a*b;
	}
	public static float dividir(int a, int b) {
		if(b!=0) {
			return (float)a/b;
		} else {
			System.out.println("No se puede dividir entre 0");
			return 0.f;
		}
	}

	// Comprobar
	public static boolean esPositivo(int a) {
		return a >= 0;
	}
	public static boolean esNegativo(int a) {
		return a < 0;
	}
}
