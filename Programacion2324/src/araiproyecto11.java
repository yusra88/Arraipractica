import java.util.Scanner;
public class araiproyecto11 {
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pedir el número de alumnos
	        System.out.print("Ingresa el número de alumnos: ");
	        int numAlumnos = scanner.nextInt();

	        // Crear el array de notas
	        double[] notas = new double[numAlumnos];

	        // Pedir las notas de los alumnos
	        for (int i = 0; i < numAlumnos; i++) {
	            System.out.printf("Ingresa la nota del alumno %d: ", i+1);
	            notas[i] = scanner.nextDouble();
	        }

	        // Calcular la nota media
	        double sumaNotas = 0;
	        for (double nota : notas) {
	            sumaNotas += nota;
	        }
	        double notaMedia = sumaNotas / numAlumnos;

	        // Mostrar las notas superiores a la media
	        System.out.printf("La nota media del grupo es %.2f\n", notaMedia);
	        System.out.println("Los alumnos con notas superiores a la media son:");
	        for (int i = 0; i < numAlumnos; i++) {
	            if (notas[i] > notaMedia) {
	                System.out.printf("- Alumno %d: %.2f\n", i+1, notas[i]);
	            }
	        }
	    }
	

	}


