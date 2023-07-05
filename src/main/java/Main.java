import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People addPeople = new People();
        Product allProduct = new Product();
        Calculator addCalculator = new Calculator();
        addPeople.person();
        addPeople.morePerson();
        allProduct.addProduct();
        allProduct.addMoreProduct();
        addCalculator.endCalculator(allProduct.fullPrice, addPeople.personCheck);

       // String rub = " Рублей";
        //float priceForOne;
       // priceForOne = allProduct.fullPrice / addPeople.personCheck;
       // if (Math.floor(priceForOne) < 5){
      //      rub = "Рубля";
      //  }
      //  else if (Math.floor(priceForOne) == 1){
      //      rub = "Рубль";
      //  }
       // String.format("%.2f", priceForOne);
       // System.out.println("Сумма на человека: " + priceForOne + rub);
    }
}
