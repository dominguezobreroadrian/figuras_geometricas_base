package com.endes.figuras;


/**
 * Clase abstracta que representa una figura geométrica genérica.
 * Todas las figuras geométricas deben extender esta clase e implementar
 * los métodos abstractos de cálculo de área y perímetro.
 * 
 * Implementa {@link Comparable} para proporcionar un orden natural basado en el área.
 * 
 * @author Tu nombre
 * @version 1.0
 * @since 1.8 
 */
public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica> {
    /**
     * Nombre de la figura geométrica.
     */
    protected String nombre;

    /**
     * Color de la figura geométrica.
     */
    protected String color;

    /**
     * Constructor de la clase FiguraGeometrica.
     * 
     * @param nombre el nombre de la figura geométrica
     * @param color el color de la figura geométrica
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Obtiene el nombre de la figura geométrica.
     * 
     * @return el nombre de la figura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el color de la figura geométrica.
     * 
     * @return el color de la figura
     */
    public String getColor() {
        return color;
    }

    /**
     * Calcula el área de la figura geométrica.
     * Este método debe ser implementado por las clases concretas.
     * 
     * @return el área de la figura
     */
    public abstract double area();

    /**
     * Calcula el perímetro de la figura geométrica.
     * Este método debe ser implementado por las clases concretas.
     * 
     * @return el perímetro de la figura
     */
    public abstract double perimetro();

    /**
     * Compara esta figura geométrica con otra en función del área.
     * 
     * @param o la figura geométrica con la que se comparará
     * @return un valor negativo si esta figura tiene menor área,
     *         cero si tienen el mismo área, 
     *         un valor positivo si esta figura tiene mayor área
     * @see Comparable
     */
    @Override
    public int compareTo(FiguraGeometrica o) {
        return Double.compare(this.area(), o.area());
    }

    /**
     * Rota la figura geométrica un número específico de grados.
     * Este método puede ser sobrescrito por clases concretas
     * para proporcionar una implementación específica.
     * 
     * @param angulo el ángulo en grados por el cual rotar la figura
     * @throws UnsupportedOperationException si la operación no está soportada
     */
    public void rotar(double angulo) {
        System.out.println("Rotando la figura " + nombre + " en " + angulo + " grados.");
    }

    /**
     * Traslada la figura geométrica en las direcciones X e Y.
     * Este método puede ser sobrescrito por clases concretas
     * para proporcionar una implementación específica.
     * 
     * @param dx el desplazamiento en el eje X
     * @param dy el desplazamiento en el eje Y
     * @throws UnsupportedOperationException si la operación no está soportada
     */
    public void trasladar(double dx, double dy) {
        System.out.println("Trasladando la figura " + nombre + " en (" + dx + ", " + dy + ").");
    }
}
