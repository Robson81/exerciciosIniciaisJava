package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class pontoQuadranteExpressaoTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			String ask;
		do {
			System.out.print("Enter the X point: ");
			double pointX = sc.nextDouble();
			System.out.print("Enter the Y point: ");
			double pointY = sc.nextDouble();
			String quadrante = (pointX > 0 && pointY > 0) ? "Q1": (pointX < 0 && pointY > 0) ? "Q2": (pointX < 0 && pointY < 0) ? "Q3" : (pointX > 0 && pointY < 0) ? "Q4" : "ORIGEM";
			sc.nextLine();
			System.out.println(quadrante);
			do {
				System.out.print("To Continue, enter Y. To Exit, enter N: ");
					ask = sc.nextLine().toUpperCase();
				int answer = (ask.charAt(0) == 'Y') ? 1 : (ask.charAt(0) == 'N') ? 0 : 2;

				ask = (answer == 1) ? "Y" : (answer == 0) ? "N" : "T";
				if(ask.charAt(0) == 'T') {
				System.out.println("Invalid Data\n");
				}
			} while (ask.charAt(0) == 'T');
		} while (ask.charAt(0) != 'N');

		System.out.println("\nTermineted Program");

		sc.close();
	}

}
