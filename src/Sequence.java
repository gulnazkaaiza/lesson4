import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        System.out.println("Введите первый член прогрессии: ");
        Scanner number1 = new Scanner(System.in);
        int a1 = 0;
        a1 = number1.nextInt();
        System.out.println("Введите знаменатель прогрессии: ");
        int d = 0;
        d = number1.nextInt();
        System.out.println("Введите n: ");
        int n = number1.nextInt();
        while (a1 > 100 || a1 < 1 && d > 100 || d < 1) {
            System.out.println("Не стоит вводить 0");
            System.out.println("Попробуем снова.Введите первый член прогрессии: ");
            a1 = number1.nextInt();
            System.out.println("Введите знаменатель прогрессии: ");
            d = number1.nextInt();
            if (a1 < 10 && a1 > 1 || d < 10 && d > 1) {
                break;
            }
        }
        System.out.println("Арифметическая прогрессия: ");
        String arithmeticProgression = "";
        for (int i = 1; i <= n; i++) {
            arithmeticProgression = arithmeticProgression + (a1 + (i - 1) * d) + ",";
        }
        System.out.print(arithmeticProgression.substring(0, arithmeticProgression.length() - 2));
        int i = 1;

        System.out.println(" ");

        System.out.println("Геометрическая прогрессия: ");
        String geometricProgression = "";
        for (i = 1; i <= n; i++) {
            geometricProgression = geometricProgression + (a1 * Math.pow(d, i - 1)) + ",";
        }
        System.out.print(geometricProgression.substring(0, geometricProgression.length() - 2));
    }
}
