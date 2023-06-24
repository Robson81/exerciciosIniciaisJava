package ExerciciosParaIniciantes;

import java.util.Locale;
import java.util.Scanner;

import classesBPM.AritmeticaClass;

public class aritimeticaSimplesTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AritmeticaClass aritmetica = new AritmeticaClass();

		
		System.out.println("\nESTE PROGRAMA EXECUTARÁ A LISTA DE EXERCÍCIOS DE ALGORITMOS: SELEÇÃO DO BPM LAB\n");

		System.out.println("Entre com o código do TIPO de exercício, conforme tabela a baixo:");

		System.out.println("|==================================================================|");
		System.out.println("| ARITMÉTICA SIMPLES: 1      -  ESTRUTURAS DE SELEÇÃO: 2	   |");
		System.out.println("| ESTRUTURAS DE REPETIÇÃO: 3 -  ESTRUTURAS DE DADOS - MATRIZES: 4  |");
		System.out.println("| DESAFIOS: 5                                                      |");
		System.out.println("| OBS: UNIDADE DE MEDIDA SERÁ CM. UTILIZE . PARA CASAS DECIMAIS    |");
		System.out.println("|__________________________________________________________________|");

		System.out.print("Sua opção: ");
		String type = sc.nextLine();
		int num;
		int exer=0;

		if (isNumeric(type) != null) {
			num = Integer.valueOf(isNumeric(type));
		} else
			num = 0;
		int count = 0;
		do {
		if (num == 1) {
			if(count==0) {
			System.out.println("\nARITMÉTICA SIMPLES\n");
			System.out.println("|==================================================================|");
			System.out.println("| 1 - ÁREA DO RETANGULO; 2 - ÁREA DO QUADRADO, DADO SUA ARESTA;    |");
			System.out.println("| 3 - ÁREA DO QUADRADO, DADO SUA GIAGONAL; 4 - ÁREA DO TRIANGULO   |");
			System.out.println("| 5 - VOLUME DA ESFERA; 6 - MEDIA ARITIMÉTICA; 7 - MÉDIA GEOMETRICA|");
			System.out.println("| 8 - MILHAS VS KILOMETROS; 9 - LEI DE OHM; 10 - GRAUS VS FARHENHEIT|");
			System.out.println("| 11 - ÁREA DO CÍRCULO; 12 - VOL DO CONE; 13 - VELOCID DO AUTOMÓVEL|");
			System.out.println("| 14 - VOL DO CUBO E ESFERA; 15 - COTAÇÃO DO DOLLAR;               |");
			System.out.println("| 16 - FUNÇÕES TRIGONOMÉTRICAS; 17 - EXPONENCIAL E LOG NATURAL     |");
			System.out.println("| 18 - COMPRA E TROCO; ou 0 para SAIR                              |");
			System.out.println("|__________________________________________________________________|");
			count++;
			System.out.print("\nEntre com o código do problema que dejesa resolver: ");
			}
			type = sc.next();
			//int exer;
			if(isNumeric(type)!=null) {
				
				exer = Integer.valueOf(type);
			}else
				exer = 0;
			
			
			if(exer==1) {
				System.out.println("\nÁREA DO RETANGULO:");
				System.out.print("Base: ");
				double width = sc.nextDouble(); 
				System.out.print("Altura: ");
				double height = sc.nextDouble(); 
				double area = aritmetica.quadrilateralArea(width, height);
				System.out.printf("Area: %.2f cm²\n", area);
			}else if(exer==2) {
				System.out.println("\nÁREA DO QUADRADO, DADO SUA ARESTA:");
				System.out.print("Aresta: ");
				double width = sc.nextDouble(); 
				double area = aritmetica.quadrilateralArea(width);
				System.out.printf("Area: %.2f cm²\n", area);
			}else if(exer==3) {
				System.out.println("\nÁREA DO QUADRADO, DADO SUA DIAGONAL:");
				System.out.print("Diagonal: ");
				double width = sc.nextDouble(); 
				double area = aritmetica.quadrilateralDiagonalArea(width);
				System.out.printf("Area: %.2f cm²\n", area);
			}else if(exer==4) {
				System.out.println("\nÁREA DO TRIANGULO:");
				System.out.print("Base: ");
				double width = sc.nextDouble(); 
				System.out.print("Altura: ");
				double height = sc.nextDouble(); 
				double area = aritmetica.triangleArea(width, height);
				System.out.printf("Area: %.2f cm²\n", area);
			}else if(exer==5) {
				System.out.println("\nVOLUME DA ESFERA:"); 
				System.out.print("Diametro: ");
				double diameter = sc.nextDouble(); 
				double volume = aritmetica.spheareVolume(diameter);
				System.out.printf("Volume: %.2f cm³\n", volume);
			}else if(exer==6) {
				System.out.println("\nMÉDIA ARITMÉTICA DE 4 VALORES:"); 
				double sum = 0;
				double average;
				double[] value = new double[4];
				for (int i = 0; i < value.length; i++) {
					
					System.out.printf( (i+1)+ "º valor: ");
					 value[i] = sc.nextDouble();
					 sum += value[i];
				} 
				average = aritmetica.arithmeticAverage(sum, value.length);
				System.out.printf("Média Aritmetica: %.2f\n", average);
			}else if(exer==7) {
				System.out.println("\nMÉDIA GEOMÉTICA DE 2 VALORES:"); 
				double multiply = 1;
				double average;
				double[] value = new double[2];
				for (int i = 0; i < value.length; i++) {
					
					System.out.printf( (i+1) + "º valor: ");
					 value[i] = sc.nextDouble();
					 multiply *= value[i];
				} 
				average = aritmetica.geometricAverage(multiply);
				System.out.printf("Média Geométrica: %.2f\n", average);
			}else if(exer==8) {
				System.out.println("\nMILHAS NAUTICAS PARA KILOMETROS:"); 
				System.out.print("Milhas nauticas a Converter: ");
				double nauticalMiles = sc.nextDouble();
				double km = aritmetica.nauticalMilesConverter(nauticalMiles);
				System.out.printf("Kilometros correspondentes: %.2f km\n", km);
			}else if(exer==9) {
				System.out.println("\nLEI DE OHM:"); 
				System.out.print("Entre com o Valor da Corrente Elétrica: ");
				double corrente = sc.nextDouble();
				System.out.print("Entre com o Valor da diferença de potencial DDP: ");
				double ddp = sc.nextDouble();
				double resistencia = aritmetica.ohmsLaw(corrente, ddp);
				System.out.printf("A Resistência elétrica do circuito é: %.2f ohms\n", resistencia);
			}else if(exer==10) {
				System.out.println("\nGRAUS VS FARHENHEIT:"); 
				System.out.print("Entre com o a temperatura em Graus Celcius: ");
				double graus = sc.nextDouble();
				double farhenheit = aritmetica.fahrenheitConverter(graus);
				System.out.printf("A Temperatura em Resistência farhenheit é: %.2f ºF\n", farhenheit);
			}else if(exer==11) {
				System.out.println("\nÁREA DO CÍRCULO:"); 
				System.out.print("Entre com o diametro do circulo: ");
				double diameter = sc.nextDouble();
				double area = aritmetica.circleArea(diameter);
				System.out.printf("A Área do círculo é: %.2f cm²\n", area);
			}else if(exer==12) {
				System.out.println("\nVOLUME DO CONE:"); 
				System.out.print("Entre com a altura do cone: ");
				double height = sc.nextDouble();
				System.out.print("Entre com o raio da base do cone: ");
				double radius = sc.nextDouble();
				double volume = aritmetica.coneVolume(height, radius);
				System.out.printf("O Volume do Cone é: %.2f cm³\n", volume);
			}else if(exer==13) {
				System.out.println("\nVELOCIDADE DO AUTOMÓVEL:"); 
				System.out.print("Entre com a velocidade inicial em m/s: ");
				double vInicial = sc.nextDouble();
				System.out.print("Entre com o tempo do percurso em segundos: ");
				double tempo = sc.nextDouble();
				System.out.print("Entre com a acelaração escalar do veículo: ");
				double aceleracao = sc.nextDouble();
				double vFinal = aritmetica.finalVelocity(vInicial, tempo, aceleracao);
				System.out.printf("A Velocidade final do veículo é: %.2f km/h\n", vFinal);
			}else if(exer==14) {
				System.out.println("\nVOLUME DO CUBO REGULAR O QUAL POSSUI UMA ESFERA INSCRITA:"); 
				System.out.print("Entre com o valor da Aresta do Cubo: ");
				double aresta = sc.nextDouble();
				System.out.print("Entre com o valor do Raio da Esfera: ");
				double raio = sc.nextDouble();
				double vLivre = aritmetica.sphereVolumeCubeVolume(aresta, raio);
				System.out.printf("O volume Livre do sistema Vol. do cubo -  Vol. da esfera é: %.2f cm³", vLivre);
			}else if(exer==15) {
				System.out.println("\nCOTAÇÃO DO DOLAR:"); 
				System.out.print("Entre com a cotação atual do dollar: ");
				double cotacao = sc.nextDouble();
				System.out.print("Entre com o valor que pretende comprar em dolar: ");
				double totalDolar = sc.nextDouble();
				double valorEmReais = aritmetica.currencyConverter(cotacao, totalDolar);
				System.out.printf("O valor a pagar em reais pelos dolares é: %.2f cm³", valorEmReais);
			}else if(exer==16) {
				System.out.println("\nFUNÇÕES TRIGONOMETRICAS:"); 
				System.out.print("Entre com o valor de um angulo em graus para calcular seu Seno, Cos, Tang e Sec: ");
				double angulo = sc.nextDouble();
				System.out.print(aritmetica.trigonometricfunctions(angulo));
				
			}else if(exer==17) {
				System.out.println("\nFEXPONENCIAL E LOG NATURAL de 2 valores X e Y:"); 
				System.out.print("Entre com o valor de X: ");
				double x = sc.nextDouble();
				System.out.print("Entre com o valor de Y: ");
				double y = sc.nextDouble();
				System.out.printf(aritmetica.powFuctionLogFuction(x, y));
				System.out.println();
				
			}else if(exer==18) {
				System.out.println("\nCOMPRA E TROCO: Entre com os valores dos 5 produtos"); 
				
				double sum = 0;
				
				double[] value = new double[5];
				for (int i = 0; i < value.length; i++) {
					
					System.out.printf( (i+1)+ "º valor: ");
					 value[i] = sc.nextDouble();
					 sum += value[i];
				} 
				System.out.println("Apresente o valor em dinheiro para verificar se você receberá troco: ");
				double vPago = sc.nextDouble();
				do {
					if(vPago<sum) { 
						System.out.println("\nValor insuficiente para pagar os valor total dos produtos");
						System.out.print("Entre com o novo valor para pagar");
						vPago = sc.nextDouble();	
					}
				}while(vPago<sum);
				System.out.printf("Seu troco Será: %.2f\n", aritmetica.change(vPago, sum));
			}else {
				System.out.print("\nOpção Inválida! Entre com o código do problema, conforme tabela: ");
				
			}
			
			//num = -1;
		} else if (num == 2) {
			System.out.println("ESTRUTURAS DE SELEÇÃO");

			num = -1;

		} else if (num == 3) {
			System.out.println("ESTRUTURAS DE REPETIÇÃO");
			num = -1;

		} else if (num == 4) {
			System.out.println("ESTRUTURAS DE DADOS - MATRIZES");
			num = -1;

		} else if (num == 5) {
			System.out.println("DESAFIOS");
			num = -1;
		} else {
			System.out.println();
		System.out.print("Opção Inválida! Entre com o código do TIPO de exercício, conforme tabela: ");
		type = sc.nextLine();
		if (isNumeric(type) != null) {
			num = Integer.valueOf(isNumeric(type));
		} else
			num = 0;
		}
		if(num <=5&&exer<19&&exer!=0)
				System.out.print("\nPara continuar, entre com o código de um problema, conforme tabela ou 0 para sair: ");
				if(num==0){
					num=-1;
				}
		}while(num !=-1);
		System.out.println("\n\nO programa: Aritmécica Simples, foi encerrado");
		sc.close();
	}

	private static String isNumeric(String str) {

		if (str.matches("[0-9]+")) {
			 //str != null &&
			return str;
		} else

			return null;
	}

}
