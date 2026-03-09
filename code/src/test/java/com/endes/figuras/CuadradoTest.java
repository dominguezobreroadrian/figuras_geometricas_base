/**
 * Representa un cuadrado en el plano, definido por un nombre, color,
 * una esquina inferior izquierda y la longitud de su lado.
 * Permite calcular su área, perímetro y aplicar rotaciones.
 *
 * @author Joel Parrondo
 */
public class Cuadrado {

    private String nombre;
    private String color;
    private Punto esquina;
    private double lado;
    private double anguloRotacion;

    /**
     * Crea un nuevo cuadrado con los parámetros especificados.
     *
     * @param nombre identificador del cuadrado
     * @param color color del cuadrado
     * @param esquina punto que representa la esquina inferior izquierda
     * @param lado longitud del lado del cuadrado (debe ser positiva)
     */
    public Cuadrado(String nombre, String color, Punto esquina, double lado) {
        this.nombre = nombre;
        this.color = color;
        this.esquina = esquina;
        this.lado = lado;
        this.anguloRotacion = 0.0;
    }

    /**
     * Devuelve la longitud del lado del cuadrado.
     *
     * @return longitud del lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Devuelve la esquina inferior izquierda del cuadrado.
     *
     * @return punto que representa la esquina
     */
    public Punto getEsquina() {
        return esquina;
    }

    /**
     * Calcula el área del cuadrado.
     *
     * @return área del cuadrado
     */
    public double area() {
        return lado * lado;
    }

    /**
     * Calcula el perímetro del cuadrado.
     *
     * @return perímetro del cuadrado
     */
    public double perimetro() {
        return 4 * lado;
    }

    /**
     * Rota el cuadrado sumando el ángulo indicado.
     * El ángulo total se mantiene siempre en el rango [0, 360).
     *
     * @param grados ángulo a rotar, positivo o negativo
     */
    public void rotar(double grados) {
        anguloRotacion = (anguloRotacion + grados) % 360;
        if (anguloRotacion < 0) {
            anguloRotacion += 360;
        }
    }

    /**
     * Devuelve el ángulo actual de rotación del cuadrado.
     *
     * @return ángulo en grados dentro del rango [0, 360)
     */
    public double getAnguloRotacion() {
        return anguloRotacion;
    }
}
