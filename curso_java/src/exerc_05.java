import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que 
//recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do 
//funcion�rio, com duas casas decimais.
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
		System.out.printf("Sal�rio: %.2f\n", salario);
		
		sc.close();

	}

}
