package com.company;

import java.util.Scanner;

public class ModulusBy3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        printResult(firstNumber, secondNumber);

    }

    private static void printResult(int a, int b) {
        if (areEqual(a, b)) {
            System.out.println("The division remainder is the same.");
        } else {
            System.out.println("The division remainder is different.");
        }
    }

    private static boolean areEqual(int a, int b) {

        return (ModulusBy3(a) == ModulusBy3(b));
    }

    public static int ModulusBy3(int a) {
        return (a % 3);
    }


}
