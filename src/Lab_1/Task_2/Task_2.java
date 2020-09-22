/**
 * @author Sergeo Husachenko
 * @myNumber 2
 * @Task Дані дійсні числа A, B, C. Знайти тих з них, які не належать відрізку [0,2].
 */
package Lab_1.Task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double a = input(in, "a");
        double b = input(in, "b");
        double c = input(in, "c");
        Double[] numbers = {a, b, c};
        System.out.println("Out of range" + check(numbers));
    }

    private static double input(Scanner in, String number) {
        System.out.print("Input " + number + " : ");
        return in.nextDouble();
    }

    private static ArrayList<Double> check(Double[] numbers) {
        ArrayList<Double> outOfRange = new ArrayList<Double>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 || numbers[i] > 2) {
                outOfRange.add(numbers[i]);
            }
        }
        return outOfRange;
    }
}
