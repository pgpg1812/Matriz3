import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		int matriz [][] = new int [4][4], contador = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("digite um valor: ");
				matriz [linha][coluna] = sc.nextInt();
				
				contador++;
				if (contador == 1) {
					n1 = matriz [linha][coluna];
				}
				else if (contador == 6) {
					n2 = matriz [linha][coluna];
				}
				else if (contador == 11) {
					n3 = matriz [linha][coluna];
				}
				else if (contador == 16) {
					n4 = matriz [linha][coluna];
				}
			}
		}
		System.out.println();
		System.out.println("Diagonais:");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println("Números foras da diagonal:");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				
				if (matriz [linha][coluna] != n1 && matriz [linha][coluna] != n2 && matriz [linha][coluna] != n3 && matriz [linha][coluna] != n4){
					System.out.println(matriz [linha][coluna]);
				}
			}
			
		}
		System.out.println("matriz:");
		for (int linha = 0; linha < 4; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 4; coluna++) {
				
				if (matriz [linha][coluna] < 0) {
					matriz [linha][coluna] = 0;
				}
				System.out.print(matriz [linha][coluna]+ " ");
			}
		}
		
	}

}
