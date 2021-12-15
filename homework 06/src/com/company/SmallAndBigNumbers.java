package com.company;

import java.util.Scanner;

public class SmallAndBigNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        System.out.println("Please enter a sequence of numbers");
        System.out.println("Enter the number zero at the end of the sequence");

        for (; ; ) {

            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers == 0) {
                break;
            }
            if (numbers < small) {
                small = numbers;
            }
            if (numbers > big) {
                big = numbers;
            }

        }

        System.out.println("The biggest number of the sequence is " + big);
        System.out.println("The smallest number of the sequence is " + small);

    }
}
