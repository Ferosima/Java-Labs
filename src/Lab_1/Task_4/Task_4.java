/**
 * @author Sergeo Husachenko
 * @myNumber 2
 * @Task Дані дійсні array[16]. Одержати max(array[i]+array[i+1]).
 */
package Lab_1.Task_4;

import java.util.Random;

public class Task_4 {
    public static void main(String args[]) {
        double[] doubleArray = randomArray();
        System.out.println("MAX : "+max(doubleArray));
    }

    private static double[] randomArray() {
        Random rd = new Random(); // creating Random object
        double[] arr = new double[16];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextDouble(); // storing random integers in an array
        }
        return arr;
    }

    private static double max(double[] array) {
        double max = 0;
        for (int i = 1; i < array.length; i++) {
            double arrayElementsSum = array[i] + array[i - 1];
            if (arrayElementsSum > max) {
                max = arrayElementsSum;
            }
        }
        return max;
    }
}
