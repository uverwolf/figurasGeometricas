package com.uverwolf.figuras;

public class Circulo extends Figura {
	public static double areaTotalCirculo=0;
	public static double getAreaTotalCirculo() {
		return areaTotalCirculo;
	}
	public static void setAreaTotalCirculo(double areaTotalCirculo) {
		Circulo.areaTotalCirculo += areaTotalCirculo;
	}
	public Circulo (double radio) {
		double area = 3.14 * radio*radio;
		double longitud = 2*3.14*radio;
		this.setArea(area);
		this.setPerimetro(longitud);
		System.out.println("El area del circulo creado es: "+this.getArea());
		Circulo.setAreaTotalCirculo(area);
	}
}
