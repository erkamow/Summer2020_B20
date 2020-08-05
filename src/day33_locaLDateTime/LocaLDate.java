package day33_locaLDateTime;

import java.util.Scanner;

public class LocaLDate {

    public static void main(String[] args) {


        java.time.LocalDate DOB = java.time.LocalDate.of(1994,3,25);
        System.out.println(DOB);

        java.time.LocalDate today = java.time.LocalDate.now();
        System.out.println(today);

        java.time.LocalDate y = java.time.LocalDate.of(2019,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();

        boolean result2 = java.time.LocalDate.of(year,1,1).isLeapYear();

        System.out.println(result2);
        System.out.println("=================================================");
        System.out.println("Enter birth year, birth month,birth day");

        java.time.LocalDate d = java.time.LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());
        System.out.println(d);
        System.out.println(d.isLeapYear());

    }
}
