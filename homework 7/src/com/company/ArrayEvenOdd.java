package com.company;

public class ArrayEvenOdd {

    public static void main(String[] args) {

        int[] arrayOne = {3, 5, 8, 9, 4, 5};
        int[] arrayTwo = {11, 22, 33, 44, 55, 66};

        int[] arrayResult = new int[arrayOne.length];

        for (int i = 0; i < arrayOne.length; i++) {
            if (i % 2 == 0) {
                arrayResult[i] = arrayOne[i];
            } else {
                arrayResult[i] = arrayTwo[i];
            }
            System.out.println(arrayResult[i]);
        }
    }
}
