package highClassAuto;

public class HighClassAuto {
    public static void main(String[] args) {

        byte carsAge = 5; // if the car is over 127 years it's a relic
        double carsPrice = 40001.00;

        boolean isHighClass = (carsAge > 5 && carsPrice > 20000) || (carsAge <= 5 && carsPrice > 40000);

        System.out.println(isHighClass ? "The car is high class." : "The car is low class.");
    }
}
