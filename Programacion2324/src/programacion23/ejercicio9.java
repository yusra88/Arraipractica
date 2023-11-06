package programacion23;
import java.util.Scanner;
public class ejercicio9 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        // Ejercicio 9
		        System.out.print("Introduce el usuario: ");
		        String usuario = scanner.next();
		        System.out.print("Introduce la contraseña: ");
		        String contrasena = scanner.next();
		        if (usuario.equals("ikaslea") && contrasena.equals("ik1920")) {
		            System.out.println("Login correcto");
		        } else {
		            System.out.println("Login incorrecto");
		        }

	}

}
