package programacion23;
import java.util.Scanner;
public class ejercicio5 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 5
		        System.out.print("Introduce un número: ");
		        int num5 = scanner.nextInt();
		        if (num5 >= 0 && num5 <= 10) {
		            System.out.println("El número está entre 0 y 10");
		        } else {
		            System.out.println("El número está fuera del rango de 0 a 10");
		        }


	}

}
