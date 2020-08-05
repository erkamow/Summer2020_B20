package day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");

        double num3 = input.nextDouble();

        System.out.println("you entered:" + num3);

        // int num1 = input.nextInt();
        // long num2 = input.nextLong();
        // System.out.println("you entered:" + num2);

        // System.out.println("you entered: " + num1);

    }
}
