package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class gameHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("This program wil calculator a durin gameplay: ");

		String ask;

		do {

			System.out.print("Enter the initial hour: ");
			int initial = sc.nextInt();
			System.out.print("Enter the final hour: ");
			double fim = sc.nextInt();

			double duration = (initial < fim) ? fim - initial : 24 - initial + fim;
			
			System.out.printf("The game play duration is: %.0f hours\n", duration);

			sc.nextLine();
			System.out.print("Wish to contínue, enter Y or other to exit ");
			ask = sc.nextLine().toUpperCase();
		} while (ask.charAt(0) == 'Y');

		sc.close();
	}

}
