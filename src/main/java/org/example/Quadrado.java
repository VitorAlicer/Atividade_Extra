package org.example;

public class Quadrado extends FormasGeometricas{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro() {
        return 4 * lado;
    }
}
