package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormasGeometricasTest {

    @Test
    public void testQuadrado() {
        Quadrado quadrado = new Quadrado(5);
        assertEquals(25, quadrado.calcularArea(), 0.001);
        assertEquals(20, quadrado.calcularPerimetro(), 0.001);
    }

    @Test
    public void testRetangulo() {
        Retangulo retangulo = new Retangulo(4, 6);
        assertEquals(24, retangulo.calcularArea(), 0.001);
        assertEquals(20, retangulo.calcularPerimetro(), 0.001);
    }

    @Test
    public void testTriangulo() {
        Triangulo triangulo = new Triangulo(3, 4);
        assertEquals(6, triangulo.calcularArea(), 0.001);
        assertEquals(-1, triangulo.calcularPerimetro(), 0.001);
    }

    @Test
    public void testCalcularAreaCombinada() {
        List<FormasGeometricas> formas = new ArrayList<>();
        formas.add(new Quadrado(2));
        formas.add(new Retangulo(3, 4));
        formas.add(new Triangulo(5, 6));
        assertEquals(31, calcularAreaCombinada(formas), 0.001);
    }
    private double calcularAreaCombinada(List<FormasGeometricas> formas) {
        double areaTotal = 0;
        for (FormasGeometricas forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }


}