import java.util.Scanner;

public class Quest�o3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int matriz [][] = new int [5][5], somaPrincipal = 0, somaC2 = 0, somaL4 = 0,somaSecund�ria = 0, total = 0;
		
		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				System.out.println("Escreva um valor para o numero da linha ["+linha+"] e da coluna ["+coluna+"]");
				matriz[linha][coluna] = sc.nextInt();
				
				total += matriz[linha][coluna];
				
				if (linha == 3){
					somaL4 += matriz[linha][coluna];
				}
				if (coluna == 1){
					somaC2 += matriz[linha][coluna];
				}
				if (linha == coluna){
					somaPrincipal += matriz[linha][coluna];
				}
				if (linha + coluna == 4){
					somaSecund�ria += matriz[linha][coluna];
				}
				
			}
		}
		
		System.out.println("A soma dos valores da linha 4 �: "+ somaL4);
		System.out.println("A soma dos valores da coluna 2 �: "+ somaC2);
		System.out.println("A soma dos valores da diagonal principal �: "+ somaPrincipal);
		System.out.println("A soma de todos os valores  �: "+ total);
		
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
