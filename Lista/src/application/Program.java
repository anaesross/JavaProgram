package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		//precisa instanciar a lista para ser utilizada.
		List<String> list = new ArrayList<>() ; //nao utilizar tipos primitivos para lista int , usar  wrapper Integer

		list.add("Maria"); //adicionar elementos a lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2 , "Marco");//inserir elemento em uma posi��o espec�fica
		
		int tamanho = list.size();//verificar o tamanho da lista
		System.out.println(tamanho);
		
		for(String valor : list) {
			System.out.println(valor);
		}
		list.remove("Anna");//remover um elemento da lista - compara��o de valor
		list.remove(1);	//remover pela posi��o da lista.
		System.out.println("---------------------");
		//remover utilizando um predicado
		//remover de todo string valor , tal que contenha valor M
		//retorna verdadeiro ou falso para valores que contenham o valor M na string
		//remove valores...
		list.removeIf(valor -> valor.charAt(0) == 'M');
		for(String valor : list) {
			System.out.println(valor);
		}
		
		System.out.println("------------------");
		//encontrar a posi��o de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//quando nao encontra o elemento retorna -1
		System.out.println("Index of Ana�: " + list.indexOf("Anae"));
		
		System.out.println("-------------------");
		List<String> lista = new ArrayList<>() ; //nao utilizar tipos primitivos para lista int , usar  wrapper Integer

		lista.add("Maria"); //adicionar elementos a lista
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		//filtrar lista:
		//converter a lista para o tipo stream, filter recebe um predicado para buscar valor, o filter retorna um stream filtrado (ele nao � compartivel com lista)
		//temos que converter o stream para list novamente.
		//1- converte para stream 2- faz a opera��o lambda que quer 3- converte para lista
		List<String> result = lista.stream().filter(valor -> valor.charAt(0) == 'A').collect(Collectors.toList()); //strem aceita opera��es com express�es lambda
		for (String valor : result) {
			System.out.println(valor);
		}
		System.out.println("------------------");
		//Encontrar um elemento da lista que atenda a um predicado definido por voce, caso nao ache retorne null
		String nome = lista.stream().filter(valor -> valor.charAt(0) == 'O').findFirst().orElse(null);
		System.out.println(nome);
	}

}
