package ExerciciosParaIniciantes;
import java.util.Locale;
import java.util.Scanner;

public class pontoQuadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double pointX, pointY;
	String ask;
	
	do {
		
		System.out.print("Enter the X point: ");
		pointX = sc.nextDouble();
		System.out.print("Enter the Y point: ");
		pointY = sc.nextDouble();
		if (pointX>0&&pointY>0) {
			System.out.println("Q1");
		}else if(pointX<0&&pointY>0) {
			System.out.println("Q2");
		}else if(pointX<0&&pointY<0) {
			System.out.println("Q3");
		}else if(pointX>0&&pointY<0) {
			System.out.println("Q4");
		}else {
			System.out.println("ORIGEM");
		}
		sc.nextLine();
	
	do {
		System.out.print("To Continue, enter Y. To Exit, enter N: ");
		ask = sc.nextLine().toUpperCase();
		int answer;
		if(ask.charAt(0)=='Y') {
			answer = 1;
		}else if(ask.charAt(0)=='N') {
			answer = 0;
		}else {
			answer = 2;
		}
		switch(answer){
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
	}while(ask.charAt(0)=='T');
	
	}while(ask.charAt(0)!='N');
	
	System.out.println("\nTermineted Program");
	
	sc.close();
	}

}
