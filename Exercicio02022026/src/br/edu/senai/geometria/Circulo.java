package br.edu.senai.geometria;

public class Circulo implements IFiguraGeometrica2D {

	@Override
	public float calcArea(float x) {
		return (float) ((Math.PI) * (x*x));
	}

}
