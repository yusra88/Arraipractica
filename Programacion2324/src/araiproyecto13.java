import java.util.Scanner;
public class araiproyecto13 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Crear el array de números
	        int[] numeros = new int[10];

	        // Leer los números por teclado
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.printf("Ingresa el número %d: ", i+1);
	            numeros[i] = scanner.nextInt();
	        }

	        // Variables para calcular la media de positivos y negativos
	        int sumaPositivos = 0;
	        int sumaNegativos = 0;
	        int contadorPositivos = 0;
	        int contadorNegativos = 0;

	        // Calcular la suma y contar los positivos y negativos
	        for (int numero : numeros) {
	            if (numero > 0) {
	                sumaPositivos += numero;
	                contadorPositivos++;
	            } else if (numero < 0) {
	                sumaNegativos += numero;
	                contadorNegativos++;
	            }
	        }

	        // Calcular las medias
	        double mediaPositivos = (double) sumaPositivos / contadorPositivos;
	        double mediaNegativos = (double) sumaNegativos / contadorNegativos;

	        // Mostrar los resultados
	        System.out.println("Resultados:");
	        System.out.println("Media de los valores positivos: " + mediaPositivos);
	        System.out.println("Media de los valores negativos: " + mediaNegativos);
	    }
	


	}


