package possibleТriangle;

import java.util.Scanner;

public class PossibleTriangle {

    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 3;

        boolean isPossible = (a + b > c) && (b + c > a) && (a + c > b);

        System.out.println(isPossible? "Тhe triangle is possible." : "Тhe triangle is not possible." );
    }
}
