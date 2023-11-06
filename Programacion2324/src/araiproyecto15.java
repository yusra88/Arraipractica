


	import java.util.Scanner;

	public class araiproyecto15 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Crear el array de números
	        int[] numeros = new int[3];

	        // Leer los números por teclado e insertarlos en el array
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.printf("Ingresa el número %d: ", i+1);
	            int numero = scanner.nextInt();
	            int j = i;
	            while (j > 0 && numeros[j-1] > numero) {
	                numeros[j] = numeros[j-1];
	                j--;
	            }
	            numeros[j] = numero;
	        }

	        // Mostrar el array ordenado
	        System.out.println("Array ordenado:");
	        for (int numero : numeros) {
	            System.out.println(numero);
	        }
	    }
	


	}
