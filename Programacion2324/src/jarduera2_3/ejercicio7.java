package jarduera2_3;

public class ejercicio7 {

	public static void main(String[] args) {
		// Suma de números entre 30 y 50:
		
		int sum = 0;
		int i = 30;
		while (i <= 50) {
		    sum = sum +i;
		    i++;
		    System.out.println("La suma de los números entre 30 y 50 es: " + sum);
		}
		

		// Usando for
		sum = 0;

		for (int j = 30; j <= 50; j++) {
			sum = sum+i;
		}

		System.out.println("La suma de los números entre 30 y 50 es: " + sum);

	}

}
