package application;

import java.text.ParseException;
import java.util.Scanner;
import entities.Quartos;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Quartos[] vect = new Quartos[10];//criado vetor com 9 indices
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();//quantidade do indice para o for 
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Locação #" + i + ":");//contador
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			vect[room] = new Quartos(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}