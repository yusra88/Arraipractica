package programacion23;
import java.util.Scanner;
public class ejercicio1 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Ejercicio 1
		        System.out.print("Introduce una nota: ");
		        int nota = scanner.nextInt();
		        if (nota >= 5) {
		            System.out.println("Aprobado");
		        } else {
		            System.out.println("Suspendido");
		        }

	}
}


