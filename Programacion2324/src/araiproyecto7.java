import java.util.Random;
import java.util.Scanner;
public class araiproyecto7 {

	

		    public static void main(String[] args) {
		      Scanner scanner = new Scanner(System.in);
		      
		      System.out.print("Introduce un número: ");
		      int n = scanner.nextInt();
		      
		      int[] numeros = new int[n];
		      int i = 0;
		      
		      while (i < n) {
		        numeros[i] = (int) (Math.random() * 10) + 1;
		        i++;
		      }
		      
		      int maximo = numeros[0];
		      i = 1;
		      
		      while (i < n) {
		        if (numeros[i] > maximo) {
		          maximo = numeros[i];
		        }
		        i++;
		      }
		      
		      System.out.println("El máximo es: " + maximo);
		    }
		  }

	