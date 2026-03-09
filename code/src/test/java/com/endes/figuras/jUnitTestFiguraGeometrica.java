package com.endes.figuras;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.endes.figuras.*;

/**
 * Clase de pruebas unitarias para las figuras geométricas.
 * Prueba la funcionalidad de Punto, Circulo, Cuadrado y Triangulo.
 * 
 * @author Carlos Ruiz Garrido
 * @version 1.0
 */
public class jUnitTestFiguraGeometrica {
    
    // ===== ATRIBUTOS PARA PRUEBAS =====
    private Punto puntoOrigen;
    private Punto puntoDOS;
    private Circulo circulo;
    
    // ===== SETUP INICIAL =====
    @Before
    public void setUp() {
        // Inicializar puntos
        puntoOrigen = new Punto(0, 0);
        puntoDOS = new Punto(3, 4);
        
        // Inicializar figuras
        circulo = new Circulo("Circulo Principal", "Azul", puntoOrigen, 5);
    }
    
    @Test
    public void testCirculoArea() {
        // Area = π * r²  = π * 5² = 78.54
        double areaEsperada = Math.PI * 5 * 5;
        assertEquals("Area del circulo incorrecta", areaEsperada, circulo.area(), 0.01);
    }
    
    @Test
    public void testCirculoPerimetro() {
        // Perimetro = 2π * r = 2π * 5 = 31.416
        double perimetroEsperado = 2 * Math.PI * 5;
        assertEquals("Perimetro del circulo incorrecto", perimetroEsperado, circulo.perimetro(), 0.01);
    }
    
    @Test
    public void testCirculoRotar() {
        circulo.rotar(45);
        assertEquals("Angulo de rotacion incorrecto", 45, circulo.getAnguloRotacion(), 0.001);
    }
    
    @Test
    public void testCirculoRotarMultiple() {
        circulo.rotar(180);
        assertEquals("Primer giro incorrecto", 180, circulo.getAnguloRotacion(), 0.001);
        circulo.rotar(180);
        assertEquals("Segundo giro incorrecto", 0, circulo.getAnguloRotacion(), 0.001);
    }
    
    @Test
    public void testCirculoTraslacion() {
        Punto antes = circulo.getPosicion();
        circulo.trasladar(3, 4);
        assertEquals("Posicion X incorrecta tras traslacion", 3, circulo.getPosX(), 0.001);
        assertEquals("Posicion Y incorrecta tras traslacion", 4, circulo.getPosY(), 0.001);
    }
    
    @Test
    public void testCirculoTraslacionMultiple() {
        circulo.trasladar(2, 2);
        circulo.trasladar(1, 1);
        assertEquals("Traslacion X acumulada incorrecta", 3, circulo.getPosX(), 0.001);
        assertEquals("Traslacion Y acumulada incorrecta", 3, circulo.getPosY(), 0.001);
    }
    
    @Test
    public void testCirculoSetPosicion() {
        circulo.setPosicion(10, 20);
        assertEquals("Set posicion X incorrecto", 10, circulo.getPosX(), 0.001);
        assertEquals("Set posicion Y incorrecto", 20, circulo.getPosY(), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCirculoRotarNaN() {
        circulo.rotar(Double.NaN);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCirculoRotarInfinito() {
        circulo.rotar(Double.POSITIVE_INFINITY);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCirculoTrasladarNaN() {
        circulo.trasladar(Double.NaN, 5);
    }
    
    @Test
    public void testNombreCirculo() {
        assertEquals("Nombre del circulo", "Circulo Principal", circulo.getNombre());
    }
    
    @Test
    public void testColorCirculo() {
        assertEquals("Color del circulo", "Azul", circulo.getColor());
    }
    
    @Test
    public void testNombreCuadrado() {
        assertEquals("Nombre del cuadrado", "Cuadrado Principal", cuadrado.getNombre());
    }
    
    @Test
    public void testColorCuadrado() {
        assertEquals("Color del cuadrado", "Rojo", cuadrado.getColor());
    }
    
}
