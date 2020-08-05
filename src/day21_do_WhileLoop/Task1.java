package day21_do_WhileLoop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;


        for(int i = 1; i <= 5; i++){

            System.out.println("Enter 5 numbers");
            int num1 = scan.nextInt();

            if(num1 > max){
                max = num1;
            }

        }
        System.out.println(max);
    }
}
