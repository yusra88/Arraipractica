package programacion23;
import java.util.Scanner;
public class ejercicio11 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 11
		        System.out.print("Introduce una letra (S/N): ");
		        char letra = scanner.next().charAt(0);
		        if (letra == 'S' || letra == 'N') {
		            System.out.println("BIEN");
		        } else {
		            System.out.println("ERROR");
		        }

	}

}
