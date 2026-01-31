package br.senai.interfaces;

public class MotorH implements IMotor{
	
	private int velocidade = 0;
	
	public int acelerar() {
		velocidade += 2;
		velocidade += 2;
		velocidade += 1;
		velocidade += 1;
		velocidade += 1;
		velocidade += 1;
		return velocidade;
	}

}
