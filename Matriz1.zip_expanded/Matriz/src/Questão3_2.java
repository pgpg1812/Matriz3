import java.util.Scanner;

public class Questão3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int matriz [][] = new int [4][4] ;
		
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("\n\ndigite um valor: ");
				matriz [linha][coluna] = sc.nextInt();
				for (int linha2 = 0; linha2 < 4; linha2++) {
					System.out.println();
					for (int coluna2 = 0; coluna2 < 4; coluna2++) {
						
						if (matriz [linha2][coluna2] < 0) {
							matriz [linha2][coluna2] = 0;
						}
						System.out.print(matriz [linha2][coluna2]+ " ");
					}
				}
			}
		}
		
	}

}
