package colecao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listas {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		
		System.out.println(numeros.size());
		
		numeros.add(1, 15);
		
		System.out.println(numeros);
		
		numeros.set(2, 25);
		System.out.println(numeros);
		
		// Pecorre a lista pelo índice
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		
		System.out.println("-------------");		
		
		// Percorre a lista usando os elementos diretamente
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Alice");
		nomes.add("Bob");
		nomes.add("Charlie");
		nomes.add("Diana");
		
		System.out.println("-------------");		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		Set<String> conjuntoNomes = new HashSet<>();
		
		conjuntoNomes.add("Alice");
		conjuntoNomes.add("Bob");
		conjuntoNomes.add("Charlie");
		conjuntoNomes.add("Diana");
		conjuntoNomes.add("bob");
		
		System.out.println("-------------");
		for(String nome : conjuntoNomes) {
			System.out.println(nome);
		}
	}
	
	
	
	
}
