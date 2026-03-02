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
    private Cuadrado cuadrado;
    private Triangulo triangulo;
    
    // ===== SETUP INICIAL =====
    @Before
    public void setUp() {
        // Inicializar puntos
        puntoOrigen = new Punto(0, 0);
        puntoDOS = new Punto(3, 4);
        
        // Inicializar figuras
        circulo = new Circulo("Circulo Principal", "Azul", puntoOrigen, 5);
        cuadrado = new Cuadrado("Cuadrado Principal", "Rojo", puntoOrigen, 4);
        triangulo = new Triangulo("Triangulo Principal", "Verde");
    }
    
    // ===== PRUEBAS DE LA CLASE PUNTO =====
    
    @Test
    public void testPuntoConstructor() {
        assertEquals("Puntos X no coinciden", 0, puntoOrigen.getX(), 0.001);
        assertEquals("Puntos Y no coinciden", 0, puntoOrigen.getY(), 0.001);
    }
    
    @Test
    public void testPuntoSettersGetters() {
        puntoOrigen.setX(5);
        puntoOrigen.setY(10);
        assertEquals("X no establece correctamente", 5, puntoOrigen.getX(), 0.001);
        assertEquals("Y no establece correctamente", 10, puntoOrigen.getY(), 0.001);
    }
    
    @Test
    public void testDistanciaEntrePuntos() {
        // Crear un triángulo rectángulo 3-4-5
        double distancia = puntoOrigen.distancia(puntoDOS);
        assertEquals("Distancia incorrecta (3-4-5)", 5.0, distancia, 0.001);
    }
    
    @Test
    public void testDistanciaAlMismoPunto() {
        double distancia = puntoOrigen.distancia(puntoOrigen);
        assertEquals("Distancia al mismo punto debe ser 0", 0.0, distancia, 0.001);
    }
    
    @Test
    public void testDistanciaConPuntosNegativos() {
        Punto puntoNegativo = new Punto(-3, -4);
        double distancia = puntoOrigen.distancia(puntoNegativo);
        assertEquals("Distancia con coordenadas negativas", 5.0, distancia, 0.001);
    }
    
    // ===== PRUEBAS DE LA CLASE CIRCULO =====
    
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
    
    // ===== PRUEBAS DE LA CLASE CUADRADO =====
    
    @Test
    public void testCuadradoArea() {
        // Area = lado² = 4² = 16
        assertEquals("Area del cuadrado incorrecta", 16, cuadrado.area(), 0.001);
    }
    
    @Test
    public void testCuadradoPerimetro() {
        // Perimetro = 4 * lado = 4 * 4 = 16
        assertEquals("Perimetro del cuadrado incorrecto", 16, cuadrado.perimetro(), 0.001);
    }
    
    @Test
    public void testCuadradoRotar() {
        cuadrado.rotar(90);
        assertEquals("Rotacion de 90 grados incorrecta", 90, cuadrado.getAnguloRotacion(), 0.001);
    }
    
    @Test
    public void testCuadradoRotarAcumulativo() {
        cuadrado.rotar(90);
        cuadrado.rotar(90);
        assertEquals("Rotacion acumulativa incorrecta", 180, cuadrado.getAnguloRotacion(), 0.001);
    }
    
    @Test
    public void testCuadradoRotarMayorA360() {
        cuadrado.rotar(450);
        assertEquals("Normalizacion de angulo > 360 incorrecta", 90, cuadrado.getAnguloRotacion(), 0.001);
    }
    
    @Test
    public void testCuadradoGetEsquina() {
        Punto esquina = cuadrado.getEsquina();
        assertEquals("Esquina X incorrecta", 0, esquina.getX(), 0.001);
        assertEquals("Esquina Y incorrecta", 0, esquina.getY(), 0.001);
    }
    
    @Test
    public void testCuadradoGetLado() {
        assertEquals("Lado del cuadrado incorrecto", 4, cuadrado.getLado(), 0.001);
    }
    
    // ===== PRUEBAS DE LA CLASE TRIANGULO =====
    
    @Test
    public void testTrianguloConstructor() {
        assertEquals("Nombre del triangulo incorrecto", "Triangulo Principal", triangulo.getNombre());
        assertEquals("Color del triangulo incorrecto", "Verde", triangulo.getColor());
    }
    
    @Test
    public void testTrianguloArea() {
        // El triangulo se inicializa con vertices en 0, 0, 0
        // El area con estos valores será 0
        double area = triangulo.area();
        assertTrue("Area debe ser >= 0", area >= 0);
    }
    
    @Test
    public void testTrianguloPerimetro() {
        double perimetro = triangulo.perimetro();
        assertEquals("Perimetro incorrecto", 0, perimetro, 0.001);
    }
    
    // ===== PRUEBAS DE LA CLASE FIGURAGEOMETRICA =====
    
    @Test
    public void testComparacionCirculos() {
        Circulo circulo1 = new Circulo("Circulo 1", "Rojo", new Punto(0, 0), 5);
        Circulo circulo2 = new Circulo("Circulo 2", "Azul", new Punto(0, 0), 10);
        
        assertTrue("Circulo1 debe ser menor que Circulo2", circulo1.compareTo(circulo2) < 0);
        assertTrue("Circulo2 debe ser mayor que Circulo1", circulo2.compareTo(circulo1) > 0);
    }
    
    @Test
    public void testComparacionCirculosIguales() {
        Circulo circulo1 = new Circulo("Circulo 1", "Rojo", new Punto(0, 0), 5);
        Circulo circulo2 = new Circulo("Circulo 2", "Azul", new Punto(0, 0), 5);
        
        assertEquals("Circulos con igual area deben ser iguales", 0, circulo1.compareTo(circulo2));
    }
    
    @Test
    public void testComparacionFigurasDistintas() {
        // Circulo area = π * 5² = 78.54
        // Cuadrado area = 4² = 16
        assertTrue("Circulo tiene mayor area que cuadrado", circulo.compareTo(cuadrado) > 0);
        assertTrue("Cuadrado tiene menor area que circulo", cuadrado.compareTo(circulo) < 0);
    }
    
    @Test
    public void testRotarFiguraGeometrica() {
        // Metodo heredado de FiguraGeometrica
        cuadrado.rotar(45);
        assertEquals("Rotacion en FiguraGeometrica", 45, cuadrado.getAnguloRotacion(), 0.001);
    }
    
    // ===== PRUEBAS DE ATRIBUTOS BASICOS =====
    
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
