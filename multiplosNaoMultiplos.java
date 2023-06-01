package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class multiplosNaoMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	int a, b;
	
	
	String condicion, ask;
	
	do {
		
		System.out.println("Enter two numerical values ​​number to check their multiple or non-multiple condition");
		System.out.println("1St number: ");
		a = sc.nextInt();
		System.out.println("2St number: ");
		b = sc.nextInt();
		sc.nextLine();
		condicion = (a%b==0||b%a==0)? "SÃO MÚLTIPLOS":"NÃO SÃO MÚLTIPLOS";
		System.out.printf("%d e %d it is: %s\n\n", a, b, condicion);
		System.out.print("Wish verific other number? Enter Y to yes or other to exit: ");
		ask = sc.nextLine().toUpperCase();
		System.out.println();
	
	}while(ask.charAt(0)=='Y');
	
		
	sc.close();	
	}

}
