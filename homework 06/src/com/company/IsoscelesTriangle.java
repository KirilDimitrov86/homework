package com.company;

import java.util.Scanner;

public class IsoscelesTriangle {

    public static void main(String[] args) {
        System.out.println("Please enter the side of the triangle.");
        Scanner scanner = new Scanner(System.in);
        int lengthOfSide = scanner.nextInt();

        for (int i = 1; i <= lengthOfSide; i++) {
            for (int space = 1; space <= lengthOfSide - i; space++) {
                System.out.print(" ");
            }
            for (int symbol = 1; symbol <= (2 * i) - 1; symbol++) {
                System.out.print("о");
            }
            System.out.println();
        }
    }
}
