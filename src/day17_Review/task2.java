package day17_Review;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();

        if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println("invalid entry");
        }




    }
}
