package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFormasGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:" +
                               "\n1. Calcular área de uma forma geométrica" +
                               "\n2. Calcular perímetro de uma forma geométrica " +
                               "\n3. Calcular área combinada de formas geométricas" +
                               "\n4. Sair");


            int opcao = Teclado.obterInt(scanner);

            switch (opcao) {
                case 1:
                    calcularArea(scanner);
                    break;
                case 2:
                    calcularPerimetro(scanner);
                    break;
                case 3:
                    calcularAreaCombinada(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void calcularArea(Scanner scanner) {
        System.out.println("Escolha a forma geométrica:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");

        int forma = Teclado.obterInt(scanner);
        double resultado = 0;

        switch (forma) {
            case 1:
                System.out.println("Digite o lado do quadrado:");
                double ladoQuadrado = Teclado.obterDouble(scanner);
                Quadrado quadrado = new Quadrado(ladoQuadrado);
                resultado = quadrado.calcularArea();
                break;
            case 2:
                System.out.println("Digite o lado A do retângulo:");
                double ladoARetangulo = Teclado.obterDouble(scanner);
                System.out.println("Digite o lado B do retângulo:");
                double ladoBRetangulo = Teclado.obterDouble(scanner);
                Retangulo retangulo = new Retangulo(ladoARetangulo, ladoBRetangulo);
                resultado = retangulo.calcularArea();
                break;
            case 3:
                System.out.println("Digite o lado A do triângulo:");
                double ladoATriangulo = Teclado.obterDouble(scanner);
                System.out.println("Digite o lado B do triângulo:");
                double ladoBTriangulo = Teclado.obterDouble(scanner);
                System.out.println("Digite o lado C do triângulo:");
                double ladoCTriangulo = Teclado.obterDouble(scanner);
                Triangulo triangulo = new Triangulo(ladoATriangulo, ladoBTriangulo, ladoCTriangulo);
                resultado = triangulo.calcularArea();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                return;
        }

        System.out.println("A área é: " + resultado);
    }

    private static void calcularPerimetro(Scanner scanner) {
        System.out.println("Escolha a forma geométrica:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");

        int forma = Teclado.obterInt(scanner);
        double resultado = 0;

        switch (forma) {
            case 1:
                System.out.println("Digite o lado do quadrado:");
                double ladoQuadrado = Teclado.obterDouble(scanner);
                Quadrado quadrado = new Quadrado(ladoQuadrado);
                resultado = quadrado.calcularPerimetro();
                break;
            case 2:
                System.out.println("Digite o lado A do retângulo:");
                double ladoARetangulo = Teclado.obterDouble(scanner);
                System.out.println("Digite o lado B do retângulo:");
                double ladoBRetangulo = Teclado.obterDouble(scanner);
                Retangulo retangulo = new Retangulo(ladoARetangulo, ladoBRetangulo);
                resultado = retangulo.calcularPerimetro();
                break;
            case 3:
                System.out.println("Digite o lado A do triângulo:");
                double ladoATriangulo = Teclado.obterDouble(scanner);
                System.out.println("Digite o lado B do triângulo:");
                double ladoBTriangulo = Teclado.obterDouble(scanner);
                System.out.println("Digite o lado C do triângulo:");
                double ladoCTriangulo = Teclado.obterDouble(scanner);
                Triangulo triangulo = new Triangulo(ladoATriangulo, ladoBTriangulo, ladoCTriangulo);
                resultado = triangulo.calcularPerimetro();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                return;
        }

        System.out.println("O perímetro é: " + resultado);
    }

    private static void calcularAreaCombinada(Scanner scanner) {
        System.out.println("Digite o número de formas geométricas:");

        int numeroFormas = Teclado.obterInt(scanner);
        List<FormasGeometricas> formas = new ArrayList<>();

        for (int i = 0; i < numeroFormas; i++) {
            System.out.println("Escolha a forma geométrica para a forma " + (i+1) + ":");
            System.out.println("1. Quadrado");
            System.out.println("2. Retângulo");
            System.out.println("3. Triângulo");

            int forma = Teclado.obterInt(scanner);

            switch (forma) {
                case 1:
                    System.out.println("Digite o lado do quadrado:");
                    double ladoQuadrado = Teclado.obterDouble(scanner);
                    formas.add(new Quadrado(ladoQuadrado));
                    break;
                case 2:
                    System.out.println("Digite o lado A do retângulo:");
                    double ladoARetangulo = Teclado.obterDouble(scanner);
                    System.out.println("Digite o lado B do retângulo:");
                    double ladoBRetangulo = Teclado.obterDouble(scanner);
                    formas.add(new Retangulo(ladoARetangulo, ladoBRetangulo));
                    break;
                case 3:
                    System.out.println("Digite o lado A do triângulo:");
                    double ladoATriangulo = Teclado.obterDouble(scanner);
                    System.out.println("Digite o lado B do triângulo:");
                    double ladoBTriangulo = Teclado.obterDouble(scanner);
                    System.out.println("Digite o lado C do triângulo:");
                    double ladoCTriangulo = Teclado.obterDouble(scanner);
                    formas.add(new Triangulo(ladoATriangulo, ladoBTriangulo, ladoCTriangulo));
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    return;
            }
        }

        double areaCombinada = calcularAreaCombinada(formas);
        System.out.println("A área combinada das formas geométricas é: " + areaCombinada);
    }

    private static double calcularAreaCombinada(List<FormasGeometricas> formas) {
        double areaTotal = 0;
        for (FormasGeometricas forma : formas) {
            if (forma != null) {
                areaTotal += forma.calcularArea();
            }
        }
        return areaTotal;
    }
}

