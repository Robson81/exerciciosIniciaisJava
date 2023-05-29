package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class geometricArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double a,b,c;
	double pi = 3.14159;
	String ask;
	do {
		System.out.println("Enter the values to A, B and C: ");
		System.out.print("A: ");
		a = sc.nextDouble();
		System.out.print("B: ");
		b = sc.nextDouble();
		System.out.print("C: ");
		c = sc.nextDouble();
		
		System.out.printf("The triangle area to  width %.2f and height %.2f is: %.2f", a, c, a*c/2);
		System.out.println();
		System.out.printf("The circle area to  raiud %.2f is: %.2f", c, pi*Math.pow(c, 2));
		System.out.println();
		System.out.printf("The trapeze area to  width %.2f and %.2f, and height %.2f is: %.2f", a, b, c,  ((a+b)*c)/2);
		System.out.println();
		System.out.printf("The square area to  side %.2f is: %.2f", b, b*b);
		System.out.println();
		System.out.printf("The rectangle area to  width %.2f and height %.2f is: %.2f", a, b, a*b);
		System.out.println();
		sc.nextLine();
		System.out.println("To continue enter y ou other to exit: ");
		ask = sc.nextLine().toUpperCase();
		
	}while(ask.charAt(0) =='Y');
	
	
	
	sc.close();
	}

}
