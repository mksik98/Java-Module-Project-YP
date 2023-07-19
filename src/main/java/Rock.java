import java.util.Scanner;

public class Rock {
    Scanner scanner = new Scanner(System.in);
    int personCheck;
    float fullPrice;
    float priceForOne;
    float price;
    String product;
    String fullProduct = "Добавленные товары: ";
    String rub = " Рублей";

    public void person() {
        System.out.println("Введите количество на сколько человек необходимо разделить счёт");
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Введите целое число, а не " + scanner.nextLine());
                continue;
            } else {
                personCheck = scanner.nextInt();
                break;
            }
        }
    }

    public void morePerson() {
        while (personCheck <= 1) {
            System.out.println("Некорректное значение, введите число больше 1");
            person();
            if (personCheck > 1) {
                break;
            }
        }
    }
    void addProduct() {
        System.out.print("Введите название товара: ");
        product = scanner.nextLine();
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

    public void endCalculator(){
        priceForOne = fullPrice / personCheck;
        if (Math.floor(priceForOne) < 5) {
            rub = " Рубль";
        }
        String.format("%.2f", priceForOne);
        System.out.println("Сумма на человека: " + priceForOne + rub);
    }
}