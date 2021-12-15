package com.company;

public class MultiplicationArrayByIndex {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] newNumbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i] * i;
            System.out.println(newNumbers[i]);
        }
    }
}
