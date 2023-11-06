package examen;
import java.util.Scanner;


		public class ej1 {

		    public static void main(String[] args) {
		       
		        int num;
		        Scanner scan=new Scanner(System.in);
		        //num=Integer.parseInt(scan.nextLine());
		        num=scan.nextInt();
		        if(num>=90 && num<=100){
		            System.out.println("A");
		        }else if(num>=80 && num<=89){
		            System.out.println("B");
		        }else if(num>=70 && num<=79){
		            System.out.println("C");
		        }else if(num>=60 && num<=69){
		            System.out.println("D");
		        }else if(num<60 && num>=0){
		            System.out.println("F");
		        }else if(num<0 || num>100){
		            System.out.println("El número introducido no está entre el 0 y 100");
		    }
		    }
		}

