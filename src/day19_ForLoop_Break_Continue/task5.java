package day19_ForLoop_Break_Continue;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int sum = 0;

        if(num > 1){
            for(int i = 1; i <= num; i++){
                sum += i;
            }
            System.out.println(sum);

        }else{
            System.out.println("invalid entry");
        }
    }
}
