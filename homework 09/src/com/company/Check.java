package com.company;

import java.util.Random;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        System.out.println("Please insert number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        double result =  number  ;

        for (int i = 1; i <= 10; i++) {

            result = result * number;
            if (result >= 1000) {
                break;
            }
            System.out.println(result);
        }
    }
}