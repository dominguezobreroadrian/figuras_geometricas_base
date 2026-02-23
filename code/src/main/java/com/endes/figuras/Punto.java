package com.endes.figuras;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	
	public void setX() {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY() {
		this.y = y;
	}
	
	public double distancia(Punto otro) {
		return Math.sqrt(((otro.getX() - this.x)*2) + ((otro.getY() - this.y)*2));
	}
	
}
