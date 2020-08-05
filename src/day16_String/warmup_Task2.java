package day16_String;

import java.util.Scanner;

public class warmup_Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word ");
        String word = scan.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        String result = "";
        if(firstChar == lastChar){
            result = "true";
        }else{
            result = "false";
        }
        System.out.println(result);


    }
}
