package day13_Scanner;

import java.util.Scanner;

public class Scanner_nextLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your full name: ");
        String FullName = scan.nextLine();



        System.out.println(" Enter your company name: ");
        String companyName = scan.nextLine();


        System.out.println("your full name is: " + FullName);
        System.out.println("your company name is: " + companyName);
    }
}
