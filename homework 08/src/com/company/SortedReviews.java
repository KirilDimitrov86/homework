package com.company;

import java.sql.Array;
import java.util.Arrays;

public class SortedReviews {

    public static void main(String[] args) {
        int[][] reviewersScores = {{4, 6, 2, 5}, {7, 8, 4, 8}, {6, 2, 3, 7}};

        int width = reviewersScores[0].length;
        int height = reviewersScores.length;

        int[] reviewsScore = new int[width * height];
        int counter = 0;

        while (counter < reviewsScore.length) {
            for (int i = 0; i < reviewersScores.length; i++) {
                for (int j = 0; j < reviewersScores[i].length; j++) {
                    reviewsScore[counter] = reviewersScores[i][j];
                    counter++;
                }
            }
        }
        int swap;
        for (int i = 0; i < reviewsScore.length; i++) {
            for (int j = 1; j < (reviewsScore.length - i); j++) {
                if (reviewsScore[j - 1] > reviewsScore[j]) {
                    swap = reviewsScore[j - 1];
                    reviewsScore[j - 1] = reviewsScore[j];
                    reviewsScore[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(reviewsScore));
    }

}
