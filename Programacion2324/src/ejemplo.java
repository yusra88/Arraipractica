

import java.util.Scanner;

public class ejemplo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
      
        num=scanner.nextInt();
        int mayor=num;
        System.out.print("Ingrese un número ");
        for(int i=0;i<=10;i++) 
        	if(num>mayor) {
        		System.out.print("Ingrese el número " + i + ": ");
        }
        	
        
    
    }
}