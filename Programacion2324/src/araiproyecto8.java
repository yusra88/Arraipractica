import java.util.Scanner;
public class araiproyecto8 {

	
	    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
	    for (int i = 0; i < 10; i++) {
	      System.out.print("Introduce un número: ");
	      numeros[i] = scanner.nextInt();
	    }
	    
	    int opcion;
	    do {
	      System.out.println("\nMenú:");
	      System.out.println("1. Visualizar suma");
	      System.out.println("2. Visualizar máximo");
	      System.out.println("3. Visualizar mínimo");
	      System.out.println("4. Contar coincidencias");
	      System.out.println("0. Salir");
	      System.out.print("Introduce una opción: ");
	      scanner.nextLine();
	      opcion = scanner.nextInt();
	      
	      switch (opcion) {
	      
	        case 1:
	          int suma = 0;
	          for (int i = 0; i < 10; i++) {
	            suma += numeros[i];
	          }
	          System.out.println("La suma es: " + suma);
	          break;
	          
	        case 2:
	          int maximo = numeros[0];
	          for (int i = 1; i < 10; i++) {
	            if (numeros[i] > maximo) {
	              maximo = numeros[i];
	            }
	          }
	          System.out.println("El máximo es: " + maximo);
	          break;
	          
	        case 3:
	          int minimo = numeros[0];
	          for (int i = 1; i < 10; i++) {
	            if (numeros[i] < minimo) {
	              minimo = numeros[i];
	            }
	          }
	          System.out.println("El mínimo es: " + minimo);
	          break;
	          
	        case 4:
	          System.out.print("Introduce un número: ");
	          int numeroBuscado = scanner.nextInt();
	          
	          int coincidencias = 0;
	          for (int i = 0; i < 10; i++) {
	            if (numeros[i] == numeroBuscado) {
	              coincidencias++;
	            }
	          }
	          
	          System.out.println("El número de coincidencias es: " + coincidencias);
	          break;
	          
	        case 0:
	          System.out.println("Adiós.");
	          break;
	          
	        default:
	          System.out.println("Opción inválida.");
	          break;
	      }
	    } while (opcion != 0);
	  }
	}



