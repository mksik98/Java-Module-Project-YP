import java.util.Scanner;

public class Calculator {
        float fullPrice;
        int personCheck;
        float priceForOne;
    String rub = " Рублей";

    public void endCalculator(float b, int a){
        priceForOne = fullPrice / personCheck;
        if (Math.floor(priceForOne) < 5) {
            rub = " Рубль";
        }
        String.format("%.2f", priceForOne);
        System.out.println("Сумма на человека: " + priceForOne + rub);
    }


}