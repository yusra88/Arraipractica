package examen;

import java.util.Scanner;
public class ej3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String diaSemana;
		System.out.print("Ingresa el día de la semana: ");
		diaSemana = scan.nextLine();
		if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miércoles") || diaSemana.equals("miercoles") || diaSemana.equals("jueves") || diaSemana.equals("viernes")) {
			System.out.print("la tienda abre de 9:00AM -8:00PM ");
		}else if (diaSemana.equals("sabado")){
			System.out.print("la tienda esta cerada ");
		}else if (diaSemana.equals("Domingo")){
				System.out.print("la tienda esta cerada todo el dia ");
			}else {
			System.out.print("erreur ");
		}

	}

}
