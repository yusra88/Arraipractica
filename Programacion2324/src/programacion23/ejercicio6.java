package programacion23;
import java.util.Scanner;
public class ejercicio6 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 6
		        System.out.print("Introduce el primer número: ");
		        int num6 = scanner.nextInt();
		        System.out.print("Introduce el segundo número: ");
		        int num7 = scanner.nextInt();
		        System.out.print("Introduce el tercer número: ");
		        int num8 = scanner.nextInt();
		        int suma = num6 + num7 + num8;
		        double media = (double) suma / 3;
		        System.out.println("La suma es " + suma);
		        System.out.println("La media es " + media);
	}

}
