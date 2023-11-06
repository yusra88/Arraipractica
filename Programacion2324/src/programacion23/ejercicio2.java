package programacion23;
import java.util.Scanner;
public class ejercicio2 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 2
		        System.out.print("Introduce el primer número: ");
		        int num1 = scanner.nextInt();
		        System.out.print("Introduce el segundo número: ");
		        int num2 = scanner.nextInt();
		        if (num1 == num2) {
		            System.out.println("Los números son iguales");
		        } else if (num1 > num2) {
		            System.out.println("El primer número es mayor");
		        } else {
		            System.out.println("El segundo número es mayor");
		        }
	}

}
