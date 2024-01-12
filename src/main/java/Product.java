import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);
    float price =0;
    String product;
    String fullProduct = "Добавленные товары: ";

    float fullPrice;
    void addProduct() {
        Scanner scanner = new Scanner(System.in);



        do {
            System.out.print("Введите название товара: ");
            product = scanner.nextLine().trim();
        } while (product.isEmpty());

        boolean validPrice = false;
        do {
            System.out.print("Введите стоимость товара в формате \"рубли.копейки\": ");
            String priceString = scanner.nextLine().trim();
            try {
                price = Float.parseFloat(priceString);
                if (price >= 0) {
                    validPrice = true;
                } else {
                    System.out.println("Стоимость товара не может быть отрицательной!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный формат стоимости товара!");
            }
        } while (!validPrice);

        System.out.println("Товар успешно добавлен!\n");
        fullProduct += "\n" + product;
        fullPrice += price;
    }
    void addMoreProduct(){
        String end = "Завершить";
        String yes = "Да";
        while (true) {
            System.out.println("Хотите добавить ещё товар?\nДля продолжения введите: " + yes + "\nДля завершения введите: " + end);
            product = scanner.nextLine();
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