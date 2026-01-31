package br.edu.sp.senai.animais.exercicio30012026;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		Passarinho pepeu = new Passarinho();
		
		Golfinho jose = new Golfinho();
		
		List<Animal> lista = new ArrayList<>();
		lista.add(jose);
		lista.add(pepeu);
		for(Animal animal : lista) {
			System.err.println(animal.fazerSom());
		}
	}
}
