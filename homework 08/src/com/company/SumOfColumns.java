package com.company;

public class SumOfColumns {

    public static void main(String[] args) {
        int[][] tab = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };

        for (int i = 0; i < tab.length; i++) {
            int sumCol = 0;
            for (int j = 0; j < tab[i].length; j++) {
                sumCol = sumCol + tab[j][i];
                System.out.print(tab[j][i] + ",");
            }
            System.out.println(" the sum of the elements is: " + sumCol);
        }
    }
}
