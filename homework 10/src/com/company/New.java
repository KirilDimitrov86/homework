package com.company;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {

        System.out.println("1. Reverse the sequence of the digits of a two-digit number");
        System.out.println("2. Calculate the arithmetic mean of two numbers");
        System.out.println("3. Solve the linear equation a × x + b = 0");

        System.out.print("Choose your option (1, 2 or 3): ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        while (option < 1 || option > 3) {
            System.out.print("Please, enter a valid option: ");
            option = scanner.nextInt();
        }

        reverseNumberSequence(option);
        calculateArithmeticMean(option);
        solveEquation(option);
    }

    public static void reverseNumberSequence(int option) {
        if (option == 1) {
            System.out.print("Enter your positive two-digit number: ");
            Scanner scanner = new Scanner(System.in);
            int twoDigitNumber = scanner.nextInt();
            while (twoDigitNumber < 10 || twoDigitNumber > 99) {
                System.out.print("Positive two-digit number, please: ");
                twoDigitNumber = scanner.nextInt();
            }
            int firstDigit = twoDigitNumber / 10;
            int secondDigit = twoDigitNumber % 10;
            System.out.print("Reversed number: " + Integer.toString(secondDigit) + Integer.toString(firstDigit));
        }
    }

    public static void calculateArithmeticMean(int option) {
        if (option == 2) {
            System.out.print("First number: ");
            Scanner scanner = new Scanner(System.in);
            double firstNumber = scanner.nextDouble();
            while (firstNumber <= 0) {
                System.out.print("Please, enter a positive number: ");
                firstNumber = scanner.nextDouble();
            }
            System.out.print("Second number: ");
            double secondNumber = scanner.nextDouble();
            while (secondNumber <= 0) {
                System.out.print("Please, enter a positive number: ");
                firstNumber = scanner.nextDouble();
            }
            System.out.print("Arithmetic mean: " + ((firstNumber + secondNumber) / 2));
        }
    }

    public static void solveEquation(int option) {
        if (option == 3) {
            System.out.print("Number \"a\": ");
            Scanner scanner = new Scanner(System.in);
            double numberA = scanner.nextDouble();
            while (numberA == 0) {
                System.out.print("Please, enter a number different from 0: ");
                numberA = scanner.nextInt();
            }
            System.out.print("Number \"b\": ");
            double numberB = scanner.nextDouble();
            while (numberB == 0) {
                System.out.print("Please, enter a number different from 0: ");
                numberB = scanner.nextInt();
            }
            System.out.print("X: " + ((-numberB) / numberA));
        }
    }
}

