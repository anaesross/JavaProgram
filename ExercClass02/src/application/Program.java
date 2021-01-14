package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario func = new Funcionario();
		
		System.out.println("Digite o nome do funcion�rio: ");
		func.nome = sc.nextLine();
		System.out.println("Digite o sal�rio bruto: ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.println("Nome: " + func.nome + ", Sal�rio: R$" + func.salarioBruto());
		
		System.out.println("Imposto aplicado no sal�rio: ");
		func.imposto = sc.nextDouble();
		
		System.out.println("Dados atualizado: " + func.nome +  " R$ " + func.salarioFinal());
		
		
		sc.close();

	}

}
