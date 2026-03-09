package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    @Test
    public void testPerimetro() {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(0, 4);

        Triangulo t = new Triangulo("T1", "Rojo", p1, p2, p3);

        assertEquals(12, t.perimetro(), 0.0001);
    }

    @Test
    public void testArea() {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(0, 4);

        Triangulo t = new Triangulo("T1", "Rojo", p1, p2, p3);

        assertEquals(6, t.area(), 0.0001);
    }

    @Test
    public void testTrasladar() {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(1, 0);
        Punto p3 = new Punto(0, 1);

        Triangulo t = new Triangulo("T1", "Azul", p1, p2, p3);

        t.trasladar(2, 3);

        assertEquals(2, p1.getX());
        assertEquals(3, p1.getY());
        assertEquals(3, p2.getX());
        assertEquals(3, p2.getY());
        assertEquals(2, p3.getX());
        assertEquals(4, p3.getY());
    }

    @Test
    public void testRotar90Grados() {
        Punto p1 = new Punto(1, 0);
        Punto p2 = new Punto(0, 1);
        Punto p3 = new Punto(-1, 0);

        Triangulo t = new Triangulo("T1", "Verde", p1, p2, p3);

        t.rotar(90);

        assertEquals(0, Math.round(p1.getX()));
        assertEquals(1, Math.round(p1.getY()));

        assertEquals(-1, Math.round(p2.getX()));
        assertEquals(0, Math.round(p2.getY()));

        assertEquals(0, Math.round(p3.getX()));
        assertEquals(-1, Math.round(p3.getY()));
    }
}
