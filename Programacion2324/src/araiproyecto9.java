import java.util.Scanner;
public class araiproyecto9 {

	

		  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		    double[] temperaturas = new double[7];
		    
		    // Ingresar las temperaturas diarias de la semana
		    for (int i = 0; i < 7; i++) {
		      System.out.print("Ingrese la temperatura en ºC para el día " + diasSemana[i] + ": ");
		      temperaturas[i] = scanner.nextDouble();
		    }
		    
		    // Calcular la temperatura media semanal en ºF
		    double sumaTemperaturasF = 0;
		    for (int i = 0; i < 7; i++) {
		      double temperaturaF = (temperaturas[i] * 9 / 5) + 32;
		      sumaTemperaturasF += temperaturaF;
		    }
		    double temperaturaMediaF = sumaTemperaturasF / 7;
		    
		    // Encontrar el día más caluroso
		    double maximaTemperatura = temperaturas[0];
		    int indiceMaximaTemperatura = 0;
		    for (int i = 1; i < 7; i++) {
		      if (temperaturas[i] > maximaTemperatura) {
		        maximaTemperatura = temperaturas[i];
		        indiceMaximaTemperatura = i;
		      }
		    }
		    
		    // Obtener los nombres de los días que han superado la media
		    String diasSuperaronMedia = "";
		    for (int i = 0; i < 7; i++) {
		      if (temperaturas[i] > temperaturaMediaF) {
		        diasSuperaronMedia += diasSemana[i] + ", ";
		      }
		    }
		    
		    System.out.println("\nTemperatura media semanal en ºF: " + temperaturaMediaF);
		    System.out.println("El día más caluroso: " + diasSemana[indiceMaximaTemperatura]);
		    System.out.println("Días que han superado la media: " + diasSuperaronMedia);
		  }
		}

	


