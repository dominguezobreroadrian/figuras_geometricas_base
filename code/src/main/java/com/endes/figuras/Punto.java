package com.endes.figuras;

<<<<<<< HEAD
public class Punto {
	private double x;
	private double y;

	/**
     * Constructor para crear un punto con coordenadas específicas.
     * @param x Posición en el eje X.
     * @param y Posición en el eje Y.
     */
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	// --- Getters ---
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	// --- Setters ---
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	/**
     * Calcula la distancia entre este punto y otro punto dado.
     * Utiliza la fórmula: raíz((x2-x1)² + (y2-y1)²)
     * 
     * @param otro El otro punto hacia el cual calcular la distancia.
     * @return La distancia euclidiana como un valor double.
     */
	
	public double distancia(Punto otro) {
		double dx = otro.getX() - this.x;
        double dy = otro.getY() - this.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	
<<<<<<< HEAD
	}
=======
}
>>>>>>> feature/punto
=======
/**
 * Punto simple en 2D usado por las figuras.
 */
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

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Punto other = (Punto) obj;
        return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
    }

    @Override
    public int hashCode() {
        long bits = Double.doubleToLongBits(x);
        bits ^= Double.doubleToLongBits(y) * 31;
        return (int)(bits ^ (bits >>> 32));
    }
}
>>>>>>> feature/cuadrado
