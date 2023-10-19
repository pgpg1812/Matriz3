import java.util.Scanner;

public class PrimeiraAulaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int matriz [][] = new int [4][4] ;
		
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("digite um valor: ");
				matriz [linha][coluna] = sc.nextInt();
			}
		}
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println(matriz [linha][coluna]);
			}
		}
	}

}
