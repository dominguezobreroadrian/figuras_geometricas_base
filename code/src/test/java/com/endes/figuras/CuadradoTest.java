package com.endes.figuras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void areaYPerimetro() {
        Cuadrado c = new Cuadrado("c1", "azul", new Punto(0, 0), 2.0);
        assertEquals(4.0, c.area(), 1e-9);
        assertEquals(8.0, c.perimetro(), 1e-9);
    }

    @Test
    void gettersBasicos() {
        Punto p = new Punto(1, 2);
        Cuadrado c = new Cuadrado("c2", "rojo", p, 3.0);

        assertEquals(3.0, c.getLado(), 1e-9);
        assertEquals(p, c.getEsquina());
    }

    @Test
    void rotacionSimple() {
        Cuadrado c = new Cuadrado("c3", "negro", new Punto(0, 0), 1.0);

        c.rotar(45);
        assertEquals(45.0, c.getAnguloRotacion(), 1e-9);

        c.rotar(360);
        assertEquals(45.0, c.getAnguloRotacion(), 1e-9);

        c.rotar(-90);
        assertEquals(315.0, c.getAnguloRotacion(), 1e-9);
    }
}
