import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que 
//recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do 
//funcionário, com duas casas decimais.
public class exerc_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func = sc.nextInt();
		double horas = sc.nextDouble();
		double valor = sc.nextDouble();
		double salario;
		
		salario = horas*valor;
		
		System.out.println("Number: " + func);
		System.out.printf("Salário: %.2f\n", salario);
		
		sc.close();

	}

}
