/**
 * @author Sergeo Husachenko
 * @myNumber 2
 * @Task  Дані катети прямокутного трикутника. Знайти його гіпотенузу й площу.
 */

package Lab_1.Task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double a=input(in,"a");
        double b=input(in,"b");
        Triangle triangle = new Triangle(a, b);
        System.out.println("Perimeter : " + triangle.getPerimeter());
        System.out.println("Square : " + triangle.getSquare());
    }

    private static double input(Scanner in, String side) {
        System.out.print("Input " + side + " : ");
        return in.nextDouble();
    }
}
