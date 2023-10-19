import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner (System.in);
				
				int resposta = 10;
				int nmrLinhas;
				int nmrColunas;
				
				while (resposta != 0) {
					System.out.println("O que você deseja fazer?\n1-Somar\n2-Subtrair\n3-Multiplicar\n0-Sair\nResposta: ");
					resposta = sc.nextInt();
						
					System.out.println("Qual o número de linhas? ");
					nmrLinhas = sc.nextInt();
					
					System.out.println("Qual o número de colunas? ");
					nmrColunas = sc.nextInt();
					
					int matrizA [][] = new int[nmrLinhas][nmrColunas];
					int matrizB [][] = new int[nmrLinhas][nmrColunas];
					int matrizSoma [][] = new int[nmrLinhas][nmrColunas];
					int matrizSub [][] = new int[nmrLinhas][nmrColunas];
					int matrizMult [][] = new int[nmrLinhas][nmrColunas];
					
					for (int linhaA = 0; linhaA < matrizA.length; linhaA++) {
						for (int colunaA = 0; colunaA < matrizA.length; colunaA++) {
							System.out.println("Insira um número para o vetor A:");
							matrizA[linhaA][colunaA] = sc.nextInt();
						}
					}
					for (int linhaB = 0; linhaB < matrizB.length; linhaB++) {
						for (int colunaB = 0; colunaB < matrizB.length; colunaB++) {
							System.out.println("Insira um número para o vetor B:");
							matrizB[linhaB][colunaB] = sc.nextInt();
						}
					}
					for (int linhaContas = 0; linhaContas < matrizA.length; linhaContas++) {
						for (int colunaContas = 0; colunaContas < matrizA.length; colunaContas++) {
							matrizSoma[linhaContas][colunaContas] = matrizA [linhaContas][colunaContas] + matrizB[linhaContas][colunaContas];
							matrizSub[linhaContas][colunaContas] = matrizA [linhaContas][colunaContas] - matrizB[linhaContas][colunaContas];
							matrizMult[linhaContas][colunaContas] = matrizA [linhaContas][colunaContas] * matrizB[linhaContas][colunaContas];
						}
					}
					
					switch (resposta) {
					case 1:
						for (int linhaResposta = 0; linhaResposta < matrizA.length; linhaResposta++) {
							for (int colunaResposta = 0; colunaResposta < matrizA.length; colunaResposta++) {
								System.out.println(matrizSoma[linhaResposta][colunaResposta]);
							}
						}
						break;
					case 2:
						for (int linhaResposta = 0; linhaResposta < matrizA.length; linhaResposta++) {
							for (int colunaResposta = 0; colunaResposta < matrizA.length; colunaResposta++) {
								System.out.println(matrizSub[linhaResposta][colunaResposta]);
							}
						}
						break;
					case 3:
						for (int linhaResposta = 0; linhaResposta < matrizA.length; linhaResposta++) {
							for (int colunaResposta = 0; colunaResposta < matrizA.length; colunaResposta++) {
								System.out.println(matrizMult[linhaResposta][colunaResposta]);
							}
						}
						break;
					}
					
				} 
				
			}

		
	}

