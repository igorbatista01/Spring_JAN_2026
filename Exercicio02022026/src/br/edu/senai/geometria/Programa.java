package br.edu.senai.geometria;

public class Programa {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		
		System.out.println("Área do círculo "+circulo.calcArea(4));
		System.out.println("Área do quadrado "+quadrado.calcArea(10));

		

	}

}
