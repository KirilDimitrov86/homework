package com.company;

import java.util.Scanner;

public class IsNumberPerfect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is perfect");
        int number = Integer.parseInt(scanner.nextLine());
        int counter = number - 1;
        int sumOfDivisors = 0;

        while (counter > 0) {
            if (number % counter == 0) {
                sumOfDivisors += counter;
            }
            counter--;
        }
        if (sumOfDivisors == number) {
            System.out.println("It is perfect");
        } else {
            System.out.println(number + " is not perfect");
        }
    }
}
