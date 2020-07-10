package com.uverwolf.figuras;

public class Cuadrado extends Figura {
	
	public Cuadrado(double lado) {
		double perimetro = lado*4;
		double area = lado*lado;
		this.setArea(area);
		this.setPerimetro(perimetro);
		
		System.out.println("El area del cuadrado creado es: "+area);
	}
}
