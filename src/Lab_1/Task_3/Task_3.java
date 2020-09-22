/**
 * @author Sergeo Husachenko
 * @myNumber 2
 * @Task Дані дійсні числа x (0<x<1) та eps(0<eps<1) Обчислити з точністю eps суму
 * Уважати, що необхідна точність досягнута, якщо черговий доданок виявився по модулю менше,
 * чим eps - цей та всі наступні доданки можна вже не враховувати.
 */
package Lab_1.Task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double x = input(in, "x");
        double eps = input(in, "eps");
        double sum = getSum(x, eps);
        System.out.println("Sum : " + sum);
    }

    private static double input(Scanner in, String x) {
        double number = 0;
        do {
            System.out.print("Input " + x + "(0<" + x + "<1) : ");
            number = in.nextDouble();
        } while (number > 1 || number < 0);
        return number;
    }

    private static double getSum(double x, double eps) {
        double sum = 0;
        int k = 0;
        do {
            sum = (Math.pow(-1, k) * Math.pow(x, 2 * k + 1)) / (factorial(k) * (2 * k + 1));
            k++;
        } while (Math.abs(sum) > eps);
        return sum;
    }

    public static long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
