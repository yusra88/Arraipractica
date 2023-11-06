package programacion23;
import java.util.Scanner;
public class ejercicio14 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
	    // Ejercicio14
        System.out.print("Introduce el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int n3 = scanner.nextInt();
        if (n1 < n2 && n2 < n3) {
            System.out.println("Los números están en orden ascendente");
        } else {
            System.out.println("Los números no están en orden ascendente");
        }
	}

}
