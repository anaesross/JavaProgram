import java.util.Scanner;
//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
//mensagem explicativa, conforme exemplos.
public class exerc_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int resultado;
		
		resultado = x + y;
		
		System.out.println("A soma �: " + resultado);
		
		
		sc.close();
		

	}

}
