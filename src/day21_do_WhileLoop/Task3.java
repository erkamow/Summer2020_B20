package day21_do_WhileLoop;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 999999999;
        int max = -999999999;

        for(int i = 1; i <= 5; i++){

            System.out.println("Enter 5 numbers");
            int num = scan.nextInt();

            if(num < min){
                min = num;
            }
            if(num > max);
            max = num;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
