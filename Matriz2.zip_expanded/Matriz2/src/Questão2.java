import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int matriz [][] = new int [7][4], menor = 9999, posicaoL = 0, posicaoC = 0;
		
		for(int linha = 0; linha < 7; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Escreva um valor para o numero da linha ["+linha+"] e da coluna ["+coluna+"]");
				matriz[linha][coluna] = sc.nextInt();
				
				if (matriz[linha][coluna] < menor) {
					menor = matriz[linha][coluna];
					posicaoL = linha;
					posicaoC = coluna;
				}
			}
		}
		
		System.out.println("O menor número é "+ menor+ " e está na linha ["+posicaoL+"] e na coluna ["+posicaoC+"]");
		
	}
}
