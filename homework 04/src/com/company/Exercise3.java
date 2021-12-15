package com.company;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 2;
        double b = 3;
        double result = 0;
        int equation = Integer.parseInt(scanner.nextLine());

        switch (equation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = b - 1;
                break;
            case 4:
                result = a * b;
                break;
            case 5:
                result = a / b;
                break;
            case 6:
                result = b / a;
                break;
        }
        System.out.println(result);
    }
}
