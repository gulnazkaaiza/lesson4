//Написать программу для поиска минимального из двух чисел
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа: ");
        Scanner numbers = new Scanner (System.in);
        int number1 = numbers.nextInt();
        int number2 = numbers.nextInt();
        if (number1 < number2) {
            System.out.println("Минимальное из чисел: "+number1);
        }
        else if (number1 > number2) {
            System.out.println("Минимальное из чисел: "+number2);
        }
        else if (number1 == number2) {
            System.out.println("Вы ввели одинаковые числа ");
        }
    }
}


