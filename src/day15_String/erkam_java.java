package day15_String;

import java.util.Scanner;

public class erkam_java {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your first name");
        String firstName = scan.next().toLowerCase();


        System.out.println("Enter your last name");
        String lastName = scan.next().toLowerCase();

        String fullName = firstName + " " + lastName;

        System.out.println("Your full name is: " + fullName);
    }
}
