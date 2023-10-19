import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int tamanho;
		
		System.out.println("Qual o número de funcionários que você deseja registrar?");
		tamanho = sc.nextInt();
		
		String nome[] = new String [tamanho];
		
		if (tamanho <= 0) {
			System.out.println("O numero de funcionarios não é o suficiente ");
		}
		else {
		for  (int cont = 0; cont < tamanho; cont++) {
			
		}	
		}
	}
}
