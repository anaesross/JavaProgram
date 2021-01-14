import java.util.Scanner;
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class exerc_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é positivo");
		}
		
		sc.close();

	}

}
