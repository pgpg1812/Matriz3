import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int [5][5], cubo[][] = new int [5][5];
		
		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				
				System.out.println("Escreva um valor para o numero da linha ["+linha+"] e da coluna ["+coluna+"]");
				matriz[linha][coluna] = sc.nextInt(); 
				
				cubo[linha][coluna] = matriz[linha][coluna] * matriz[linha][coluna] * matriz[linha][coluna];
			}
		}
		for (int linha = 0; linha < 4; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 4; coluna++) {
				
				if (cubo [linha][coluna] < 0) {
					cubo [linha][coluna] = 0;
				}
				System.out.print(cubo [linha][coluna]+ " ");
			}
		}
		
	}
}
