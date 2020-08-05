package day20_whileLoops;

import java.util.Scanner;

public class Task3_WhileLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "erkamkubra0603";
        System.out.println("Enter your password");
        String input = scan.nextLine();

        while (!input.equals(password)) {
            System.out.println("please re-enter your password");
            input = scan.nextLine();
        }
        System.out.println("logged in");
    }



    }

