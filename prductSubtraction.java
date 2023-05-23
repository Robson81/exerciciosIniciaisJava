package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class prductSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	char ask;
	
	do {
	System.out.println(" Prime 4 values to calcule type: A*B - C*D: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	
	System.out.printf("The subtract of de product of %d*%d - %d*%d is: %d", a, b, c, d, a*b-c*d );
	System.out.println("\n");
	
	System.out.println("Wish continue to calculater? Prime y to YES or other to exit: ");
	ask = sc.next().charAt(0);
	
	}while(ask=='y'||ask=='Y');
	
	
	
	sc.close();
	}

}
