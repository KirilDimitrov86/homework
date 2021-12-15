package com.company;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int singles = number % 10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;
        int lastTwoDigits = number % 100;
        String singlesInWord = "";
        String dozensInWords = "";
        String hundredsInWords = "";
        String specialNumbers = "";  //I want to change the name to "elevenТoNineteen",but I have problems with the program and won't touch anything anymore

        switch (hundreds) {
            case 1:
                hundredsInWords = "сто";
                break;
            case 2:
                hundredsInWords = "двеста";
                break;
            case 3:
                hundredsInWords = "триста";
                break;
            case 4:
                hundredsInWords = "четиристотин";
                break;
            case 5:
                hundredsInWords = "петстотин";
                break;
            case 6:
                hundredsInWords = "шестстотин";
                break;
            case 7:
                hundredsInWords = "седемстотин";
                break;
            case 8:
                hundredsInWords = "осемстотин";
                break;
            case 9:
                hundredsInWords = "деветстотин";
                break;

        }
        switch (dozens) {
            case 1:
                dozensInWords = "десет";
                break;
            case 2:
                dozensInWords = "двайсет";
                break;
            case 3:
                dozensInWords = "трийсет";
                break;
            case 4:
                dozensInWords = "четиресет";
                break;
            case 5:
                dozensInWords = "педесет";
                break;
            case 6:
                dozensInWords = "шийсет";
                break;
            case 7:
                dozensInWords = "седемдесет";
                break;
            case 8:
                dozensInWords = "осемдесет";
                break;
            case 9:
                dozensInWords = "деведесет";
                break;
        }
        switch (singles) {
            case 1:
                singlesInWord = "едно";
                break;
            case 2:
                singlesInWord = "две";
                break;
            case 3:
                singlesInWord = "три";
                break;
            case 4:
                singlesInWord = "четири";
                break;
            case 5:
                singlesInWord = "пет";
                break;
            case 6:
                singlesInWord = "шест";
                break;
            case 7:
                singlesInWord = "седем";
                break;
            case 8:
                singlesInWord = "осем";
                break;
            case 9:
                singlesInWord = "девет";
                break;
        }
        switch (number) {
            case 11:
                specialNumbers = "единайсет";
                break;
            case 12:
                specialNumbers = "дванайсет";
                break;
            case 13:
                specialNumbers = "тринайсет";
                break;
            case 14:
                specialNumbers = "четиринайсет";
                break;
            case 15:
                specialNumbers = "петнайсет";
                break;
            case 16:
                specialNumbers = "шестнайсет";
                break;
            case 17:
                specialNumbers = "седемнайсет";
                break;
            case 18:
                specialNumbers = "осемнайсет";
                break;
            case 19:
                specialNumbers = "деветнайсет";
                break;
        }
        switch (lastTwoDigits) {
            case 11:
                specialNumbers = "единайсет";
                break;
            case 12:
                specialNumbers = "дванайсет";
                break;
            case 13:
                specialNumbers = "тринайсет";
                break;
            case 14:
                specialNumbers = "четиринайсет";
                break;
            case 15:
                specialNumbers = "петнайсет";
                break;
            case 16:
                specialNumbers = "шестнайсет";
                break;
            case 17:
                specialNumbers = "седемнайсет";
                break;
            case 18:
                specialNumbers = "осемнайсет";
                break;
            case 19:
                specialNumbers = "деветнайсет";
                break;
        }
        if (number == 0) {
            System.out.println("нула");
        } else if (number >= 1 && number < 10) {
            switch (number) {
                case 1:
                    singlesInWord = "едно";
                    break;
                case 2:
                    singlesInWord = "две";
                    break;
                case 3:
                    singlesInWord = "три";
                    break;
                case 4:
                    singlesInWord = "четири";
                    break;
                case 5:
                    singlesInWord = "пет";
                    break;
                case 6:
                    singlesInWord = "шест";
                    break;
                case 7:
                    singlesInWord = "седем";
                    break;
                case 8:
                    singlesInWord = "осем";
                    break;
                case 9:
                    singlesInWord = "девет";
                    break;
            }
            System.out.println(singlesInWord);
        } else if (number > 10 && number < 20) {
            System.out.println(specialNumbers);
        } else if (number >= 10 && number < 100) {
            if (number % 10 == 0) {
                System.out.println(dozensInWords);
            } else {
                System.out.println(dozensInWords + " и " + singlesInWord);
            }
        } else if (number >= 100 && number < 1000) {
            if (number % 100 == 0) {
                System.out.println(hundredsInWords);
            } else if (lastTwoDigits > 10 && lastTwoDigits < 20) {
                System.out.println(hundredsInWords + " и " + specialNumbers);
            } else if (lastTwoDigits % 10 == 0) {
                System.out.println(hundredsInWords + " и " + dozensInWords);
            } else {
                System.out.println(hundredsInWords + " " + dozensInWords + " и " + singlesInWord);
            }
        } else if (number == 1000) {
            System.out.println("хиляда");
        }
    }
}
