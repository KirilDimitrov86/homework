package blackJack;

public class BlackJack {

    public static void main(String[] args) {

        int firstNum = 20;
        int secondNum = 20;

        int smallerNum = (firstNum>secondNum) ? (smallerNum = secondNum) : (smallerNum = firstNum);
        int biggerNum = (firstNum > secondNum) ? (biggerNum = firstNum) : (biggerNum = secondNum);
        int less21 = biggerNum <= 21 ? biggerNum : smallerNum;
        boolean areBiggerThen21 = firstNum > 21 && secondNum > 21;

        System.out.println(areBiggerThen21 ? 0 :less21 );
    }
}
