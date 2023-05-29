package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class employeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	int id, workedHour;
	String ask;
	double workedHourValue, salary;
	
	do {
		
		System.out.println("Enter the employee data:");
		System.out.print("Id: ");
		id = sc.nextInt();
		System.out.print("Worked Hour: ");
		workedHour = sc.nextInt();
		System.out.print("Worked Hour Value: ");
		workedHourValue = sc.nextDouble();
		salary = workedHour*workedHourValue;
		System.out.println("========================");
		System.out.println("Employee ID: " + id);
		System.out.printf("Salary: U$ %.2f\n", salary);
		System.out.println("------------------------");
		sc.nextLine();
		System.out.print("Wish to cadaster other employee? Prie Y to Yes or other to exit: \n");
		ask = sc.nextLine();
		
	}while(ask.toUpperCase().charAt(0)=='Y');
	System.out.println("\n\nTermineted Program!");
	
	
	sc.close();
	}

}
