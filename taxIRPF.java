package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class taxIRPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String ask;
		do {
			System.out.print("Enter your salary to calcule a IRPF tax: ");
			double salary = sc.nextDouble();

			double tax = (salary <= 2000.0) ? 0
					: (salary > 2000.0 && salary <= 3000.0) ? (salary - 2000.0) * 0.08
							: (salary > 3000.0 && salary <= 4500.0) ? 1000 * 0.08 + (salary - 3000.0) * 0.18
									: 1000 * 0.08 + 1500 * 0.18 + (salary - 4500) * 0.28;

			double netSalary = salary - tax;

			if (tax == 0.0) {
				System.out.println("Tax: ISENTO");
			} else
				System.out.printf("Salary: %.2f; Taxable Salary: %.2f; TAX: %.2f; Net Salary: %.2f\n", salary,
						salary - 2000.0, tax, netSalary);
			sc.nextLine();
			do {
				System.out.print("To Continue, enter Y. To Exit, enter N: ");
				ask = sc.nextLine().toUpperCase();
				int answer;
				if (ask.charAt(0) == 'Y') {
					answer = 1;
				} else if (ask.charAt(0) == 'N') {
					answer = 0;
				} else {
					answer = 2;
				}
				switch (answer) {
				case 1:
					ask = "Y";
					break;
				case 0:
					ask = "N";
					break;

				default:
					System.out.println("Invalid Data\n");
					ask = "T";
					break;
				}

			} while (ask.charAt(0) == 'T');

		} while (ask.charAt(0) != 'N');

		System.out.println("\nTermineted Program");

		sc.close();
	}

}
