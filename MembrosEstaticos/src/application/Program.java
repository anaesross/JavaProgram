package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calcular;

public class Program {
	
	//public static final double PI = 3.14159; //valor constante ele nao pode ser alterado
	//padr�o de nome java para constantes � mai�sculo
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Calcular calc = new Calcular();
		
		
		System.out.println("Digite o raio: ");
		double raio = sc.nextDouble();
		//m�todos est�ticos
		double c = Calcular.circunferencia(raio);
		
		double v = Calcular.volume(raio);
		
		System.out.printf("Circunfer�ncia: %.2f\n" , c);
		System.out.printf("Volume: %.2f\n" , v);
		
		System.out.printf("PI: %.2f\n", Calcular.PI);
		
		sc.close();

	}
	
	/*public static double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume (double raio) {
		return 4.0 * PI * raio * raio * raio /3.0;
	} */
}
