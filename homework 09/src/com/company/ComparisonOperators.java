package com.company;

import java.util.Scanner;

public class ComparisonOperators {

    public static void main(String[] args) {
        int[] input = getInput();

        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i]);
            printOperator(input[i], input[i + 1]);
        }
        System.out.print(input[input.length - 1]);

    }

    private static void printOperator(int a, int b) {
        if (a < b) {
            System.out.print("<");

        } else if (a > b) {
            System.out.print(">");

        } else if (a == b) {
            System.out.print("=");
        }
    }

    private static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[10];
        for (int i = 0; i < 10; i++) {
            input[i] = scanner.nextInt();
        }
        return input;
    }
}
