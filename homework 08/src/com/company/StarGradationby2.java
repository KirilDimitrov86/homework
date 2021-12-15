package com.company;

import java.util.Scanner;

public class StarGradationby2 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int rows = sr.nextInt();


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
