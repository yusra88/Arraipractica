import java.util.Scanner;

public class araiproyecto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "MANZANA", "FRESA", "PERA", "BANANA", "PEÑA" };
		Scanner Scan = new Scanner(System.in);
		boolean hay = false;
			System.out.print("introduce una fruta:");
			String fruta = Scan.nextLine();
			int i = 0;
			 while (i < 5) {
				 if(array[i].equalsIgnoreCase(fruta)) {
					 hay=true;
					 break;
				 }
				 i++;
			 }
			
			
			if (hay) {
				System.out.println("ok");
			} else {
				System.out.println("no");
			}
		}
	}


