package com.company;

import java.util.Scanner;

public class MatrixOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number between 1 and 20");
        int number = Integer.parseInt(scanner.nextLine());
        int nextNumber = number;

        if (number <= 20) {
            for (int i = number; i > 0; i--) {
                for (int j = nextNumber - (number - 1); j - 1 <= nextNumber - 1; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
                nextNumber++;
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
