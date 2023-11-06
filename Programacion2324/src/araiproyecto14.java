	import java.util.Scanner;
public class araiproyecto14 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Crear los arrays de nombres y sueldos
	        String[] nombres = new String[20];
	        double[] sueldos = new double[20];

	        // Leer los nombres y sueldos de los empleados
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.printf("Ingresa el nombre del empleado %d: ", i+1);
	            nombres[i] = scanner.nextLine();
	            System.out.printf("Ingresa el sueldo de %s: ", nombres[i]);
	            sueldos[i] = scanner.nextDouble();
	            scanner.nextLine(); // Limpiar el buffer de entrada
	        }

	        // Encontrar el empleado con el mayor sueldo
	        int indiceMayorSueldo = 0;
	        for (int i = 1; i < sueldos.length; i++) {
	            if (sueldos[i] > sueldos[indiceMayorSueldo]) {
	                indiceMayorSueldo = i;
	            }
	        }

	        // Mostrar el resultado
	        System.out.printf("El empleado con el mayor sueldo es %s, con un sueldo de %.2f", nombres[indiceMayorSueldo], sueldos[indiceMayorSueldo]);
	    }
	

	}


