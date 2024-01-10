import java.util.Scanner;
public class People {
    Scanner scanner = new Scanner(System.in);
    int personCheck;
    public void person() {
        System.out.println("Введите количество на сколько человек необходимо разделить счёт");
        while (true){
            if (!scanner.hasNextInt()) {
                System.out.println("Введите целое число, а не "+scanner.nextLine());
            } else {
                personCheck= scanner.nextInt();
                break;
            }
            }
        }

    public void morePerson() {
        while (personCheck <= 1) {
            System.out.println("Некорректное значение, введите число больше 1");
            person();
            if (personCheck > 1){
                break;
            }
        }

    }
}