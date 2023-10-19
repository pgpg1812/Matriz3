import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int matriz [][] = new int [5][5], num [][] = new int [5][5];
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.println("digite um valor: ");
				matriz [linha][coluna] = sc.nextInt();
				
			}
		}
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (matriz [linha][coluna] == matriz[linha][coluna]){
					
					matriz[linha][coluna] = num[linha][coluna];
					
				}
				System.out.println(num[linha][coluna]);
			}
		}
	}

}
