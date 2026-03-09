package com.endes.figuras;

public class Triangulo extends FiguraGeometrica {
private  Punto vertice1;
private Punto vertice2;
private Punto vertice3;
	public Triangulo(String nombre, String color,Punto vertice1, Punto vertice2, Punto vertice3) {
		super(nombre, color);
		this.vertice1= vertice1;
		this.vertice2=vertice2;
		this.vertice3=vertice3;
	}

	@Override
	public double area() {
		 double lado1 = distancia(vertice1, vertice2); double lado2 = distancia(vertice2, vertice3);
		 double lado3 = distancia(vertice3, vertice1);
		 double s = (lado1 + lado2 + lado3) / 2;
		 return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}

	@Override
	public double perimetro() {
		 double lado1 = distancia(vertice1, vertice2);
		 double lado2 = distancia(vertice2, vertice3);
		 double lado3 = distancia(vertice3, vertice1);
		 return lado1 + lado2 + lado3;
		
	}
	private double distancia(Punto p1, Punto p2) { double dx = p2.getX() - p1.getX();
	double dy = p2.getY() - p1.getY();
	return Math.sqrt(dx*dx + dy*dy);
	}
	
	public void rotar(double angulo) {
		double rad = Math.toRadians(angulo);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double x3 = 0;
		double y3 = 0;
		x1 = x1 * Math.cos(rad) - y1 * Math.sin(rad);
		y1 = x1 * Math.sin(rad) + y1 * Math.cos(rad);
		x2 = x2 * Math.cos(rad) - y2 * Math.sin(rad);
		y2 = x2 * Math.sin(rad) + y2 * Math.cos(rad);
		x3 = x3 * Math.cos(rad) - y3 * Math.sin(rad); 
		y3 = x3 * Math.sin(rad) + y3 * Math.cos(rad); 
		
		
	}
	public void trasladar(double dx, double dy) {
		double x1 = 0;
		double x2 = 0;
		double x3 = 0;
		double y1 = 0;
		double y2 = 0;
		double y3 = 0;
	    x1 += dx;
		y1 += dy; 
		x2 += dx;
		y2 += dy; 
		x3 += dx;
		y3 += dy;
	}
	}



	
	


