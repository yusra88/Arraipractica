
	import java.util.Scanner;

	public class araiproyecto5{
	    public static void main(String[] args) {
	        // Definir el array de 5 elementos
	        String[] array = new String[5];
	        
	        // Rellenar el array con nombres introducidos desde el teclado
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Introduce un nombre: ");
	            String nombre = scanner.nextLine();
	            array[i] = nombre;
	        }
	        
	        // Imprimir los nombres que empiezan por "A"
	        System.out.println("Nombres que empiezan por A:");
	        for (int i = 0; i < 5; i++) {
	          /*  if (array[i].startsWith("A") || array[i].startsWith("a")) {
	        	  
	                System.out.println(array[i]);
	            }*/
	        	
	        	if (array[i].toUpperCase().startsWith("A")) {
		        	  
	                System.out.println(array[i]);
	            }
	        }
	    }
	}


