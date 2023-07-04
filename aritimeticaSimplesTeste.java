package ExerciciosParaIniciantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import classesBPM.AritmeticaClass;
import classesBPM.ExtruturasdeSelecao;

public class aritimeticaSimplesTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String a = "ARITMÉTICA SIMPLES";
		String b = "EXTRUTURAS DE SELEÇÃO";
		String c = "EXTRUTURAS DE REPETIÇÃO";
		String d = "EXTRUTURAS DE DADOS - MATRIZES";
		String e = "DESAFIO";
		String option = "";
		String type;
		AritmeticaClass aritmetica = new AritmeticaClass();
		ExtruturasdeSelecao selecao = new ExtruturasdeSelecao();

		System.out.println("\nESTE PROGRAMA EXECUTARÁ A LISTA DE EXERCÍCIOS DE ALGORITMOS: SELEÇÃO LAB BPM\n");

		do {
			System.out.println("Entre com o código do TIPO de exercício, conforme tabela a baixo:");
			System.out.println("|==================================================================|");
			System.out.println("| 1 - ARITMÉTICA SIMPLES                                           |");
			System.out.println("| 2 - ESTRUTURAS DE SELEÇÃO                                        |");
			System.out.println("| 3 - ESTRUTURAS DE REPETIÇÃO                                      |");
			System.out.println("| 4 - ESTRUTURAS DE DADOS - MATRIZES                               |");
			System.out.println("| 5 - DESAFIOS                                                     |");
			System.out.println("| 0 - PARA SAIR                                                    |");
			System.out.println("|__________________________________________________________________|");

			System.out.print("Sua opção: ");
			type = sc.nextLine();
			int num;
			int exer = 0;
			if (isNumeric(type) != null) {
				num = Integer.valueOf(isNumeric(type));
				option = (num == 1) ? a : (num == 2) ? b : (num == 3) ? c : (num == 4) ? d : (num == 5) ? e : "";

			} else
				num = 0;
			int count = 0;
			do {
				if (num == 1) {
					if (count == 0) {
						System.out.println("\nARITMÉTICA SIMPLES\n");
						System.out.println("Entre com o código do problema que dejesa resolver: ");
						System.out.println("|===================================================================|");
						System.out.println("| 1  - ÁREA DO RETANGULO;           2  - ÁREA DO QUADRADO - ARESTA; |");
						System.out.println("| 3  - ÁREA DO QUADRADO - DIAGONAL; 4  - ÁREA DO TRIANGULO          |");
						System.out.println("| 5  - VOLUME DA ESFERA;            6  - MEDIA ARITIMÉTICA;         |");
						System.out.println("| 7  - MÉDIA GEOMETRICA;            8  - MILHAS VS KILOMETROS;      |");
						System.out.println("| 9  - LEI DE OHM;                  10 - GRAUS VS FARHENHEIT;       |");
						System.out.println("| 11 - ÁREA DO CÍRCULO;             12 - VOL DO CONE;               |");
						System.out.println("| 13 - VELOCID DO AUTOMÓVEL;        14 - VOL DO CUBO E ESFERA;      |");
						System.out.println("| 15 - COTAÇÃO DO DOLLAR;           16 - FUNÇÕES TRIGONOMÉTRICAS;   |");
						System.out.println("| 17 - EXPONENCIAL E LOG NATURAL    18 - COMPRA E TROCO;	    |");
						System.out.println("| 0  - PARA SAIR                                                    |");
						System.out.println("|___________________________________________________________________|");
						count++;
						System.out.print("Sua opção: ");
						type = sc.next();

						if (isNumeric(type) != null)
							exer = Integer.valueOf(type);

					}

					if (exer == 1) {
						System.out.println("\nÁREA DO RETANGULO:");
						System.out.print("Base: ");
						double width = sc.nextDouble();
						System.out.print("Altura: ");
						double height = sc.nextDouble();
						double area = aritmetica.quadrilateralArea(width, height);
						System.out.printf("Area: %.2f cm²\n", area);
					} else if (exer == 2) {
						System.out.println("\nÁREA DO QUADRADO, DADO SUA ARESTA:");
						System.out.print("Aresta: ");
						double width = sc.nextDouble();
						double area = aritmetica.quadrilateralArea(width);
						System.out.printf("Area: %.2f cm²\n", area);
					} else if (exer == 3) {
						System.out.println("\nÁREA DO QUADRADO, DADO SUA DIAGONAL:");
						System.out.print("Diagonal: ");
						double width = sc.nextDouble();
						double area = aritmetica.quadrilateralDiagonalArea(width);
						System.out.printf("Area: %.2f cm²\n", area);
					} else if (exer == 4) {
						System.out.println("\nÁREA DO TRIANGULO:");
						System.out.print("Base: ");
						double width = sc.nextDouble();
						System.out.print("Altura: ");
						double height = sc.nextDouble();
						double area = aritmetica.triangleArea(width, height);
						System.out.printf("Area: %.2f cm²\n", area);
					} else if (exer == 5) {
						System.out.println("\nVOLUME DA ESFERA:");
						System.out.print("Diametro: ");
						double diameter = sc.nextDouble();
						double volume = aritmetica.spheareVolume(diameter);
						System.out.printf("Volume: %.2f cm³\n", volume);
					} else if (exer == 6) {
						System.out.println("\nMÉDIA ARITMÉTICA DE 4 VALORES:");
						double sum = 0;
						double average;
						double[] value = new double[4];
						for (int i = 0; i < value.length; i++) {

							System.out.printf((i + 1) + "º valor: ");
							value[i] = sc.nextDouble();
							sum += value[i];
						}
						average = aritmetica.arithmeticAverage(sum, value.length);
						System.out.printf("Média Aritmetica: %.2f\n", average);
					} else if (exer == 7) {
						System.out.println("\nMÉDIA GEOMÉTICA DE 2 VALORES:");
						double multiply = 1;
						double average;
						double[] value = new double[2];
						for (int i = 0; i < value.length; i++) {

							System.out.printf((i + 1) + "º valor: ");
							value[i] = sc.nextDouble();
							multiply *= value[i];
						}
						average = aritmetica.geometricAverage(multiply);
						System.out.printf("Média Geométrica: %.2f\n", average);
					} else if (exer == 8) {
						System.out.println("\nMILHAS NAUTICAS PARA KILOMETROS:");
						System.out.print("Milhas nauticas a Converter: ");
						double nauticalMiles = sc.nextDouble();
						double km = aritmetica.nauticalMilesConverter(nauticalMiles);
						System.out.printf("Kilometros correspondentes: %.2f km\n", km);
					} else if (exer == 9) {
						System.out.println("\nLEI DE OHM:");
						System.out.print("Entre com o Valor da Corrente Elétrica: ");
						double corrente = sc.nextDouble();
						System.out.print("Entre com o Valor da diferença de potencial DDP: ");
						double ddp = sc.nextDouble();
						double resistencia = aritmetica.ohmsLaw(corrente, ddp);
						System.out.printf("A Resistência elétrica do circuito é: %.2f ohms\n", resistencia);
					} else if (exer == 10) {
						System.out.println("\nGRAUS VS FARHENHEIT:");
						System.out.print("Entre com o a temperatura em Graus Celcius: ");
						double graus = sc.nextDouble();
						double farhenheit = aritmetica.fahrenheitConverter(graus);
						System.out.printf("A Temperatura em Resistência farhenheit é: %.2f ºF\n", farhenheit);
					} else if (exer == 11) {
						System.out.println("\nÁREA DO CÍRCULO:");
						System.out.print("Entre com o diametro do circulo: ");
						double diameter = sc.nextDouble();
						double area = aritmetica.circleArea(diameter);
						System.out.printf("A Área do círculo é: %.2f cm²\n", area);
					} else if (exer == 12) {
						System.out.println("\nVOLUME DO CONE:");
						System.out.print("Entre com a altura do cone: ");
						double height = sc.nextDouble();
						System.out.print("Entre com o raio da base do cone: ");
						double radius = sc.nextDouble();
						double volume = aritmetica.coneVolume(height, radius);
						System.out.printf("O Volume do Cone é: %.2f cm³\n", volume);
					} else if (exer == 13) {
						System.out.println("\nVELOCIDADE DO AUTOMÓVEL:");
						System.out.print("Entre com a velocidade inicial em m/s: ");
						double vInicial = sc.nextDouble();
						System.out.print("Entre com o tempo do percurso em segundos: ");
						double tempo = sc.nextDouble();
						System.out.print("Entre com a acelaração escalar do veículo: ");
						double aceleracao = sc.nextDouble();
						double vFinal = aritmetica.finalVelocity(vInicial, tempo, aceleracao);
						System.out.printf("A Velocidade final do veículo é: %.2f km/h\n", vFinal);
					} else if (exer == 14) {
						System.out.println("\nVOLUME DO CUBO REGULAR O QUAL POSSUI UMA ESFERA INSCRITA:");
						System.out.print("Entre com o valor da Aresta do Cubo: ");
						double aresta = sc.nextDouble();
						System.out.print("Entre com o valor do Raio da Esfera: ");
						double raio = sc.nextDouble();
						double vLivre = aritmetica.sphereVolumeCubeVolume(aresta, raio);
						System.out.printf("O volume Livre do sistema Vol. do cubo -  Vol. da esfera é: %.2f cm³",
								vLivre);
					} else if (exer == 15) {
						System.out.println("\nCOTAÇÃO DO DOLAR:");
						System.out.print("Entre com a cotação atual do dollar: ");
						double cotacao = sc.nextDouble();
						System.out.print("Entre com o valor que pretende comprar em dolar: ");
						double totalDolar = sc.nextDouble();
						double valorEmReais = aritmetica.currencyConverter(cotacao, totalDolar);
						System.out.printf("O valor a pagar em reais pelos dolares é: %.2f cm³", valorEmReais);
					} else if (exer == 16) {
						System.out.println("\nFUNÇÕES TRIGONOMETRICAS:");
						System.out.print(
								"Entre com o valor de um angulo em graus para calcular seu Seno, Cos, Tang e Sec: ");
						double angulo = sc.nextDouble();
						System.out.print(aritmetica.trigonometricfunctions(angulo));

					} else if (exer == 17) {
						System.out.println("\nFEXPONENCIAL E LOG NATURAL de 2 valores X e Y:");
						System.out.print("Entre com o valor de X: ");
						double x = sc.nextDouble();
						System.out.print("Entre com o valor de Y: ");
						double y = sc.nextDouble();
						System.out.printf(aritmetica.powFuctionLogFuction(x, y));
						System.out.println();

					} else if (exer == 18) {
						System.out.println("\nCOMPRA E TROCO: Entre com os valores dos 5 produtos");

						double sum = 0;

						double[] value = new double[5];
						for (int i = 0; i < value.length; i++) {

							System.out.printf((i + 1) + "º valor: ");
							value[i] = sc.nextDouble();
							sum += value[i];
						}
						System.out.println("Apresente o valor em dinheiro para verificar se você receberá troco: ");
						double vPago = sc.nextDouble();
						do {
							if (vPago < sum) {
								System.out.println("\nValor insuficiente para pagar os valor total dos produtos");
								System.out.print("Entre com o novo valor para pagar");
								vPago = sc.nextDouble();
							}
						} while (vPago < sum);
						System.out.printf("Seu troco Será: %.2f\n", aritmetica.change(vPago, sum));
					} else {
						System.out.print("\nOpção Inválida! Entre com o código do problema, conforme tabela: ");
						type = sc.next();

						if (isNumeric(type) != null)
							exer = Integer.valueOf(type);
					}
					System.out.print("\nPara continuar, entre com o código do problema ou 0 para sair: ");
					type = sc.next();

					if (isNumeric(type) != null)
						exer = Integer.valueOf(type);
					if (exer == 0)
						num = -1;
				} else if (num == 2) {

					if (count == 0) {
						System.out.println("\nESTRUTURAS DE SELEÇÃO\n");
						System.out.println("Entre com o código do problema que dejesa resolver: ");
						System.out.println("|==================================================================|");
						System.out.println("| 1 - MAIOR VALOR - MENOR VALOR;                                   |");
						System.out.println("| 2 - TERRENO GRANDE;         				           |");
						System.out.println("| 3 - TERRENO GRANDE VS TERRENO PEQUENO;                           |");
						System.out.println("| 4 - PESO IDEAL, CONSIDERANDO SEXO                                |");
						System.out.println("| 5 - CONDIÇÃO DE EXISTÊNCIA E TIPO DO TRIANGULO;                  |");
						System.out.println("| 7 - VELOCIDADE PERMITIDA; 				           |");
						System.out.println("| 8 - ALUNO APROVADO;        				           |");
						System.out.println("| 9 - NOTA PARA APROVAÇÃO;                                         |");
						System.out.println("| 0 - Para SAIR                                                    |");
						System.out.println("|__________________________________________________________________|");
						count++;
						System.out.print("Sua opção: ");
						type = sc.next();

						if (isNumeric(type) != null)
							exer = Integer.valueOf(type);

					}

					if (exer == 1) {

						System.out.println("\nMAIOR VALOR E MENOR VALOR:");
						System.out.print("Informe a quantidade de elementos de deseja verificar:  ");
						int n = sc.nextInt();
						ExtruturasdeSelecao[] vect = new ExtruturasdeSelecao[n];
						double maior = -100000000;
						double menor = 100000000;
						for (int i = 0; i < vect.length; i++) {
							System.out.print("Entre com o " + (i + 1) + "º valor: ");
							double x = sc.nextDouble();
							vect[i] = new ExtruturasdeSelecao(x);
							if (vect[i].getNum() > maior)
								maior = vect[i].getNum();
							if (vect[i].getNum() < menor)
								menor = vect[i].getNum();

						}
						if (maior != menor) {
							System.out.printf("O Maior número é: %.1f\n", maior);
							System.out.printf("O Menor número é: %.1f\n", menor);
						} else
							System.out.printf("Os valores digitados são iguais\n");
					} else if (exer == 2) {
						System.out.println("\nTERRENO GRANDE:");

						System.out.println("Informe as médidas do terreno (em metros) para verificar seu tamanho: ");
						System.out.print("Comprimento: ");
						double width = sc.nextDouble();
						System.out.print("Largura: ");
						double height = sc.nextDouble();
						double area = aritmetica.quadrilateralArea(width, height);
						if (area > 100)
							System.out.println("O área é maior do que 100m², portanto, é um Terreno Grande");
						System.out.printf("Área do terreno é: %.2f m²\n", area);

					} else if (exer == 3) {
						ExtruturasdeSelecao[] vect = new ExtruturasdeSelecao[2];
						System.out.println("\nTERRENO GRANDE VS TERRENO PEQUENO:");
						for (int i = 0; i < vect.length; i++) {
							System.out.printf(
									"Informe as médidas do %d terreno (em metros) para verificar seu tamanho: \n",
									i + 1);
							System.out.print("Comprimento: ");
							double width = sc.nextDouble();
							System.out.print("Largura: ");
							double height = sc.nextDouble();
							vect[i] = new ExtruturasdeSelecao(width, height);
						}

						if (vect[0].getWidth() * vect[0].getHeight() != vect[1].getWidth() * vect[1].getHeight()) {
							if (vect[0].getWidth() * vect[0].getHeight() > vect[1].getWidth() * vect[1].getHeight())
								System.out.println("\nO primeiro terreno é Maior");
							else
								System.out.println("\nO segundo terreno é Maior");
						} else
							System.out.println("Os terrenos são do mesmo tamanho");

					} else if (exer == 4) {
						System.out.println("\nPESO IDEAL, CONSIDERANDO SEXO:");
						System.out.println("Informe os dados a baixo: ");
						System.out.print("Sexo (M p/ mascuino ou F p/ feminino): ");
						sc.nextLine();
						String sexo = sc.nextLine().toLowerCase();
						System.out.print("Altura em metros: ");
						double altura = sc.nextDouble();
						System.out.print("Peso em kg: ");
						double peso = sc.nextDouble();
						System.out.println();
						System.out.println(selecao.imc(sexo, altura, peso));
						// System.out.println();
					} else if (exer == 5) {
						System.out.println("\nCONDIÇÃO DE EXISTÊNCIA E TIPO DO TRIANGULO:");
						System.out.print("Informe o PRIMEIRO cateto: ");
						double la = sc.nextDouble();
						System.out.print("Informe o SEGUNDO cateto: ");
						double lb = sc.nextDouble();
						System.out.print("Informe o TERCEIRO cateto: ");
						double lc = sc.nextDouble();
						System.out.println(selecao.triangleTest(la, lb, lc));

					} else if (exer == 6) {
						System.out.println("\nTESTE DO RETANGULO:");
						double multiply = 1;
						double average;
						double[] value = new double[2];
						for (int i = 0; i < value.length; i++) {

							System.out.printf((i + 1) + "º valor: ");
							value[i] = sc.nextDouble();
							multiply *= value[i];
						}
						average = aritmetica.geometricAverage(multiply);
						System.out.printf("Média Geométrica: %.2f\n", average);
					} else if (exer == 7) {
						System.out.println("\nVELOCIDADE PERMITIDA:");
						System.out.print("Entre com a velocidade inicial em m/s: ");
						double vInicial = sc.nextDouble();
						System.out.print("Entre com o tempo do percurso em segundos: ");
						double tempo = sc.nextDouble();
						System.out.print("Entre com a acelaração escalar do veículo: ");
						double aceleracao = sc.nextDouble();
						System.out.print(selecao.finalVelocity(vInicial, tempo, aceleracao));
					} else if (exer == 8) {
						System.out.println("\nALUNO APROVADO:");
						List<Double> notas = new ArrayList<>();
						double media = 0;
						for (int i = 0; i < 2; i++) {
							System.out.print("Informe a nota da " + (i + 1) + "º avaliação: ");
							notas.add(sc.nextDouble());
						}

						media = (notas.get(0) + (notas.get(1) * 2)) / 3;
						if (media >= 5) {
							System.out.println("Aluno Aprovado");
						} else
							System.out.println("Aluno Reprovado");
					} else if (exer == 9) {
						System.out.println("\nNOTA PARA APROVAÇÃO:");
						List<Double> notas = new ArrayList<>();
						double media = 5;
						double nFinal;
						System.out.print("Informe a nota da  1ª avaliação: ");
						notas.add(sc.nextDouble());
						nFinal = ((3 * media) - notas.get(0)) / 2;
						notas.add(nFinal);
						System.out.println(
								"A sua nota final para conseguir aprovação deve ser maior ou igual a: " + notas.get(1));

					} else {
						System.out.print("\nOpção Inválida! Entre com o código do problema, conforme tabela: ");
						type = sc.next();

						if (isNumeric(type) != null)
							exer = Integer.valueOf(type);
					}
					System.out.print("\nPara continuar, entre com o código do problema ou 0 para sair: ");
					type = sc.next();

					if (isNumeric(type) != null)
						exer = Integer.valueOf(type);
					if (exer == 0)
						num = -1;

				} else if (num == 3) {
					if (count == 0) {
						System.out.println("\nESTRUTURAS DE REPETIÇÃO\n");
						System.out.println("Entre com o código do problema que dejesa resolver: ");
						System.out.println("|=====================================================================|");
						System.out.println("| 1  - APENAS POSITIVOS;           2 - SEGUNDO MAIOR QUE O PRIMEIRO;  |");
						System.out.println("| 3  - SEXO FEMININO OU MASCULINO; 4 - TABUADA DO 5   		      |");
						System.out.println("| 5  - TABUADA DE UM POSITIVO;     6 - TABUADA PARCIAL DE UM POSITIVO;|");
						System.out.println("| 7  - TABUADA DE 1 A 20;          8 - SOMA DE 1 A 100;               |");
						System.out.println("| 9  - FIBONACCI;                  10 - BARGAMASCHI;                  |");
						System.out.println("| 11 - N NÚMERO DE SEQUÊNCIAS V1;  12 - N NÚMERO DE SEQUÊNCIAS V2;    |");
						System.out.println("| 13 - N NÚMERO DE SEQUÊNCIAS V3;  14 -  MAIOR, SOMA MÉDIA            |");
						System.out.println("| 15 - MAIOR, MENOR, SOMA, MÉDIA, POSITIVOS E NEATIVOS V1;            |");
						System.out.println("| 16 - MAIOR, MENOR, SOMA, MÉDIA, POSITIVOS E NEATIVOS V2;            |");
						System.out.println("| 17 - FATORIAL;                   18 - MEGA SENA;                    |");
						System.out.println("|  0 - PARA SAIR                                                      |");
						System.out.println("|_____________________________________________________________________|");
						count++;
						System.out.print("Sua opção: ");
						type = sc.next();

						if (isNumeric(type) != null)
							exer = Integer.valueOf(type);
					}

					if (exer == 1) {
						System.out.println("\nAPENAS POSITIVOS:\n");
						double number;
						do {
							System.out.print("Entre com um valor: ");
							number = sc.nextDouble();
							String valido = (number < 1) ? "\nValor inválido para esta operação.\n"
									: "\nValor válido para está operação.\n";
							System.out.println(valido);

						} while (number <= 1);

					} else if (exer == 2) {
						System.out.println("\nSEGUNDO MAIOR QUE O PRIMEIRO:");
						double[] number = new double[2];
						double aux = 0;
						System.out.println("Entre com 2 valores consecutivos e em ordem crescente.");
						for (int i = 0; i < number.length; i++) {
							System.out.print((i + 1) + "º valor: ");
							number[i] = sc.nextDouble();
							if (number[i] > aux)
								aux = number[i];
							else {
								System.out.println("O valor digitado não obedece a condição.");
								i = 0;
							}
						}

						System.out.println("Os valores digitados em ordem crescente foram:");
						for (double x : number) {
							System.out.println(x);
						}
					} else if (exer == 3) {
						System.out.println("\nSEXO FEMININO OU MASCULINO:");
						String opcao;
						String sexo;
						sc.nextLine();
						do {
							System.out.print("\nInforme seu Gênero Sexual (M para masculino ou F para feminino): ");
							opcao = sc.nextLine().toLowerCase();
							sexo = (opcao.charAt(0) == 'f') ? "Feminino"
									: (opcao.charAt(0) == 'm') ? "Masculino" : "Resposta Inválida";

							if (opcao.charAt(0) != 'f' && opcao.charAt(0) != 'm')
								System.out.println("\n" + sexo);
						} while (sexo == "Resposta Inválida");
						System.out.println("\nGenero Sexual Informado: " + sexo);

					} else if (exer == 4) {
						System.out.println("\nTABUADA DO 5:");
						int numero = 5;

						int[] vect = new int[11];

						for (int i = 0; i < vect.length; i++) {
							vect[i] = numero * i;
							if (vect[i] != 0)
								System.out.println(i + " x " + numero + ": " + vect[i]);
						}
					} else if (exer == 5) {
						System.out.println("\nTABUADA DE UM POSITIVO:");
						Integer numero;
						Integer valido;
						int[] vect = new int[11];
						do {
							System.out.print("\nInforme um número positivo para exibir sua tabuada de 1 a 10): ");
							numero = sc.nextInt();
							valido = (numero > 0) ? numero : -1;

						} while (valido == -1);
						System.out.println("\nTABUADA DO " + numero + ":");

						for (int i = 0; i < vect.length; i++) {
							vect[i] = numero * i;
							if (vect[i] != 0)
								System.out.println(i + " x " + numero + ": " + vect[i]);
						}
					} else if (exer == 6) {
						System.out.println("\nTABUADA PARCIAL DE UM POSITIVO:");
						int numero;
						int[] intervalo = new int[2];
						int aux = 0;
						do {
							System.out.println("\nInforme um número positivo para exibir sua tabuada: ");
							numero = sc.nextInt();
						} while (numero <= 0);
						System.out.println(
								"\nEntre com 2 valores positivos e em ordem crescente, para definir o intervalo da tabuada a ser exibido");
						for (int i = 0; i < intervalo.length; i++) {
							System.out.print((i + 1) + "º valor: ");
							intervalo[i] = sc.nextInt();
							if (intervalo[i] > aux)
								aux = intervalo[i];
							else {
								System.out.println("O valor digitado não obedece a condição.");
								i = 0;
							}
						}

						System.out.println("\nTABUADA DO " + numero + ", no intervalo de " + intervalo[1] + " a "
								+ intervalo[0] + ":");
						int i = intervalo[1];
						int j = intervalo[0];
						while (i >= j) {

							System.out.println(i + " x " + numero + ": " + numero * i);
							i--;
						}

					} else if (exer == 7) {
						System.out.println("\nTABUADA DE 1 A 20:");
						sc.nextLine();
						for (int i = 1; i < 21; i++) {
							System.out.println("\nTABUADA DE " + i + ":");
							for (int j = 1; j < 11; j++) {
								System.out.println(i + " x " + j + ": " + i * j);
								if (j == 10 && i != 20) {
									System.out.println("Entre com qualquer tecla para exibir  a tabuada de:" + (i + 1));
									sc.nextLine();
								}
							}
						}

					} else if (exer == 8) {
						System.out.println("\nSOMA DOS TERMOS DE UMA P.A. DE 1 A 100 E RAZÃO 1:");
						int numero = 0;
						int aux = 1;
						int i = 1;
						while (i < 100) {
							numero = aux + (i + 1);
							System.out.println(aux + " + " + (i + 1) + ": " + numero);
							aux = numero;
							i++;
						}

						System.out.println("================================");

						int pa = (1 + 100) * 100 / 2;
						System.out.println("SOMA DE 1 A 100: " + pa);

					} else if (exer == 9) {
						System.out.println("\nOS 30 PRIMEIROS ELEMENTOS DA SEQUÊNCIA FIBONACCI:\n");

						int f1 = 1;
						int f2 = 0;
						int aux;

						for (int i = 0; i < 30; i++) {

							System.out.print(f1); // 1 ,
							if (i != 29)
								System.out.print(", ");
							else
								System.out.print(".");
							aux = f1; // 1
							f1 += f2; // 0
							f2 = aux; // 1

						}
						System.out.println();

					} else if (exer == 10) {
						System.out.println("\nOS 30 PRIMEIROS ELEMENTOS DA SEQUÊNCIA BARGAMASCHI:\n");
						int f1 = 1;
						int f2 = 1;
						int f3 = 3;
						int[] vect = { 1, 1, 3 };
						int aux;

						for (int i = 0; i < 30; i++) {
							if (i < 3)
								System.out.print(vect[i]);
							else
								System.out.print(f1 + f2 + f3); // 5, 9
							if (i != 9)
								System.out.print(", ");
							else
								System.out.print(".");
							if (i > 2) {
								aux = f1 + f2 + f3; // 5 , 9
								f1 = f2; // 1, 3
								f2 = f3; // 3, 5
								f3 = aux; // 5, 9
							}

						}
						System.out.println();
					} else if (exer == 11) {
						System.out.println(
								"\nSOMA DOS N PRIMEIROS ELEMENTOS DA SEQUÊCIA 2, 5, 10, 17, 26, 37, 50, 65, 82, 101, ... :\n");
						int j;
						do {
							System.out.print(
									"Informe quantos dos primeiros elementos desejar realizar a soma (Informar um valor positivo e menor do que 100): ");
							j = sc.nextInt();
							if (j <= 0 || j > 100)
								System.out.print("erro");
							System.out.println();
						} while (j <= 0 || j > 100);
						System.out.println();
						int soma = 0;
						int i = 0;
						int f1 = 2;
						int f2 = 3;
						while (i < j) {

							soma += f1;

							f1 = f2 + f1;
							f2 = f2 + 2;
							i++;
						}

						System.out.printf("O resultado da soma dos %d primeiros termos da sequência é: %d\n", j, soma);
					} else if (exer == 12) {
						System.out.println("\nN NÚMERO DE SEQUÊNCIAS V2:");
						System.out.println(
								"\nSOMA DOS N PRIMEIROS ELEMENTOS DA SEQUÊCIA 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 + 10/11 + ... :\n");
						int j;
						do {
							System.out.print(
									"Informe quantos dos primeiros elementos desejar realizar a soma (Informar um valor positivo e menor do que 100): ");
							j = sc.nextInt();
							if (j <= 0 || j > 100)
								System.out.print("erro");
							System.out.println();
						} while (j <= 0 || j > 100);

						double f1 = 1.0;
						double f2 = 2.0;
						double soma = 0;
						for (int i = 0; i < j; i++) {

							soma += f1 / f2;

							f1 += 1;
							f2 += 1;
						}

						System.out.printf("O resultado da soma dos %d primeiros termos da sequência é: %.2f\n", j,
								soma);

					} else if (exer == 13) {
						System.out.println("\nN NÚMERO DE SEQUÊNCIAS V3:");
						System.out.println(
								"\nSOMA DOS N PRIMEIROS ELEMENTOS DA SEQUÊCIA 2 + 5/8 + 10/27 + 17/64 + 26/125 + 37/216 + 50/343 + 65/512 + 82/729 + 101/1000 + ... :\n");
						int j;
						do {
							System.out.print(
									"Informe quantos dos primeiros elementos desejar realizar a soma (Informar um valor positivo e menor do que 100): ");
							j = sc.nextInt();
							if (j <= 0 || j > 100)
								System.out.print("erro");
							System.out.println();
						} while (j <= 0 || j > 100);

						double f1 = 2.0;
						double f2 = 1.0;
						double soma = 0;
						double aux = 0;
						for (int i = 0; i < j; i++) {

							soma += f1 / f2;

							if (i == 0) {
								aux = f1;
								f1 = Math.pow(f1, 2) + 1;

								f2 = Math.pow(aux, 3);
							} else {
								aux++;
								f1 = Math.pow(aux, 2) + 1;

								f2 = Math.pow(aux, 3);
							}
						}

						System.out.printf("O resultado da soma dos %d primeiros termos da sequência é: %.2f\n", j,
								soma);

					} else if (exer == 14) {
						System.out.println("\nMAIOR, SOMA MÉDIA:");
						int maior = -1000000;

						int n = 10;
						Integer[] vect = new Integer[n];

						int aux = 0;
						int soma = 0;
						int media = 0;

						System.out.println("Entre com 10 Valores positivos: ");
						for (int i = 0; i < vect.length; i++) {
							System.out.print("Digite 0 " + (i + 1) + "º valor: ");
							aux = sc.nextInt();
							if (aux > maior)
								maior = aux;
							if (aux > 0) {
								vect[i] = aux;
								soma += vect[i];
							} else {
								System.out.println("Erro: O programa não admite valor não positivo");
								i--;
							}

							media = soma / vect.length;
						}
						System.out.println("O maior Valor: " + maior);
						System.out.println("A soma dos valores válidos digitados: " + soma);
						System.out.println("A média aritimédica dos valores válidos digitados: " + media);

					} else if (exer == 15) {
						System.out.println("\nMAIOR, MENOR, SOMA, MÉDIA POSITIVOS E NEATIVOS V1:");
						int n;
						int maior = -10000000;
						int menor = 10000000;
						int negativos = 0;
						int positivos = 0;
						double percentPositivo;
						double percentNegativo;
						double soma = 0.0;
						double media = 0.0;
						do {
							System.out.print("Informe quantos valores serão analisados (limite de até 20 valores): ");
							n = sc.nextInt();
							if (n < 0 || n > 20) {
								System.out.println("Erro: O programa admite valor até 20.");
								System.out.println();
							}
						} while (n < 0 || n > 20);

						Integer[] vect = new Integer[n];

						for (int i = 0; i < vect.length; i++) {
							System.out.print("Digite 0 " + (i + 1) + "º valor: ");
							vect[i] = sc.nextInt();

							if (vect[i] > maior)
								maior = vect[i];

							if (vect[i] < menor)
								menor = vect[i];
							if (vect[i] > 0)
								positivos++;
							else if (vect[i] < 0)
								negativos++;

							soma += vect[i];

						}

						media = soma / vect.length;

						percentNegativo = 100 * negativos / vect.length;

						percentPositivo = 100 * positivos / vect.length;

						System.out.println("O maior Valor: " + maior);
						System.out.println("O menor Valor: " + menor);
						System.out.println("A soma dos valores válidos digitados: " + soma);
						System.out.println("A média aritimédica dos valores válidos digitados: " + media);
						System.out.println("O total de positivos: " + positivos);
						System.out.println("O total de negativos: " + negativos);
						System.out.println("O percentual de positivos é: " + percentPositivo + "%");
						System.out.println("O percentual de negativos é: " + percentNegativo + "%");

					} else if (exer == 16) {
						System.out.println("\nMAIOR, MENOR, SOMA, MÉDIA POSITIVOS E NEATIVOS V2:");

						int n;
						double maior = -10000000;
						double menor = 10000000;
						int negativos = 0;
						int positivos = 0;
						double percentPositivo;
						double percentNegativo;
						double soma = 0;
						double media = 0.0;
						String type2;
						do {
							do {
								System.out
										.print("Informe quantos valores serão analisados (limite de até 20 valores): ");
								n = sc.nextInt();
								if (n < 0 || n > 20) {
									System.out.println("\nErro: O programa admite valor até 20.");
									System.out.println();
								}
							} while (n < 0 || n > 20);

							Double[] vect = new Double[n];

							for (int i = 0; i < vect.length; i++) {
								System.out.print("Digite 0 " + (i + 1) + "º valor: ");
								vect[i] = sc.nextDouble();

								if (vect[i] > maior)
									maior = vect[i];

								if (vect[i] < menor)
									menor = vect[i];
								if (vect[i] > 0)
									positivos++;
								else if (vect[i] < 0)
									negativos++;
								else

								soma += vect[i];

							}

							media = soma / vect.length;

							percentNegativo = 100 * negativos / vect.length;

							percentPositivo = 100 * positivos / vect.length;

							System.out.println("O maior Valor: " + maior);
							System.out.println("O menor Valor: " + menor);
							System.out.println("A soma dos valores válidos digitados: " + soma);
							System.out.println("A média aritimédica dos valores válidos digitados: " + media);
							System.out.println("O total de positivos: " + positivos);
							System.out.println("O total de negativos: " + negativos);
							System.out.println("O percentual de positivos é: " + percentPositivo + "%");
							System.out.println("O percentual de negativos é: " + percentNegativo + "%");

							System.out.println("==========================================");

							do {

								maior = -10000000;
								menor = 10000000;
								negativos = 0;
								positivos = 0;
								soma = 0;
								media = 0;
								System.out.print(
										"Deseja executar esse programa novamente? entre S para SIM e N para NÂO: ");
								type2 = sc.next().toUpperCase();

								if (type2.charAt(0) != 'N' && type2.charAt(0) != 'S') {
									System.out.println(
											"\nErro: O programa admite apenas as opções S para SIM e N para NÂO.\n");

								}
							} while (type2.charAt(0) != 'N' && type2.charAt(0) != 'S');
						} while (type2.charAt(0) != 'N');

						System.out.println(
								"\nPROGRAMA 16 - MAIOR, MENOR, SOMA, MÉDIA POSITIVOS E NEATIVOS V2, FOI ENCERRADO\n");

					} else if (exer == 17) {
						System.out.println("\nFATORIAL:");

						int n;
						int i;
						int aux = 0;
						int fatorial = 1;

						String type2;
						do {
							do {
								System.out.print("Informe um valor positivo para demonstrar e calcular seu fatorial: ");
								n = sc.nextInt();
								if (n <= 0) {
									System.out.println("\nErro: O programa só admite valores positivos.");
									System.out.println();
								}
							} while (n <= 0);
							System.out.println();
							i = n;

							while (i >= 1) { // 5 ; 4 ; 3
								if (i >= 1) {

									fatorial = fatorial * (n - aux);

									aux += 1;

									System.out.print(i);
								}
								if (i >= 2)
									System.out.print(" x ");
								else
									System.out.println(": " + fatorial);
								i--;
							}

							System.out.println();

							fatorial = 1;
							aux = 0;
							do {

								System.out.print(
										"Deseja executar esse programa novamente? entre S para SIM e N para NÂO: ");
								type2 = sc.next().toUpperCase();
								System.out.println();
								if (type2.charAt(0) != 'N' && type2.charAt(0) != 'S') {
									System.out.println("\nErro: O programa admite apenas valores positivos.\n");

								}
							} while (type2.charAt(0) != 'N' && type2.charAt(0) != 'S');
						} while (type2.charAt(0) != 'N');

						System.out.println("\nPROGRAMA 17 - FATORIAL, FOI ENCERRADO\n");

					} else if (exer == 18) {
						System.out.println("\nMEGA SENA:");

						Integer[] megaSena = new Integer[60];

						for (int i = 1; i <= megaSena.length; i++) {
							megaSena[1] = i;
							if (i < 10)
								System.out.print("0" + i + " ");
							else
								System.out.print(i + " ");
							if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60)
								System.out.println();
						}
						System.out.println("\nCOMBINAÇÃO SIMPLES:");
						double aux = 0;
						double fatorial1 = 1;
						double fatorial2 = 1;
						double fatorial3 = 1;
						double n = 60;
						double m = 6;
						double aux2 = n - m;
						double i = 0;

						i = n;
						while (i >= 1) {

							fatorial1 = fatorial1 * (n - aux);
							aux += 1;
							i--;
						}
						i = m;
						aux = 0;
						while (i >= 1) {

							fatorial2 = fatorial2 * (m - aux);
							aux += 1;
							i--;
						}
						i = aux2;
						aux = 0;
						while (i >= 1) {

							fatorial3 = fatorial3 * (aux2 - aux);
							aux += 1;
							i--;
						}
						System.out.println();

						n = fatorial1 / (fatorial2 * fatorial3);

						System.out.printf(
								"Para ter-se CERTEZA de acertar as 6 dezenas, é necessário realizar um total de " + n
										+ " jogos de 6 dezenas");
						System.out.println();

					} else {
						System.out.print("\nOpção Inválida! Entre com o código do problema, conforme tabela: ");
						type = sc.next();

						if (isNumeric(type) != null)
							exer = Integer.valueOf(type);
					}
					System.out.print("\nPara continuar, entre com o código do problema ou 0 para sair: ");
					type = sc.next();

					if (isNumeric(type) != null)
						exer = Integer.valueOf(type);
					if (exer == 0)
						num = -1;

				} else if (num == 4) {

					if (count == 0) {
						System.out.println("\nESTRUTURAS DE DADOS - MATRIZES\n");
						System.out.println("Entre com o código do problema que dejesa resolver: ");
						System.out.println("|=====================================================================|");
						System.out.println("| 1  - ORDEM INVERSA;           2  - PRODUTO DA MATRIZ V1; 	      |");
						System.out.println("| 3  - PRODUTO DA MATRIZ V2; 	4  - PESQUISANDO VALOR;	              |");
						System.out.println("| 5  - LISTANDO AS MULHERES;    6  - MAIORES DE 18 V1;	              |");
						System.out.println("| 7  - MAIORES DE 18 V2;        8  - ORDEM CRESCENTE;                 |");
						System.out.println("| 9  - ORDEM DECRESCENTE;       10 - ORDEM ALFABÉTICA;                |");
						System.out.println("| 11 - MAIS NOVOS PRIMEIRO;  	0  - PARA SAIR		              |");
						System.out.println("|_____________________________________________________________________|");
						count++;
						System.out.print("Sua opção: ");
						type = sc.next();

						if (isNumeric(type) != null)
							exer = Integer.valueOf(type);
					}

					if (exer == 1) {
						System.out.println("\nORDEM INVERSA:\n");
						
						int[] vect = new int[10];
						System.out.println("Informe 10 valores inteiros a seguir:\n");
						for (int i = 0; i < vect.length; i++) {
							System.out.print((i + 1) + "º valor: ");
							vect[i] = sc.nextInt();
						}
						System.out.println("\nValores digitados na ordem inversa a que foram digitados:\n");

						for (int i = vect.length -1; i >= 0; i--) {
							System.out.println((i+1) + "º Valor: " + vect[i]);

						}
					} else if (exer == 2) {			
						
						System.out.println("\nPRODUTO DA MATRIZ V1:");
						double[] vect = new double[20];
						System.out.println("Informe 20 valores quaisquer a eguir:\n");
						for (int i = 0; i < vect.length; i++) {
							System.out.print((i + 1) + "º valor: ");
							vect[i] = sc.nextInt();
						}
						System.out.print("\nEntre com um valor que irá multiplicar os valores digitados anteriormente :");
						double mult = sc.nextDouble();
						System.out.println();
						for (int i = 0; i < vect.length ; i++) {
							double aux = vect[i];
							vect[i] = vect[i]*mult;
							System.out.printf("%.0f, na posição %d, * %.1f: %.1f \n", aux, i, mult, vect[i]);

						}

					} else if (exer == 3) {
						System.out.println("\nPRODUTO DA MATRIZ V2:");
						double[] vect = new double[20];
						double[] vect2 = new double[20];
						System.out.println("Informe 20 valores quaisquer a eguir:\n");
						for (int i = 0; i < vect.length; i++) {
							System.out.print((i + 1) + "º valor: ");
							vect[i] = sc.nextInt();
						}
						System.out.print("\nEntre com um valor que irá multiplicar os valores digitados anteriormente :");
						double mult = sc.nextDouble();
						System.out.println();
						for (int i = 0; i < vect.length ; i++) {
							vect2[i] = vect[i]*mult;;
							
							System.out.printf("%.0f, na posição %d, * %.1f: %.1f \n", vect[i], i, mult, vect2[i]);
						}
					} else if (exer == 4) {
						System.out.println("\nPESQUISANDO VALOR:");

					} else if (exer == 5) {
						System.out.println("\nLISTANDO AS MULHERES:");

					} else if (exer == 6) {
						System.out.println("\nMAIORES DE 18 V1:");

					} else if (exer == 7) {
						System.out.println("\nMAIORES DE 18 V2:");

					} else if (exer == 8) {
						System.out.println("\nORDEM CRESCENTE:");

					} else if (exer == 9) {
						System.out.println("\nORDEM DECRESCENTE:\n");

					} else if (exer == 10) {
						System.out.println("\nORDEM ALFABÉTICA:\n");

					} else if (exer == 11) {
						System.out.println("\nMAIS NOVOS PRIMEIROS:\n");

					} else {
						System.out.print("\nOpção Inválida! Entre com o código do problema, conforme tabela: ");
						type = sc.next();

						if (isNumeric(type) != null)
							exer = Integer.valueOf(type);
					}
					System.out.print("\nPara continuar, entre com o código do problema ou 0 para sair: ");
					type = sc.next();

					if (isNumeric(type) != null)
						exer = Integer.valueOf(type);
					if (exer == 0)
						num = -1;

				} else if (num == 5) {
					System.out.println("DESAFIOS");
					num = -1;
				} else {

					System.out.print("\nOpção Inválida! Entre com o código do TIPO de exercício, conforme tabela: ");
					type = sc.nextLine();
					if (isNumeric(type) != null) {
						num = Integer.valueOf(isNumeric(type));
					} else
						num = 0;
				}

			} while (num != -1);
			System.out.println("\n\nO programa: " + option + " foi encerrado. Se deseja continuar:\n");
			sc.nextLine();
		} while (type != "0");
		sc.close();
	}

	private static String isNumeric(String str) {

		if (str.matches("[0-9]+")) {
			// str != null &&
			return str;
		} else

			return null;
	}

}
