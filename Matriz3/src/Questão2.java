import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int tamanho;
		
		System.out.println("Qual o tamanho da matriz? ");
		tamanho = sc.nextInt();
		
		int matriz [][] = new int [tamanho][tamanho], diagonal[][] = new int [tamanho][tamanho], confirma;
		
		System.out.println("Escreva os valores da matriz: ");
		for(int linha = 0; linha < tamanho; linha++) {
			for(int coluna = 0; coluna < tamanho; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
				
				confirma = tamanho - 1;
				
				if (linha == coluna || linha + coluna == confirma) {
					diagonal[linha][coluna] = matriz[linha][coluna];	
				}
			}
		}
		System.out.println("\n");
		for (int linha = 0; linha < tamanho; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < tamanho; coluna++) {
			
				System.out.print(diagonal[linha][coluna]+ " ");
			}
		}
	}
}