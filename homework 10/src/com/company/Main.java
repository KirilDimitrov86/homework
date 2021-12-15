package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, insert number between 3 and 100: ");
        int n = scanner.nextInt();

        while (n < 3 || n > 100) {
            System.out.print("Please, insert valid number: ");
            n = scanner.nextInt();
        }
        printFrame(n);
        printMiddle(n);
        printFrame(n);
    }

    public static void printFrame(int n) {
        for (int i = 0; i <= n * 5; i++) {
            printFrameStars(i, n);
            printFrameSpaces(i, n);
        }
        System.out.println();
    }

    public static void printMiddle(int n) {
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j <= n * 5; j++) {
                printStars(j, n);
                printSpaces(i, j, n);
                printStraightLines(i, j, n);
                printSlashes(j, n);
            }
            System.out.println();
        }
    }

    public static void printFrameStars(int i, int n) {
        if ((i >= 0 && i < n * 2) || i > n * 3) {
            System.out.print("*");
        }
    }

    public static void printFrameSpaces(int i, int n) {
        if (i > n * 2 && i <= n * 3) {
            System.out.print(" ");
        }
    }

    public static void printStars(int j, int n) {
        if (j == 0 || j == n * 2 || j == n * 3 + 1 || j == n * 5) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int i, int j, int n) {
        if (j > n * 2 && j <= n * 3 && i != (n - 2) / 2) {
            System.out.print(" ");
        }
    }

    public static void printStraightLines(int i, int j, int n) {
        if (j > n * 2 && j <= n * 3 && i == (n - 2) / 2) {
            System.out.print("|");
        }
    }

    public static void printSlashes(int j, int n) {
        if ((j > 0 && j < n * 2 - 1) || (j > n * 3 + 1 && j < n * 5)) {
            System.out.print("/");
        }
    }
}

