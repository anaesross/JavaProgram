import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int idade = 32;
		System.out.println(idade);
		double salario = 10.35784;
		System.out.printf("%.2f\n",salario);
		System.out.printf("%.4f\n",salario);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n",salario); 
		System.out.println("Meu sal�rio � " + salario + " reais");
		
		String nome = "Ana�";
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
	}

}
