package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class findRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	double value;
	System.out.print("Enter the value to find it's range: ");
	value = sc.nextDouble();
	
	do {
		if(value>=0&&value<=25) {
			
			System.out.println("Range: [0, 25)");
			
		}else if(value>=25.1&&value<=50) {
			
			System.out.println("Range: (25, 50)");

			
		}else if(value>=50.1&&value<=75) {
			
			System.out.println("Range: (50, 75)");

			
		}else if(value>=75.1&&value<=100) {
			
			System.out.println("Range: (75, 100]");

		}else {
			
			System.out.println("Out of range");
		}
			
		System.out.print("Continue requesting or enter 0 to exit: ");
		value = sc.nextDouble();
	}while(value!=0);
	
	
	
	
	
	
	sc.close();
	}

}
