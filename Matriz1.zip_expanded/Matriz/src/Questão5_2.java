import java.util.Scanner;

public class Questão5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		int matriz [][] = new int [4][4], contador = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, nOutro [][] = new int [4][4];
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("digite um valor: ");
				matriz [linha][coluna] = sc.nextInt();
			}
		}
		System.out.println("Diagonais:");
		System.out.println( matriz[0][0]);
		for (int linha = 0; linha < 4; linha++) {
			linha++;
			for (int coluna = 0; coluna < 4; coluna++) {
				coluna++;
				System.out.println(matriz [linha][coluna]);
			}
		}
		System.out.println("Não diagonais");
		for (int linha = 0; linha < 4; linha++) {
			
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println();
				if (matriz [linha][coluna] != matriz [1][1]) {
					nOutro [linha][coluna] = matriz [linha][coluna];
				}
				else if (matriz [linha][coluna] != matriz [2][2]) {
					nOutro [linha][coluna] = matriz [linha][coluna];
				}
				else if (matriz [linha][coluna] != matriz [3][3]) {
					nOutro [linha][coluna] = matriz [linha][coluna];
				}
				else if (matriz [linha][coluna] != matriz [4][4]) {
					nOutro [linha][coluna] = matriz [linha][coluna];
				}
				System.out.print(matriz [linha][coluna]+ " ");
			}
		}
		
		
	}
}

