package com.company;

import java.util.Arrays;

public class MagicTab {

    public static void main(String[] args) {
        int[][] tab = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}};

        int[] sumRows = new int[tab.length];
        int[] sumCol = new int[tab.length];
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        boolean isMagicTab = true;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                sumRows[i] = sumRows[i] + tab[i][j];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                sumCol[i] = sumCol[i] + tab[j][i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i == j) {
                    sumDiagonal1 = sumDiagonal1 + tab[i][j];
                }
                if (i + j == tab.length - 1) {
                    sumDiagonal2 = sumDiagonal2 + tab[i][j];
                }
            }
        }

        int[] allSums = new int[sumCol.length + sumRows.length + 2];  //"+2" for diagonals
        allSums[0] = sumDiagonal1;
        allSums[1] = sumDiagonal2;
        int counter = 2;

        for (int i = 0; i < sumRows.length; i++) {
            allSums[counter] = sumCol[i];
            counter++;
        }
        for (int j = 0; j < sumCol.length; j++) {
            allSums[counter] = sumCol[j];
            counter++;
        }
        for (int i = 0; i < allSums.length - 1; i++) {
            for (int j = 1; j < allSums.length; j++) {
                if (allSums[i] != allSums[j]) {
                    isMagicTab = false;
                    break;
                }
            }
        }
        if (isMagicTab) {
            System.out.println("magic");
        } else {
            System.out.println("not a magic");
        }
    }
}