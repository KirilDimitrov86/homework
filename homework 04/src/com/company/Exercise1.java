package com.company;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;

        if ((number - 21) > 21) {
            result = (number - 21) * 2;
            System.out.println(result);
        } else {
            result = Math.abs(number - 21); // if I don't use Math.abs, I have to use an "if" in the "else".
            System.out.println(result);
        }
    }
}
