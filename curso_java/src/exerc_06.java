import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1 
//o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. 
//Calcule e mostre o valor a ser pago.
public class exerc_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		int numPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		double resultado;
		
		resultado = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
		
		System.out.printf("Valor a pagar: R$ %.2f\n" , resultado);
		
		sc.close();

	}

}
