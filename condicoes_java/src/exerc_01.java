import java.util.Scanner;
//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
public class exerc_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a < 0) {
			System.out.println("O n�mero � negativo");
		} else {
			System.out.println("O n�mero � positivo");
		}
		
		sc.close();

	}

}
