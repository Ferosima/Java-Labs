/**
 * @author Sergeo Husachenko
 * @myNumber 2
 * @Task Написати метод для обчислення значення функції:
 * Та вивести таблицю її значень
 */
package Lab_1.Task_5;

import java.util.Scanner;

public class Task_5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double[] range = inputRange(in);
        outputFunction(range);
    }

    private static double[] inputRange(Scanner in) {
        double[] range = new double[2];
        System.out.print("Input range start : ");
        range[0] = in.nextDouble();
        System.out.print("Input range end : ");
        range[1] = in.nextDouble();
        return range;
    }

    private static void outputFunction(double[] range) {
        for (double x = range[0]; x < range[1]; x++) {
            double y = 1 - (Math.pow(x, 3) / 2) + (Math.pow(x, 4) / 2) - (Math.pow(x, 6) / 720);
            System.out.println("y : " + y + " | " + "x : " + x);
        }
    }

}
