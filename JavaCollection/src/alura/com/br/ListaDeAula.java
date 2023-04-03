package alura.com.br;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeAula {
	public static void main(String[] args) {
		ArrayList<Aula> aulas = new ArrayList<>();
		
		Aula a1 = new Aula("Revisitando ArrayList", 19);
		Aula a2 = new Aula("Aprimorando Listas" , 23);
		
		aulas.add(a1);
		aulas.add(a2);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
	
//		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}
}
