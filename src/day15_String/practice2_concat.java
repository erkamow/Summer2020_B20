package day15_String;

import java.util.Scanner;

public class practice2_concat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

       String fullName = firstName.concat(" ".concat(lastName));
        System.out.println("your full name is: ".concat(fullName));
    }
}
