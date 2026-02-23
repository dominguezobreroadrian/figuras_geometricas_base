public class Circulo extends FiguraGeometrica {
    private double radio;
    private double anguloRotacion; // Almacena el ángulo de rotación acumulado
    private double posX; // Coordenada X del centro del círculo
    private double posY; // Coordenada Y del centro del círculo

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
        this.anguloRotacion = 0.0;
        this.posX = 0.0;
        this.posY = 0.0;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

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