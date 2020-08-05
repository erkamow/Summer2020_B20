package day17_Review;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();

        char w1 = word.charAt(0);

        char w2 = word.charAt(1);
        char x = 'x';

        boolean result = w1 == x && w2 !=x;
        boolean result2 = w2 == x && w1 !=x;
        boolean result3 =  w1 == x && w2 == x;

        if(result){
            System.out.println(word.substring(1));
        }else if(result2){
            System.out.println(word.substring(0,1) + word.substring(2));
        }else if(result3){
            System.out.println(word.substring(2));
        }else{
            System.out.println("no x");
        }





    }
}
