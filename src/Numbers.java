//Написать программу, которая описывает введенное число.
// Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner yournumber = new Scanner(System.in);
        int number = yournumber.nextInt();
        if (number < 0) {
            System.out.println("Вы ввели отрицательное число ");
        }
        else if (number > 0 && (number % 2) == 0) {
            System.out.println("Вы ввели положительное и четное число ");
        }
        else if (number > 0 && (number % 2)!= 0) {
            System.out.println("Вы ввели положительное и нечетное число ");

        } else if (number <= 0) {
            System.out.println("Вы ввели число равное 0 ");

        }
    }
}
