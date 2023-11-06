package programacion23;
import java.util.Scanner;
public class ejercicio15 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
	    // Ejercicio15

		        System.out.print("Introduce el primer número: ");
		        int numero1 = scanner.nextInt();
		        System.out.print("Introduce el segundo número: ");
		        int numero2 = scanner.nextInt();
		        System.out.print("Introduce el tercer número: ");
		        int numero3 = scanner.nextInt();
		        if (numero1 <= numero2 && numero2 <= numero3) {
		            System.out.println(numero1 + ", " + numero2 + ", " + numero3);
		        } else if (numero1 <= numero3 && numero3 <= numero2) {
		            System.out.println(numero1 + ", " + numero3 + ", " + numero2);
		        } else if (numero2 <= numero1 && numero1 <= numero3) {
		            System.out.println(numero2 + ", " + numero1 + ", " + numero3);
		        } else if (numero2 <= numero3 && numero3 <= numero1) {
		            System.out.println(numero2 + ", " + numero3 + ", " + numero1);
		        } else if (numero3 <= numero1 && numero1 <= numero2) {
		            System.out.println(numero3 + ", " + numero1 + ", " + numero2);
		        } else {
		            System.out.println(numero3 + ", " + numero2 + ", " + numero1);
		        }
		    }
		

	

}
