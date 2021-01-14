package application;

public class Program {

	public static void main(String[] args) {
		String[] vetor = new String[] {"Maria","Bob","Alex"};
		
		//com for
		for(int i=0; i<vetor.length;i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("------------------");
		
		//com for each
		for (String valor : vetor) { //tipo da variavel nome da variavel : vetor
			System.out.println(valor);
		}

	}

}
