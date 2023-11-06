package programacion23;
import java.util.Scanner;
public class ejercicio10 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 10
		  System.out.print("Introduce el primer número: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Introduce el segundo número: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Introduce el tercer número: ");
	        int num3 = scanner.nextInt();
	        if (num1 >= num2 || num2 >= num3) {
	            System.out.println("ERROR: Los números deben estar en orden ascendente");
	        }

	}

}
