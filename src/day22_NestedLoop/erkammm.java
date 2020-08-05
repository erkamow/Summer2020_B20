package day22_NestedLoop;

import java.util.Scanner;

public class erkammm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);


        if((ch1=='x'|| ch1=='X') && (ch2=='x' || ch2=='X')) {
            System.out.println(word.substring(1, word.length() - 1));

        }else if((ch1=='x'|| ch1=='X')){
            System.out.println(word.substring(1));

        }else if((ch2=='x' || ch2=='X')){
            System.out.println(word.substring(0,word.length()-1));

        }else{
            System.out.println("no x");

        }
    }
}
