package br.senai.interfaces;

public class MotorE implements IMotor {

	private int velocidade = 0;
	
	public int acelerar() {
		velocidade += 1;
		velocidade += 1;
		velocidade += 1;
		velocidade += 1;
		velocidade += 1;
		velocidade += 1;
		return velocidade;
	}

}
