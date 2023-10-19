import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double matriz[][] = new double [3][4], n1 = 0, n2 = 0;
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Escreva um número: ");
				matriz[linha][coluna] = sc.nextInt();
				
				if (linha == 0 && coluna == 0) {
					n1 = matriz[linha][coluna];
				}
				if (linha == 2 && coluna == 0) {
					n2 = matriz[linha][coluna];
				}
			}
		}	
		System.out.println("O numero do cando superior esquerdo é: "+ n1);
		System.out.println("O numero do cando inferior esquerdo é: "+ n2);
	}
}
