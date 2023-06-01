package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class carsParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	 
	int code2, code1, quantity1, quantity2;
	double unityValue1, unityValue2, totalValue;
	
	System.out.println("Enter the data of Cars parts to cadaster: ");
	String ask;
	
	do {
		
		System.out.print("1St Part Code: ");
		code1 = sc.nextInt();
		System.out.print("Quantity: ");
		quantity1 = sc.nextInt();
		System.out.print("Unit Value: ");
		unityValue1 = sc.nextDouble();
		System.out.println("-===-====-===-====-===-====-===-");
		System.out.print("2St Part Code: ");
		code2 = sc.nextInt();
		System.out.print("Quantity: ");
		quantity2 = sc.nextInt();
		System.out.print("Unit Value: ");
		unityValue2 = sc.nextDouble();
		sc.nextLine();
		totalValue = quantity1*unityValue1 + quantity2*unityValue2;
		System.out.printf("Total to Pay: %.2f\n", totalValue);
		
		System.out.print("Wish contiue to bay? Prime Y to yes or other to exit");
		ask = sc.nextLine().toUpperCase();
		System.out.println("\n");
			
	}while(ask.charAt(0)=='Y');
	
	System.out.println("\n\nTerminated Program!");
	
	
	sc.close();
	}

}
