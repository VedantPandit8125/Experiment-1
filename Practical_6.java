/*Implement a program to handle Arithematic exception arrayindex out of bounds the user enter two numbers num1 and num2. The division of num1 and num2 is displayed if num1 and num2 were not integer the program would throw a number format exception if num2 is zero the program would throw an arithematic exception. Display exception.*/
package test;

import java.util.*;

public class Practical_6 {
    public static void main(String[] args) {
        int Num1;
        int Num2;
        String input1, input2;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter first Number:");
            input1 = s.next();
            System.out.println("Enter Second Number:");
            input2 = s.next();
            Num1 = Integer.parseInt(input1);
            Num2 = Integer.parseInt(input2);
            System.out.println("Division of Number are" + (Num1 / Num2));
        } catch (NumberFormatException a) {
            System.out.println("throw Number format exception" + a);
        } catch (ArithmeticException b) {
            System.out.println(b);
        }
    }
}