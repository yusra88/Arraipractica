import java.util.Scanner;
public class araiproyecto12 {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);

		        // Crear el array de números
		        int[] numeros = new int[10];

		        // Leer los números por teclado
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.printf("Ingresa el número %d: ", i+1);
		            numeros[i] = scanner.nextInt();
		        }

		        // Contadores para los números positivos, negativos y ceros
		        int positivos = 0;
		        int negativos = 0;
		        int ceros = 0;

		        // Recorrer el array y contar los números
		        for (int numero : numeros) {
		            if (numero > 0) {
		                positivos++;
		            } else if (numero < 0) {
		                negativos++;
		            } else {
		                ceros++;
		            }
		        }

		        // Mostrar los resultados
		        System.out.println("Resultados:");
		        System.out.println("Números positivos: " + positivos);
		        System.out.println("Números negativos: " + negativos);
		        System.out.println("Ceros: " + ceros);
		    }
		


	}


