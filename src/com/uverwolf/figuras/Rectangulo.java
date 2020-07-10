package com.uverwolf.figuras;

public class Rectangulo extends Figura {

	public Rectangulo(double base,double altura){
		double  perimetro = base *2 +altura*2;
		double area = 	base  *altura;
		this.setPerimetro(perimetro);
		this.setArea(area);
		System.out.println("El area del rectangulo creado es: "+area);
	}
}
