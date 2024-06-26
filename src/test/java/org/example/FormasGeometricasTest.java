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
        Triangulo triangulo = new Triangulo(3, 4, 5);
        assertEquals(6, triangulo.calcularArea(), 0.001);
        assertEquals(12, triangulo.calcularPerimetro(), 0.001);
    }

    @Test
    public void testTrianguloInvalido() {
        new Triangulo(1, 2, 3);
    }

    @Test
    public void testCalcularAreaCombinada() {
        List<FormasGeometricas> formas = new ArrayList<>();
        formas.add(new Quadrado(2));
        formas.add(new Retangulo(3, 4));
        formas.add(new Triangulo(3, 4, 5));
        assertEquals(24, calcularAreaCombinada(formas), 0.001);
    }

    @Test
    public void testCalcularAreaCombinadaComNenhumaForma() {
        List<FormasGeometricas> formas = new ArrayList<>();
        assertEquals(0, calcularAreaCombinada(formas), 0.001);
    }

    @Test
    public void testCalcularAreaCombinadaComFormasVazias() {
        List<FormasGeometricas> formas = new ArrayList<>();
        formas.add(null);
        formas.add(null);
        formas.add(null);
        assertEquals(0, calcularAreaCombinada(formas), 0.001);
    }

    @Test
    public void testCalcularAreaCombinadaComUmaForma() {
        List<FormasGeometricas> formas = new ArrayList<>();
        formas.add(new Quadrado(3));
        assertEquals(9, calcularAreaCombinada(formas), 0.001);
    }

    private double calcularAreaCombinada(List<FormasGeometricas> formas) {
        double areaTotal = 0;
        for (FormasGeometricas forma : formas) {
            if (forma != null) {
                areaTotal += forma.calcularArea();
            }
        }
        return areaTotal;
    }

}