import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta; // declarar vari�vel conta da classe Conta
		
		System.out.println("Digite o n�mero da conta: ");
		int numConta = sc.nextInt();
		
		System.out.println("Digite o nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		System.out.println("Gostaria de fazer um dep�sito inicial? (s/n)");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Entre com o valor inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, nomeTitular, depositoInicial);
		} else {
			conta = new Conta(numConta, nomeTitular);//depositoInicial inicia como 0.0
		}
				
		System.out.println();
		System.out.println("Detalhes da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Entre o valor do dep�sito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Detalhes atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Entre o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Detalhes atualizados: ");
		System.out.println(conta);
		
		
		sc.close();

	}

}
