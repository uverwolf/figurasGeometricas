package com.uverwolf.test;
import com.uverwolf.figuras.*;
public class TestFiguras {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rectangulo = new Rectangulo (4,5);
		Cuadrado cuadrado  = new Cuadrado(3);
		Circulo circulo = new Circulo(2);
		System.out.println("El area total de todas las figuras creadas es: "+Figura.getAreaTotal());
		Circulo circulo2 = new Circulo(3);
		Circulo circulo3 = new Circulo(1);
		System.out.println("El area total de los circulos creados es :"+Circulo.getAreaTotalCirculo());
		
	}

}
