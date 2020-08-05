package day19_ForLoop_Break_Continue;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String reversedStr = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversedStr += str.charAt(i);

        }
        System.out.println(reversedStr);
    }
}
