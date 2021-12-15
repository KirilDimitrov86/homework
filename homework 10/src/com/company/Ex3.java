package com.company;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("1. Reverse number.");
        System.out.println("2. Calculate the average of two numbers.");
        System.out.println("3. Solve the  equation.");

        System.out.print("Choose (1, 2 or 3): ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        double result = 0;
        switch (option) {
            case 1:
                reverseNumber();
                break;
            case 2:average();
                break;
            case 3:equation();
                break;
            default:
                System.out.println("Invalid input");

        }
    }

    private static double equation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two-digit number: ");
        int twoDigitNumber = scanner.nextInt();

        return 0;
    }

    private static double average() {
        Scanner scanner = new Scanner(System.in);
        return 0 ;
    }

    private static int reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        return 0 ;
    }
}
