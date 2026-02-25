package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

	public class PuntoTest {

	    @Test
	    public void testConstructor() {
	        // Crear un punto con coordenadas (3, 4)
	        Punto p = new Punto(3.0, 4.0);
	        
	        // Verificar que las coordenadas son correctas
	        assertEquals(3.0, p.getX(), "La coordenada X debe ser 3.0");
	        assertEquals(4.0, p.getY(), "La coordenada Y debe ser 4.0");
	    }

	    @Test
	    public void testSetters() {
	        // Crear un punto con coordenadas (0, 0)
	        Punto p = new Punto(0.0, 0.0);
	        
	        // Cambiar las coordenadas usando los setters
	        p.setX(5.0);
	        p.setY(6.0);
	        
	        // Verificar que las nuevas coordenadas se han establecido correctamente
	        assertEquals(5.0, p.getX(), "La coordenada X debe ser 5.0");
	        assertEquals(6.0, p.getY(), "La coordenada Y debe ser 6.0");
	    }

	    @Test
	    public void testDistancia() {
	        // Crear dos puntos
	        Punto p1 = new Punto(0.0, 0.0);
	        Punto p2 = new Punto(3.0, 4.0);
	        
	        // Calcular la distancia entre ellos (debería ser 5.0)
	        double distancia = p1.distancia(p2);
	        
	        // Verificar que la distancia calculada es correcta (usamos 5.0 como resultado esperado)
	        assertEquals(5.0, distancia, 0.0001, "La distancia entre los puntos debería ser 5.0");
	    }

	    @Test
	    public void testDistanciaPuntosIdenticos() {
	        // Crear dos puntos con las mismas coordenadas
	        Punto p1 = new Punto(2.0, 3.0);
	        Punto p2 = new Punto(2.0, 3.0);
	        
	        // Calcular la distancia entre ellos (debería ser 0.0)
	        double distancia = p1.distancia(p2);
	        
	        // Verificar que la distancia es 0
	        assertEquals(0.0, distancia, "La distancia entre los mismos puntos debería ser 0.0");
	    }
	    
	    @Test
	    public void testDistanciaPuntosEnEjes() {
	        // Crear dos puntos, uno sobre el eje X y otro sobre el eje Y
	        Punto p1 = new Punto(0.0, 0.0);
	        Punto p2 = new Punto(0.0, 5.0);
	        
	        // Calcular la distancia entre ellos (debería ser 5.0)
	        double distancia = p1.distancia(p2);
	        
	        // Verificar que la distancia es correcta
	        assertEquals(5.0, distancia, 0.0001, "La distancia debería ser 5.0");
	    }

	    @Test
	    public void testDistanciaConCoordenadasNegativas() {
	        // Crear dos puntos con coordenadas negativas
	        Punto p1 = new Punto(-1.0, -2.0);
	        Punto p2 = new Punto(2.0, 2.0);
	        
	        // Calcular la distancia entre ellos
	        double distancia = p1.distancia(p2);
	        
	        // Calcular la distancia esperada manualmente: sqrt((2 - (-1))^2 + (2 - (-2))^2)
	        double distanciaEsperada = Math.sqrt(Math.pow(2 - (-1), 2) + Math.pow(2 - (-2), 2));
	        
	        // Verificar que la distancia calculada es correcta
	        assertEquals(distanciaEsperada, distancia, 0.0001, "La distancia calculada es incorrecta");
	    }
	}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

