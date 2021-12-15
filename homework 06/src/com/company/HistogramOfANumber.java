package com.company;

import java.util.Scanner;

public class HistogramOfANumber {

    public static void main(String[] args) {
        System.out.println("Please enter a number between 100 and 30000");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int tensOfThousands = number / 10000;
        int thousands = (number / 1000) % 10;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        if (number >= 100 && number < 1000) {
            System.out.print(ones);
            for (int i = 1; i <= ones; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(tens);
            for (int i = 1; i <= tens; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(hundreds);
            for (int i = 1; i <= hundreds; i++) {
                System.out.print("*");
            }
        } else if (number >= 1000 && number < 10000) {
            System.out.print(ones);
            for (int i = 1; i <= ones; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(tens);
            for (int i = 1; i <= tens; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(hundreds);
            for (int i = 1; i <= hundreds; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(thousands);
            for (int i = 1; i <= thousands; i++) {
                System.out.print("*");
            }
        } else if (number >= 10000 && number <= 30000) {
            System.out.print(ones);
            for (int i = 1; i <= ones; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(tens);
            for (int i = 1; i <= tens; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(hundreds);
            for (int i = 1; i <= hundreds; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(thousands);
            for (int i = 1; i <= thousands; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(tensOfThousands);
            for (int i = 1; i <= tensOfThousands; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
