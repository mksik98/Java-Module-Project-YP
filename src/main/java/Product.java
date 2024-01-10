import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);

    String product;
    String fullProduct = "Добавленные товары: ";
    float price;
    float fullPrice;
    void addProduct() {
        System.out.print("Введите название товара: ");
        product = scanner.nextLine();
        System.out.print("Введите стоимость товара в формате \"рубли.копейки\": ");
        price = scanner.nextFloat();
        System.out.println("Товар успешно добавлен!\n");
        fullProduct = fullProduct + "\n" + product ;
        fullPrice += price;
    }
    void addMoreProduct(){
        String end = "Завершить";
        String yes = "Да";
        while (true) {
            System.out.println("Хотите добавить ещё товар?\nДля продолжения введите: " + yes + "\nДля завершения введите: " + end);
            product = scanner.nextLine();
            product = scanner.nextLine(); // что бы не печатало то что выше 2 раза
            if (yes.equalsIgnoreCase(product)){
                addProduct();
                continue;
            }
            if (end.equalsIgnoreCase(product)){
                System.out.println(fullProduct);
                String.format("%.2f",fullPrice);
                System.out.println("Сумма товаров: " + fullPrice);
                break;
            }
        }
    }
}