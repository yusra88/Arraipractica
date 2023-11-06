package programacion23;
import java.util.Scanner;
public class ejercicio8 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 8
		        System.out.print("Introduce una letra: ");
		        String letra = scanner.next();
		        if (letra.equals("a") || letra.equals("e" )|| letra.equals ("i" )|| letra.equals( "o" )|| letra.equals ("u")) {
		            System.out.println("La letra es vocal");
		        } else {
		            System.out.println("La letra no es vocal");
		        }

		    }
		
	}


