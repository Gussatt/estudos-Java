package alura.com.br;

import java.util.*;

public class ListTest {

	public static void syout(String msg) {
		System.out.println(msg);
		System.out.println("");
	};

	public static void main(String[] args) {

		ArrayList<String> classesAlura = new ArrayList<>();

		String class1 = "Trabalhando com Listas";
		String class2 = "Modelando o fluxo de trabalho";
		String class3 = "Java Util";

		classesAlura.add(class1);
		classesAlura.add(class2);
		classesAlura.add(class3);

		syout(classesAlura.toString());

		for (String classes : classesAlura) {
			syout("Aula: " + classes);
		}

		classesAlura.remove(0);
		syout(classesAlura.toString());

		for (int i = 0; i < classesAlura.size(); i++) {
			syout("Aula Alura: " + classesAlura.get(i));
		}

		String class4 = "Aprimorando o conhecimento";
		classesAlura.add(class4);

		Collections.sort(classesAlura);

		syout(classesAlura.toString());

		classesAlura.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
		});
	}
}
