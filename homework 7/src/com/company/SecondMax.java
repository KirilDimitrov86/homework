package com.company;

public class SecondMax {

    public static void main(String[] args) {
        int[] array = {3, 5, 8, 9, 4, 5};
        int max = array[0];
        int secondMax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (secondMax < array[i] && max != secondMax) {
                secondMax = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(secondMax);
    }
}
