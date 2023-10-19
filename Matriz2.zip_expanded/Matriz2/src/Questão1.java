import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int num[][] = new int [5][5], cPar = 0, total = 0, media = 0;
		
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.println("Escreva o número da linha ["+ linha +"] e da coluna ["+ coluna +"]");
				num[linha][coluna] = sc.nextInt();
				
				boolean par = num[linha][coluna] % 2 == 0;
				
				if (par == true) {
					cPar++;
					total += num[linha][coluna];
					media =  total / cPar;
				}
				
			}
		}
		System.out.println("A média é: " + media );
		
		
		for (int linha = 0; linha < 4; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 4; coluna++) {
				
				if (num [linha][coluna] < 0) {
					num [linha][coluna] = 0;
				}
				System.out.print(num [linha][coluna]+ " ");
			}
		}
	}

}
