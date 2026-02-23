package com.endes.figuras;

/**
 * Representa un cuadrado como una figura geométrica.
 * 
 * @author Equipo ENDES
 * @version 2.0
 */
public class Cuadrado extends FiguraGeometrica {
    /** Longitud del lado del cuadrado. */
    private double lado;
    
    /** Ángulo de rotación actual en grados (0-360). */
    private double anguloRotacion;
    
    /** Punto de la esquina (origen) del cuadrado. */
    private Punto esquina;

    /**
     * Construye un cuadrado con los parámetros especificados.
     * 
     * @param nombre el nombre del cuadrado
     * @param color el color del cuadrado
     * @param esquina el punto de origen del cuadrado
     * @param lado la longitud del lado
     */
    public Cuadrado(String nombre, String color, Punto esquina, double lado) {
        super(nombre, color);
        this.esquina = esquina;
        this.lado = lado;
        this.anguloRotacion = 0;
    }

    /**
     * Calcula el área del cuadrado: lado².
     * 
     * @return el área del cuadrado
     */
    @Override
    public double area() {
        return lado * lado;
    }

    /**
     * Calcula el perímetro del cuadrado: 4 × lado.
     * 
     * @return el perímetro del cuadrado
     */
    @Override
    public double perimetro() {
        return 4 * lado;
    }

    /**
     * Rota el cuadrado acumulando el ángulo especificado.
     * El ángulo se normaliza entre 0 y 360 grados.
     * 
     * @param angulo el ángulo en grados (positivo = sentido antihorario)
     */
    @Override
    public void rotar(double angulo) {
        this.anguloRotacion = (this.anguloRotacion + angulo) % 360;
        if (this.anguloRotacion < 0) {
            this.anguloRotacion += 360;
        }
        System.out.println("Rotando " + nombre + " en " + angulo + " grados. Ángulo actual: " + this.anguloRotacion + " grados.");
    }

    /**
     * Obtiene el ángulo de rotación actual.
     * 
     * @return el ángulo en grados
     */
    public double getAnguloRotacion() {
        return anguloRotacion;
    }

    /**
     * Obtiene la esquina (punto de origen) del cuadrado.
     * 
     * @return el punto de la esquina
     */
    public Punto getEsquina() {
        return esquina;
    }

    /**
     * Obtiene la longitud del lado del cuadrado.
     * 
     * @return la longitud del lado
     */
    public double getLado() {
        return lado;
    }
}