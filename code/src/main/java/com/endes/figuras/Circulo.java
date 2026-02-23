/**
 * Clase que representa un círculo como una figura geométrica.
 * Extiende {@link FiguraGeometrica} e implementa cálculos específicos
 * para círculos como área y perímetro, además de operaciones
 * de rotación y traslación con seguimiento de posición.
 * 
 * @author Carlos Ruiz Garrido
 * @version 1.0
 * @since 1.8
 */
public class Circulo extends FiguraGeometrica {
    /**
     * Radio del círculo en unidades arbitrarias.
     */
    private double radio;
    
    /**
     * Ángulo de rotación actual del círculo en grados (0-360).
     */
    private double anguloRotacion;
    
    /**
     * Coordenada X del centro del círculo.
     */
    private double posX;
    
    /**
     * Coordenada Y del centro del círculo.
     */
    private double posY;

    /**
     * Construye un nuevo círculo con el nombre, color y radio especificados.
     * Inicializa el ángulo de rotación en 0 grados y la posición en (0, 0).
     * 
     * @param nombre el nombre del círculo
     * @param color el color del círculo
     * @param radio el radio del círculo
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
        this.anguloRotacion = 0.0;
        this.posX = 0.0;
        this.posY = 0.0;
    }

    /**
     * Calcula el área del círculo usando la fórmula π*r².
     * 
     * @return el área del círculo
     */
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    /**
     * Calcula el perímetro (circunferencia) del círculo usando la fórmula 2*π*r.
     * 
     * @return el perímetro del círculo
     */
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Rota el círculo un número específico de grados.
     * El ángulo se normaliza al rango 0-360 grados.
     * 
     * @param angulo el ángulo en grados por el cual rotar el círculo
     * @throws IllegalArgumentException si el ángulo es NaN o infinito
     */
    public void rotar(double angulo) {
        if (Double.isNaN(angulo) || Double.isInfinite(angulo)) {
            throw new IllegalArgumentException("El ángulo no puede ser NaN o infinito");
        }
        // Normalizar el ángulo al rango 0-360
        double anguloNormalizado = angulo % 360.0;
        if (anguloNormalizado < 0) {
            anguloNormalizado += 360.0;
        }
        this.anguloRotacion = anguloNormalizado;
        System.out.println("El círculo " + getNombre() + " ha sido rotado " + angulo + " grados. Ángulo actual: " + anguloNormalizado + " grados.");
    }

    /**
     * Traslada el círculo en las direcciones X e Y.
     * Los desplazamientos se suman a la posición actual.
     * 
     * @param dx el desplazamiento en el eje X
     * @param dy el desplazamiento en el eje Y
     * @throws IllegalArgumentException si los desplazamientos son NaN o infinitos
     */
    public void trasladar(double dx, double dy) {
        if (Double.isNaN(dx) || Double.isInfinite(dx) || Double.isNaN(dy) || Double.isInfinite(dy)) {
            throw new IllegalArgumentException("Los desplazamientos no pueden ser NaN o infinitos");
        }
        this.posX += dx;
        this.posY += dy;
        System.out.println("El círculo " + getNombre() + " ha sido trasladado en (" + dx + ", " + dy + "). Nueva posición: (" + posX + ", " + posY + ").");
    }

    public double getAnguloRotacion() {
        return anguloRotacion;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosicion(double x, double y) {
        this.posX = x;
        this.posY = y;
    }
}