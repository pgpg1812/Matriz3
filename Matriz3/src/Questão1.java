import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		int matriz [][] = new int [4][4], diagonal [][] = new int [4][4], naoDiagonal [][] = new int [4][4];
		
		System.out.println("Escreva os valores da matriz: ");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
				
				if (linha == coluna) {
					diagonal[linha][coluna] = matriz[linha][coluna];
				}
				else {
					naoDiagonal[linha][coluna] = matriz[linha][coluna];
				}
			}
		}
		
		for (int linha = 0; linha < 4; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 4; coluna++) {
			
				System.out.print(diagonal[linha][coluna]+ " ");
			}
		}
		System.out.println("\n");
		for (int linha = 0; linha < 4; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 4; coluna++) {
			
				System.out.print(naoDiagonal[linha][coluna]+ " ");
			}
		}
		
	}

}
