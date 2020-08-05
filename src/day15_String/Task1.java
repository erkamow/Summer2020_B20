package day15_String;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        String FullAdress = "Georgia Atlanta";
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your State ");
        String state = scan.next();
        System.out.println(" Enter your City ");
        String city = scan.next();
        char firstChar = state.charAt(0);
        char lastChar = city.charAt(6);
        System.out.println("first and last digit are: "+ firstChar+lastChar);
        int l = FullAdress.length();
        System.out.println(l);



    }
}
