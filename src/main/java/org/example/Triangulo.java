package org.example;

public class Triangulo extends FormasGeometricas {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return 0.5 * base * altura;
    }

    double calcularPerimetro() {
        return -1;
    }
}
