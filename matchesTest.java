package ExerciciosParaIniciantes;

import java.util.Scanner;

import entitites.ProdPensionato;

public class matchesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = "1";
		
		System.out.println(str.matches("[0-9.]+"));		
		boolean nome = "Maria".matches("(?i)maria");
		System.out.println("Retorno = "+nome);
		System.out.println("---------------------");
		
		boolean email = "@".matches(".");
		System.out.println("Qualquer caractere: "+email);

		boolean numero = "a".matches("\\d");
		System.out.println("Possui número: "+numero);
				
		numero = "aleca2".matches("\\d.");
		System.out.println("Possui número: "+numero);

		boolean letrasNumeros = "A2".matches("\\w\\d");
		System.out.println("Possui letras e números? "+letrasNumeros);

		boolean espaco = " ".matches("\\s");
		System.out.println("Possui espaço? "+espaco);


		sc.close();
	
	}

}
