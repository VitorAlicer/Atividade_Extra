package org.example;

public class Retangulo extends FormasGeometricas {
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    double calcularArea() {
        return ladoA * ladoB;
    }

    double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}
