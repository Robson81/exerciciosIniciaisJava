package ExerciciosParaIniciantes;

import java.util.Scanner;

public class gasCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter de code of your favorite FUEL or 4 to Exit/Finalize");
	System.out.println("1 to GAS");
	System.out.println("2 to ALCOHOL");
	System.out.println("3 to DIESEL");
	int fuel = sc.nextInt();
	int gasSum = 0;
	int alcoholSum = 0;
	int dieselSum = 0;
	while(fuel!=4) {
		if(fuel==1) {
		gasSum +=1;
	}else if(fuel == 2){
		alcoholSum +=1;
	}else if (fuel==3) {
		dieselSum +=1;
	}else if(fuel!=1&&fuel!=2&&fuel!=3&&fuel!=4) {
		System.out.println("Enter a Valid CODE");
		System.out.println("1 to GAS");
		System.out.println("2 to ALCOHOL");
		System.out.println("3 to DIESEL");
	}
		fuel = sc.nextInt();
		
	}
	System.out.println("Thanks!");
	System.out.println("Gas: " + gasSum);
	System.out.println("Alcohol: " + alcoholSum);
	System.out.println("Diesel: " + dieselSum);
	sc.close();
	}

}
