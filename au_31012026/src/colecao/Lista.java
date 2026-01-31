package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
//		List<Double> pesos = new ArrayList<>();
//		List<Integer> idades = new ArrayList<>();
//		List<Character> caracteres = new ArrayList<>();
		
		List<String> nomes = new ArrayList<>();
		
		//Adicionndo nomes a lista
		nomes.add("Tadeu");
		nomes.add("Edson");
		nomes.add("Pedro");
		
		//Exibindo a lista em forma de coleção(conjunto)
		System.out.println(nomes);
		
		// Exibindo cada elemento da lista
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println("-----------");
		
		// Exibindo os nomes da lista usando for
		//				tamanho da lista
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		nomes.add("Edvaldo");
		nomes.add("Garibaldo");
		nomes.add("Astrogildo");
		System.out.println(nomes);
		System.out.println("-----------");
		
		//Remover elemento da lista
		nomes.remove(3);
		System.out.println(nomes);
		System.out.println("-----------");
		
		// Troco o elemento de um determinada posição
		nomes.set(1, "Kleber");
		System.out.println(nomes);
		System.out.println("-----------");
		
		// Adiciono o elemento em uma determinada posição
		nomes.add(1, "Edson");
		System.out.println(nomes);
		System.out.println("-----------");
		
		// Ordendo a lista(crescente)
		Collections.sort(nomes);
		System.out.println(nomes);
		System.out.println("-----------");
		
		// Ordeno a lista(decrescente
		Collections.sort(nomes.reversed());
		System.out.println(nomes);
		System.out.println("-----------");
		
		// verifico se contem um elemento na lista.
		System.out.println(nomes.contains("Pedro"));
		
		nomes.add("Pedro");
		nomes.add("Pedro");
		nomes.add("Pedro");
		System.out.println(nomes);
		System.out.println("-----------");
		
		// verifico quantos Pedro eu tenho na lista
		int contadorPedro = 0;
		for(int i = 0; i < nomes.size(); i++) {
			if(nomes.get(i).contains("Pedro")) {
				contadorPedro++;
			}
		}
//		int contadorPedro = Collections.frequency(nomes, "Pedro");
		System.out.println("Qtd Pedro na lista: " + contadorPedro);
		System.out.println("-----------");
	
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
