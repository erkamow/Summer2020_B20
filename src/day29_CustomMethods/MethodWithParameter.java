package day29_CustomMethods;

import java.util.Scanner;

public class MethodWithParameter {

    public static void main(String[] args) {

        printHello(10);

        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter currnet year and birth year");
        int birthYear = scan.nextInt();
        int currentYear = scan.nextInt();

        age(birthYear,currentYear);


    }


    public static void printHello(int numberOfTimes) {

        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Hello World");
        }
    }

    public static void age(int birthYear, int currentYear) {
        if (currentYear < birthYear) {
            System.out.println("invalid entry");
        } else {
            int age = currentYear - birthYear;
            System.out.println("you are " + age + " years old");
        }
    }
}
