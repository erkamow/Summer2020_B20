package day16_String;

import java.util.Scanner;

public class erkam1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        char thirth = txt.charAt(3);
        char fifth = txt.charAt(5);
        char sixth = txt.charAt(6);

        System.out.print(thirth);
        System.out.print(fifth);
        System.out.print(sixth);
    }
}
