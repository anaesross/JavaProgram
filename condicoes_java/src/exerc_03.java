import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
//"Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. 
//Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.
public class exerc_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a%b == 0 || b%a == 0) {
			System.out.println("S�o M�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		sc.close();

	}

}
