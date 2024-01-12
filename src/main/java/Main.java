import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People addPeople = new People();
        Product allProduct = new Product();
        addPeople.person();
        addPeople.morePerson();
        allProduct.addProduct();
        allProduct.addMoreProduct();

        double priceForOne;
       priceForOne = allProduct.fullPrice / addPeople.personCheck;
       String.format("%.2f", priceForOne);
       String rub = Rubend.formatter(priceForOne);
       System.out.println("Сумма на человека: " + priceForOne + rub);
    }
}

//dlya pr