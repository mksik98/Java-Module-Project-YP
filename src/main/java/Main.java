import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People addPeople = new People();
        Product product = new Product();
        addPeople.person();
        addPeople.morePerson();
        product.addProduct();
        product.addMoreProduct();

        double priceForOne;
       priceForOne = product.fullPrice / addPeople.personCheck;
       String.format("%.2f", priceForOne);
       String rub = Rubend.formatter(priceForOne);
       System.out.println("Сумма на человека: " + priceForOne + rub);
    }
}

//dlya pr