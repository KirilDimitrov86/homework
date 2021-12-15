package com.company;

public class HappyNumbers {

    public static void main(String[] args) {

        for (int i = 1000; i < 10000; i++) {
            int firstDigit = i / 1000;
            int secondDigits = (i / 100) % 10;
            int thirdDigit = (i / 10) % 10;
            int fourthDigit = i % 10;

            if (firstDigit + secondDigits == thirdDigit + fourthDigit) {
                System.out.println(i);
            }
        }
    }
}
