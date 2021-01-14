package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produtos[] vetor = new Produtos[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine(); //pular linha no console
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i]= new Produtos(nome, preco);//apontar o vetor para receber o primeiro valor de produtos Ex: 0 = tv , 500.00
		}
		
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += vetor[i].getPreco();
		}
		double avg = soma / n;
		
		System.out.printf("M�dia: %.2f "  , avg);
		
		
		sc.close();

	}

}
