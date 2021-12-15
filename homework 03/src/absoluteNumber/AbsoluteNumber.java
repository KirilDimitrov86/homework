package absoluteNumber;

public class AbsoluteNumber {
    public static void main(String[] args) {
        int num = 24;
        boolean isPositive = num > 0;
        System.out.println(isPositive ? num : (-(num)));

    }
}
