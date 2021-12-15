package com.company;

import java.util.Random;
import java.util.Scanner;

public class GesTheNumberModified {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int n = random.nextInt(20) + 1;
        // System.out.println(n);// - when you test, you can see the random number

        System.out.println("Enter a number between 1 and 20 ");
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 1; // I don't need a "counter" but I wanted the player to see on which try he guessed the number.

        while (number != n) {
            if (number > n) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Too low, try again!");
            }
            int newNumber = Integer.parseInt(scanner.nextLine());
            number = newNumber;
            counter++;
        }

        if (number == n) {
            System.out.println("You guessed right, " + number + " is the correct number.");
            System.out.println("You guessed it on the " + counter + " try.");
        }
    }
}
