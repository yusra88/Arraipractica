package programacion23;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Ejercicio 3
		System.out.print("Introduce un número: ");
		int num3 = scanner.nextInt();
		if (num3 > 0) {
			System.out.println("El número es positivo");
		} else if (num3 < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es cero");
		}
	}
}