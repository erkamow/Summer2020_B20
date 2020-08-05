package day16_String;

import java.util.Scanner;

public class warmup_Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = scan.next().substring(1);

        System.out.println(" Enter your second word");
        String word2 = scan.next().substring(1);

        System.out.println(" Your words are: " + word1 + " " + word2);
    }
}
