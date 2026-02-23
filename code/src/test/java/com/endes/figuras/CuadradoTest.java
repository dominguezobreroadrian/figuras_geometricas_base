package com.endes.figuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void testArea() {
        Punto origen = new Punto(0, 0);
        Cuadrado c = new Cuadrado("cuad", "azul", origen, 2.0);
        assertEquals(4.0, c.area(), 1e-9);
    }

    @Test
    void testPerimetro() {
        Punto origen = new Punto(0, 0);
        Cuadrado c = new Cuadrado("cuad", "azul", origen, 2.5);
        assertEquals(10.0, c.perimetro(), 1e-9);
    }

    @Test
    void testGetters() {
        Punto origen = new Punto(1.0, 2.0);
        Cuadrado c = new Cuadrado("miCuadro", "verde", origen, 3.5);
        assertEquals(3.5, c.getLado(), 1e-9);
        assertEquals(origen, c.getEsquina());
    }

    @Test
    void testRotacionAcumuladaYNormalizacion() {
        Punto origen = new Punto(0, 0);
        Cuadrado c = new Cuadrado("rot", "negro", origen, 1.0);
        c.rotar(45);
        assertEquals(45.0, c.getAnguloRotacion(), 1e-9);
        c.rotar(350);
        // 45 + 350 = 395 -> 35 después de normalizar mod 360
        assertEquals(35.0, c.getAnguloRotacion(), 1e-9);
        c.rotar(-50);
        // 35 - 50 = -15 -> 345 después de normalizar
        assertEquals(345.0, c.getAnguloRotacion(), 1e-9);
    }
}
