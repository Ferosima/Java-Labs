/**
 * Write a description of class hello here.
 *
 * @author Sergeo Husachenko
 */
package Lab_1;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your first line");
        String str_1 = sc.nextLine();
        System.out.println("input your second line");
        String str_2 = sc.nextLine();
        System.out.println("Compare :" + str_1.equals(str_2));
        String str_3 = str_1 + str_2;
        System.out.println("Concatenation :" + str_3);
        System.out.println("Count of Chars :" + str_3.length());
    }
}


