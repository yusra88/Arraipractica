package programacion23;
import java.util.Scanner;
public class ejercicio13 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 13
		        System.out.print("Introduce una nota: ");
		        double nota = scanner.nextDouble();
		        if (nota >= 1 && nota <= 4.9) {
		            System.out.println("Suspenso");
		        } else if (nota >= 5 && nota <= 5.9) {
		            System.out.println("Suficiente");
		        } else if (nota >= 6 && nota <= 6.9) {
		            System.out.println("Bien");
		        } else if (nota >= 7 && nota <= 8.9) {
		            System.out.println("Muy bien");
		        } else if (nota >= 9 && nota <= 10) {
		            System.out.println("Sobresaliente");
		        } else {
		            System.out.println("ERROR: Nota no válida");
		        }

	}

}
