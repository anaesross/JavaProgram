import java.util.Scanner;
//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
public class exerc_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � �mpar");
		}
		
		sc.close();

	}

}
