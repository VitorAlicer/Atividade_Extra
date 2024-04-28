package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

    public static int obterInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
    }

    public static double obterDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número real.");
                scanner.next();
            }
        }
    }
}
