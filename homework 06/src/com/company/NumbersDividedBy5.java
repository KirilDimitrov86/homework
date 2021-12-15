package com.company;

import java.util.Scanner;

public class NumbersDividedBy5 {

    public static void main(String[] args) {
        System.out.println("Please enter the upper range number.");

        Scanner scanner = new Scanner(System.in);
        int upperRangeOfNumbers = scanner.nextInt();

        for (int i = 0; i <= upperRangeOfNumbers; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
