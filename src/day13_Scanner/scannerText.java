package day13_Scanner;

import java.util.Scanner;

public class scannerText {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Your first name: ");
        String FirstName = scan.next();
        System.out.println(" Enter your last name: ");
        String LastName = scan.next();


        String FullName = FirstName + " " + LastName;

        System.out.println(" Your full name is: " + FullName);

    }
}
