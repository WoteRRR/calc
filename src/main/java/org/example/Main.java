import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число: ");
        int number = scanner.nextInt();
        System.out.println("Выберите операцию (кв, кр): ");
        String operation = scanner.next();

        switch (operation) {
            case "кв":
                int square = number * number;
                System.out.println("Квадрат: " + square);
                break;
            case "кр":
                Double sqrt = Math.sqrt(number);
                System.out.println("Корень: " + sqrt);
                break;
            default:
                System.out.println("Неверная операция.");
        }
    }
}