import java.util.Scanner;
public class araiproyecto10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Lucía", "Marta", "Sofía", "Pablo"};

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una cadena para buscar:");
		String cadenaBuscada = scanner.nextLine();

		for (String nombre : nombres) {
		    if (nombre.startsWith(cadenaBuscada)) {
		        System.out.println(nombre);
		    }
		}
	}
}

