import java.util.Scanner;
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class exerc_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
		
		sc.close();

	}

}
