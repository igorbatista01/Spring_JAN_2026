package br.senai.interfaces;

public class Programa {

	public static void main(String[] args) {
		Motor v8 = new Motor();
		MotorE vE = new MotorE();
		MotorH vH = new MotorH();
		
		Carro mustang = new Carro();
		mustang.nome = "Ford-Mustang";
		mustang.ano = 1978;
		mustang.motor = vH;

		mustang.motor.acelerar();
		mustang.motor.acelerar();
		mustang.motor.acelerar();
		mustang.motor.acelerar();
		System.out.println();
	}

}
