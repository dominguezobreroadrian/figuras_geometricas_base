public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
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
        super.rotar(angulo);
    }

    public void trasladar(double dx, double dy) {
        super.trasladar(dx, dy);
    }
}