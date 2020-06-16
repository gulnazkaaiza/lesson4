//Написать программу для вывода на экран таблицы умножения.
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner yournumber = new Scanner(System.in);
        int number = 0;
        number = yournumber.nextInt();
        while (number > 100 || number < 1) {
            System.out.println("С такими числами таблица умножения бессильна!");
            System.out.println("Попробуем снова. Введите число: ");
            number = yournumber.nextInt();
            if (number < 10 && number > 1) {
                break;
            }
        }
        System.out.print("\n");
        for (int i = 1; i < 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
