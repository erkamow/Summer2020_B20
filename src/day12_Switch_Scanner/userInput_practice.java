package day12_Switch_Scanner;

import java.util.Scanner;

public class userInput_practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
         double num =  scan.nextDouble();

         String result = (num %2 == 0) ? "Even" : "Odd";
        System.out.println(result);

    }
}
