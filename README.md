
# Proyecto Figuras Geométricas

## Descripción del Proyecto

Este proyecto implementa un sistema de figuras geométricas en Java. Consiste en una clase base abstracta `FiguraGeometrica` que define las propiedades y métodos comunes a todas las figuras geométricas, y varias clases derivadas que implementan figuras específicas como Círculo, Cuadrado y Triángulo. El proyecto incluye la clase utilitaria `Punto` para representar coordenadas en el plano.

El objetivo principal es demostrar el uso de herencia, polimorfismo y conceptos de programación orientada a objetos mediante el cálculo de propiedades geométricas como área, perímetro y validación de figuras.

## Estructura del Proyecto

```
figuras_geometricas_base/code/
├── README.md
├── pom.xml
├── .classpath
├── .project
├── src/
│   ├── main/java/com/endes/figuras/
│   │   ├── Circulo.java              # Implementación de círculos
│   │   ├── FiguraGeometrica.java     # Clase base abstracta
│   │   └── Punto.java                # Clase utilitaria para coordenadas
│   └── test/java/com/endes/figuras/
│       └── jUnitTestFiguraGeometrica.java  # Tests unitarios
```

## Integrantes del Equipo

| Integrante | Figura Asignada | Estado | Responsabilidades |
|-----------|-----------------|--------|------------------|
| Carlos Ruiz | Círculo | ✓ Completado | Implementación y pruebas de la clase Circulo |
| Joel Parrondo | Cuadrado | ✓ Completado | Implementación y pruebas de la clase Cuadrado |
| Jose Manuel | Triángulo | ⏳ Pendiente | Implementación y pruebas de la clase Triangulo |
| Adrián Domínguez | Base + Punto | ✓ Completado | Clase FiguraGeometrica base y clase Punto |


## Instrucciones de Compilación y Ejecución

### Requisitos Previos

- Java Development Kit (JDK) versión 11 o superior
- Apache Maven 3.6+ (si se utiliza Maven como gestor de dependencias)
- Git para clonar el repositorio (opcional)

### Compilar el Proyecto

#### Opción 1: Con Maven
```bash
cd figuras_geometricas_base/code
mvn clean compile
```

#### Opción 2: Con javac (compilación manual)
```bash
cd figuras_geometricas_base/code
# Compilar clases principales
javac -d target/classes -sourcepath src/main/java src/main/java/com/endes/figuras/*.java

# Compilar tests (si es necesario)
javac -d target/test-classes -sourcepath src/test/java:src/main/java \
      -cp target/classes:$CLASSPATH src/test/java/com/endes/figuras/*.java
```

### Ejecutar el Proyecto

Si existe una clase main:
```bash
# Con Maven
mvn exec:java -Dexec.mainClass="com.endes.figuras.NombreDelMain"

# O manualmente
java -cp target/classes com.endes.figuras.NombreDelMain
```

### Ejecutar las Pruebas

#### Con Maven
```bash
mvn test
```

#### Con JUnit (manual)
```bash
# Asegúrese de tener JUnit en el classpath
java -cp target/test-classes:target/classes:junit.jar org.junit.runner.JUnitCore com.endes.figuras.jUnitTestFiguraGeometrica
```

#### O ejecutar con un IDE
- **Eclipse**: Click derecho en jUnitTestFiguraGeometrica.java → Run As → JUnit Test
- **IntelliJ IDEA**: Click derecho en jUnitTestFiguraGeometrica.java → Run 'jUnitTestFiguraGeometrica'
- **NetBeans**: Click derecho en el archivo de test → Run File

## Descripción de las Clases Principales

### FiguraGeometrica (Clase Base)
Clase abstracta que define la interfaz común para todas las figuras geométricas. Contiene métodos abstractos como:
- `calcularArea()`: Calcula el área de la figura
- `calcularPerimetro()`: Calcula el perímetro de la figura

### Circulo
Implementa un círculo definido por su radio. Proporciona cálculos de área y perímetro. **[IMPLEMENTADO]**

### Cuadrado
Implementa un cuadrado definido por su lado. Proporciona cálculos de área y perímetro. **[PENDIENTE]**

### Triangulo
Implementa un triángulo. Puede estar definido por sus tres lados, tres puntos, o base y altura, según la implementación. **[PENDIENTE]**

### Punto
Clase utilitaria que representa un punto en el plano cartesiano con coordenadas (x, y).

## Notas Adicionales

- Todas las clases deben seguir convenciones de código Java estándar
- Los nombres de variables deben ser descriptivos y en camelCase
- Se espera que todos los cálculos geométricos sean precisos y validados
- Las clases deben incluir JavaDoc apropiado para documentación

## Ayuda y Soporte

Para preguntas o problemas durante el desarrollo, consulte con los miembros del equipo o revise la documentación de Java estándar.

---
