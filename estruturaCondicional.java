package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number to verificted if it is negativ or not negativ");
	int number = sc.nextInt();
	
	String valor = (number>=0)? "NÃO NEGATIVO":"NEGATIVO";
	System.out.println("The informed number is: " + valor);
	
	System.out.println("Enter a value to verificted if it is even or odd");
	int value = sc.nextInt();
	
	String valor2 = (value%2==0)? "PAR":"IMPAR";
	System.out.println("The informed number is: " + valor2);
	
	
	sc.close();
	}

}
