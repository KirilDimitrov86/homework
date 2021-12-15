package com.company;

import java.util.Scanner;

public class Gradation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();
        System.out.println("Please enter the power of the number.");
        int powerOfNumber = scanner.nextInt();

//        int result = (int)Math.pow(number,powerOfNumber);
//         or
//        int result =1;
//        for (int i = 1;i<=powerOfNumber ;i++){
//             result =result * number;
//        }
//        System.out.println(result);
        int result = 1;
        int counter = 1;

        while (counter <= powerOfNumber) {
            result = result * number;
            counter++;
        }
        System.out.println(result);
    }
}
