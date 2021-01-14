package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Product product = new Product(); incluimos um construtor com argumentos em Product

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		
		
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		// o construtor obriga o programa criar o produto j� com valores e nao um
		// produto vazio, igual linha 13 e dpois preencher valor do objeto
		//Product product = new Product(name, price, quantity);
		Product product = new Product(name, price); //m�todo sobrecarga
		
		//product.name = "Computer";//atributo � private nao pode acessar
		//para acessar o atributo name (private) precisa ser criado um m�todo para acessar o set
		product.setName("Computer");
		
		//criar m�todo get para obter o valor de name
		//System.out.println("nome atualizado: " + product.name);
		System.out.println("Nome atualizado: " + product.getName());
		System.out.println();

		System.out.println("Product data: " + product);
		System.out.println();

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}