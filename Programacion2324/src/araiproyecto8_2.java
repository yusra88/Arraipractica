import java.util.Scanner;
public class araiproyecto8_2 {
	

	
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Ingrese la cantidad de alumnos: ");
	    int cantidadAlumnos = scanner.nextInt();
	    
	    String[] nombres = new String[cantidadAlumnos];
	    int[] edades = new int[cantidadAlumnos];
	    
	    for (int i = 0; i < cantidadAlumnos; i++) {
	      scanner.nextLine(); // Limpiar el búfer de entrada
	      
	      System.out.print("Ingrese el nombre del alumno " + (i+1) + ": ");
	      nombres[i] = scanner.nextLine();
	      
	      System.out.print("Ingrese la edad del alumno " + (i+1) + ": ");
	      edades[i] = scanner.nextInt();
	    }
	    
	    int contadorMenores20 = 0;
	    int sumaEdades = 0;
	    int edadMinima = edades[0];
	    String nombreMinimo = nombres[0];
	    
	    for (int i = 0; i < cantidadAlumnos; i++) {
	      if (edades[i] < 20) {
	        contadorMenores20++;
	      }
	      
	      sumaEdades += edades[i];
	      
	      if (edades[i] < edadMinima) {
	        edadMinima = edades[i];
	        nombreMinimo = nombres[i];
	      }
	    }
	    
	    double edadMedia = (double) sumaEdades / cantidadAlumnos;
	    
	    System.out.println("\nNúmero de alumnos menores de 20 años: " + contadorMenores20);
	    System.out.println("Edad media del aula: " + edadMedia);
	    System.out.println("Alumno más joven: " + nombreMinimo + " con " + edadMinima + " años.");
	  }
	}


