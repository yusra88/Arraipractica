
import java.util.Scanner;

public class araiproyecto1 {
    public static void main(String[] args) {
        String[] array = new String[5];
        Scanner scanner = new Scanner(System.in);

       

        for (int i = 0; i < array.length; i++) {
        	 System.out.println("Introduce las palabras:");
            array[i] = scanner.nextLine();
        }

        System.out.println("El array ha sido rellenado con las siguientes palabras:");

       
    }
}

	
