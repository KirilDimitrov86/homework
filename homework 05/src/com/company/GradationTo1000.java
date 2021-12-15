package com.company;

import java.util.Scanner;

public class GradationTo1000 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();
        int result = 1;
        int counter = 1;

        while (result <= 1000) {
            result *= number;

            if (number == 1 || number == 0) {
                break;
            }

            if (result <= 1000) {
                System.out.println(result);
            }
            counter++;
        }
    }
}
