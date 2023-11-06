import java.util.Scanner;

public class araiproyecto3{
    public static void main(String[] args) {
        // Leer el número n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        
        // Definir el array de n elementos
        int[] array = new int[n];
        
        // Rellenar el array con números del 1 al 10
        int num = 1;
        for (int i = 0; i < n; i++) {
            array[i] = num;
            num++;
            if (num > 10) {
                num++;
                
            }
        }
        
        // Imprimir el array
        System.out.println("Array generado:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

