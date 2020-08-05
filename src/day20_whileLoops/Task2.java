package day20_whileLoops;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();


        int result = 1;

        for(int i = n; i >= 1; i -= 1){
            result *= i;

        }
        System.out.println(result);


    }
}
