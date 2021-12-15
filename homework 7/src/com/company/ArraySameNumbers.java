package com.company;

public class ArraySameNumbers {

    public static void main(String[] args) {
        int[] numberArrayOne = {1, 2, 3, 4, 5, 1};
        int[] numberArrayTwo = {4, 10, 2, 6, 20};
        int[] result;
        int counter = 0;

        if (numberArrayOne.length > numberArrayTwo.length) {
            result = new int[numberArrayOne.length];
        } else {
            result = new int[numberArrayTwo.length];
        }

        int i, j;
        for (i = 0; i < numberArrayOne.length; i++) {
            for (j = 0; j < numberArrayTwo.length; j++) {
                if (numberArrayOne[i] == numberArrayTwo[j]) {
                    result[counter] = numberArrayOne[i];
                    System.out.println(result[counter]);
                    counter++;
                }
            }
        }
    }
}
