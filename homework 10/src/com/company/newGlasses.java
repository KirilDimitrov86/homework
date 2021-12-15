package com.company;

import java.util.Scanner;

public class newGlasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 5); j++) {
                if ((i == 0 || i == n - 1) || ((j >= 0 && j < (n * 2)) || (j >= n * 3 && j <= n * 5))) {
                    System.out.print("*");
                }
                if ((j > n * 3 && j < n * 4)&& (i!=n/2)) {
                    System.out.print(" ");
                } else if ((i > n * 2 && i <= n * 3) && (j > n * 3 && j < n * 4))
                    System.out.print("|");

            }
            System.out.println();
        }
    }
}
