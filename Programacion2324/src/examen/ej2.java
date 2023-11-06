package examen;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {

		        Scanner scan=new Scanner(System.in);
		        double promedio;
		        int numFaltas;
		        System.out.println("introduce el promedio");
		        promedio=scan.nextDouble();
		        System.out.println("introduce el numero de faltas");
		        numFaltas=scan.nextInt();
		        if(promedio>=0  && promedio<=4){
		        	System.out.println("la media de calificaciones debe tiene que estar entre 0 y 4");
		      }else if(numFaltas<0) {
		    	  System.out.println("el numero de faltas no puede ser negativo");
		      }else if (promedio>=3.5 && numFaltas<=3) {
		    	  System.out.println("elegible");
		      }else {
		        	System.out.println("erreur");}
		        	
		        
	}

}
