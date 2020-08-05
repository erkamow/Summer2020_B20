package day17_Review;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();





        boolean w1 = word1.endsWith(""+word2.charAt(0));
        boolean w2 = word2.startsWith(""+word1.charAt(word1.length()-1));

        if (w1&&w2){
            System.out.println(word1.substring(0,word1.length()-1)+word2);
        }else {
            System.out.println("invalid");
        }
    }
}
