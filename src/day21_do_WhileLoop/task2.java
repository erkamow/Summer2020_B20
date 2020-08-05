package day21_do_WhileLoop;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 999999999;

        for(int i = 1; i <= 5; i++){

            System.out.println("Enter 5 number");
            int num = scan.nextInt();

            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
