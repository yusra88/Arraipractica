import java.util.Scanner;

public class araiproyecto2 {
    public static void main(String[] args) {
        // Definir el array de 5 elementos
        String[] array = new String[5];
        
        // Rellenar el array con palabras introducidas desde el teclado
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una palabra: ");
            String palabra = scanner.nextLine();
            array[i] = palabra;
        }
        
        // Imprimir el array
        System.out.println("Array generado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
