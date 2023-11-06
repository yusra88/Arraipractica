package programacion23;
import java.util.Scanner;
public class ejercicio12 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 12
        System.out.print("Introduce la potencia del coche: ");
        double potencia = scanner.nextDouble();
        System.out.print("¿La potencia está en KW o CV? (K/C): ");
        char unidad = scanner.next().charAt(0);
        double resultado;
        if (unidad == 'K') {
            resultado = potencia * 1.35;
            System.out.println("La potencia del coche es " + resultado + " CV");
        } else if (unidad == 'C') {
            resultado = potencia / 1.35;
            System.out.println("La potencia del coche es " + resultado + " KW");
        } else {
            System.out.println("ERROR: Unidad no válida");
        }

	}

}
