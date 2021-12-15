package com.company;

import java.util.Scanner;

public class Glasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 5); j++) {
                printStar(n, i, j);
                printStraightLines(n, i, j);
                printMiddle(n);
            }
            System.out.println();
        }
    }

    private static void printStraightLines(int n, int i, int j) {
        if ((i != 0 && i != n - 1) && (j != 0 && j != (n * 2) - 1)) {
            System.out.print("|");
        }
    }

    private static void printStar(int n, int i, int j) {
        if ((i == 0 || i == n - 1) || ((j >= 0 && j < (n * 2)) || (j >= n * 3 && j <= n * 5))) {
            System.out.print("*");
        }
    }

    public static void printMiddle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }

        }
    }
}
