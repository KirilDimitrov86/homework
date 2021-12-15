package com.company;

import javax.swing.*;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkYear = scanner.nextInt();
        System.out.println(checkLeapYear(checkYear) ? "yes it is a leap year" : "no it is not a leap year");

    }

    public static boolean checkLeapYear(int year) {    // see leap years rule :https://bg.wikipedia.org/wiki/%D0%92%D0%B8%D1%81%D0%BE%D0%BA%D0%BE%D1%81%D0%BD%D0%B0_%D0%B3%D0%BE%D0%B4%D0%B8%D0%BD%D0%B0
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
