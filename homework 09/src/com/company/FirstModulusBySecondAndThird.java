package com.company;

import java.util.Scanner;

public class FirstModulusBySecondAndThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        System.out.println(areEqual(first, second, third) ? "yes" : "no");
    }

    public static boolean areEqual(int a, int b, int c) {
        return (a % b == 0 && a % c == 0);
    }
}
