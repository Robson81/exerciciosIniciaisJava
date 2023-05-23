package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("This program will sum some values ​​until you want to exit\n\n");

		char ask;
		do {

			System.out.println("Prime two number do calculate");
			System.out.print("1st: ");
			int a = sc.nextInt();
			System.out.print("2st: ");
			int b = sc.nextInt();

			int sum = a + b;

			System.out.printf("The sum of %d and %d is: %d\n", a, b, sum);
			System.out.print("Wish sum others values? Prime y to Yes or other to exit: ");

			ask = sc.next().charAt(0);
			System.out.println("\n");

		} while (ask == 'y' || ask == 'Y');

		System.out.println("Program SUM is Termined!");
		
		System.out.println("Now this program will calculate a area sphere\n\n");

		
		do {

			System.out.println("Prime the radius to calculate the area sphere");
			System.out.print("Radius: ");
			double radius = sc.nextDouble();
			

			double area = 3.14159 * Math.pow(radius, 2);

			System.out.printf("The area of sphere radius %.2f is: %.4f\n", radius, area);
			System.out.print("Wish calculate others area sphere? Prime y to Yes or other to exit: ");

			ask = sc.next().charAt(0);
			System.out.println("\n");
			//radius = 0;
		} while (ask == 'y' || ask == 'Y');

		System.out.println("Terminated Program!");
		
		

		sc.close();
	}

}
