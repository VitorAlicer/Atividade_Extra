package org.example;

public class Triangulo extends FormasGeometricas {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        if (!trianguloValido(ladoA,ladoB,ladoC)) {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calcularArea() {
        double semiPerimetro = calcularPerimetro() / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
    }

   public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

   private boolean trianguloValido(double ladoA, double ladoB, double ladoC) {
       return ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA;
   }
}


