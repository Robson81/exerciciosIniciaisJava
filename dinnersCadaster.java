package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class dinnersCadaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter de Code of your dynner:");
		System.out.println("1 to HOTDOG  -         PRICE: U$ 4.00");
		System.out.println("2 to CHEASE  -         PRICE: U$ 4.50");
		System.out.println("3 to CHEASE  - BACON - PRICE: U$ 5.00");
		System.out.println("4 to TOASTER -         PRICE: U$ 2.00");
		System.out.println("5 to SODA    -         PRICE: U$ 1.50");

		
		int dynner = sc.nextInt();

		do {

			switch (dynner) {

			case 1:

				System.out.println("Your chouse: HOTDOG");
				System.out.print("chouse quantity: ");
				int quantity = sc.nextInt();
				double price = 4.0 * quantity;
				System.out.printf("Total: U$ %.2f\n", price);

				break;
			case 2:

				System.out.println("Your chouse: CHEASE");
				System.out.print("chouse quantity: ");
				quantity = sc.nextInt();
				price = 4.5 * quantity;
				System.out.printf("Total: U$ %.2f\n", price);

				break;
			case 3:

				System.out.println("Your chouse: CHEASE - BACON");
				System.out.print("chouse quantity: ");
				quantity = sc.nextInt();
				price = 5.0 * quantity;
				System.out.printf("Total: U$ %.2f\n", price);

				break;
			case 4:

				System.out.println("Your chouse: TOAST");
				System.out.print("chouse quantity: ");
				quantity = sc.nextInt();
				price = 2.0 * quantity;
				System.out.printf("Total: U$ %.2f\n", price);

				break;

			case 5:

				System.out.println("Your chouse: SODA");
				System.out.print("chouse quantity: ");
				quantity = sc.nextInt();
				price = 1.5 * quantity;
				System.out.printf("Total: U$ %.2f\n", price);

				break;
			default:
				System.out.println("Invalid chouse:");

				break;

			}

			System.out.print("Continue requesting or enter 0 to exit: ");
			dynner = sc.nextInt();

		} while (dynner != 0);
		System.out.println("\n");
		System.out.println("Terminated Program!");
		sc.close();
	}

}
