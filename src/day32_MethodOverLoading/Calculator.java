package day32_MethodOverLoading;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int first = scan.nextInt();
        System.out.println("enter your operator");
        char operator = scan.next().charAt(0);
        System.out.println("enter your second number");
        int second = scan.nextInt();
        int result = Calculator(first,second,operator);
        System.out.println("your result is: "+result);
    }

    public static int Calculator(int num1, int num2, char operator) {

        int result = (operator == '+') ? num1 + num2 : (operator == '-') ? num1 - num2 : (operator == '*') ? num1 * num2 :
                (operator == '/') ? num1 / num2 : (operator == '%') ? num1 % num2 : 0;

        return result;

    }
}