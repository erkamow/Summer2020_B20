package day15_String;

import java.util.Scanner;



public class warmup_tasks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence ");
        String sentence = scan.next();

        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length() -1 ));



    }
}
