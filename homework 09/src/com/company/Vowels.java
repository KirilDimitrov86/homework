package com.company;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        
        compareSymbolToVowel(symbol);
    }

    public static void compareSymbolToVowel(String a) {
        switch (a) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "y":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "Y":
                System.out.println("yes");break;
            default:
                System.out.println("nat a vowel");
        }
    }
}
