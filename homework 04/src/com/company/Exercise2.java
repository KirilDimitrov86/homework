package com.company;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        int finalPoints = 0;

        if (points >= 1 && points <= 3) {
            finalPoints = points * 10;
            System.out.println(finalPoints);
        } else if (points >= 4 && points <= 6) {
            finalPoints = points * 100;
            System.out.println(finalPoints);
        } else if (points >= 7 && points <= 9) {
            finalPoints = points * 1000;
            System.out.println(finalPoints);
        } else {
            System.out.println("Error");
        }

    }
}
