import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int [7][8];
		
		for (int linha = 0; linha < 7; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 8; coluna++) {
				
				matriz[linha][coluna] = linha + coluna;
				
				if (matriz [linha][coluna] < 0) {
					matriz [linha][coluna] = 0;
				}
				System.out.print(matriz [linha][coluna]+ " ");
			}
		}
	}
}
