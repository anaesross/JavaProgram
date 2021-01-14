import java.util.Locale;
import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. 
//Aseguir, calcule e mostre o valor da conta a pagar.
public class exerc_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		double valor;
		
		if (cod == 1) {
			valor = 4 * qtd;
			System.out.printf("Total: R$ %.2f" , valor);
		} else if (cod == 2) {
			valor = 4.50 * qtd;
			System.out.printf("Total: R$ %.2f" , valor);
		} else if (cod == 3) {
			valor = 5 * qtd;
			System.out.printf("Total: R$ %.2f" , valor);
		} else if (cod == 4) {
			valor = 2 * qtd;
			System.out.printf("Total: R$ %.2f" , valor);
		} else if (cod == 5) {
			valor = 1.50 * qtd;
			System.out.printf("Total: R$ %.2f" , valor);
		} else {
			System.out.println("N�o existe produto com esse c�digo!");
		}
		
		sc.close();

	}

}
