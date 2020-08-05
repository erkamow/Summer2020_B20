package day23_Arrays;

import java.util.Scanner;

public class Task1_NesteedLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.println("Enter two numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            System.out.println("Enter math operator");
            char o = scan.next().charAt(0);

            double result = (o=='+')? num1+num2 : (o=='-')? num1-num2 : (o=='*')? num1*num2 :(o=='/')? num1/num2
                    :(o=='%')? num1%num2 :0;

            System.out.println(result);

            System.out.println("Do you want to continue");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes") || a.equals("no"))){
                System.out.println("invalid answer , please enter yes or no");
                System.out.println("do you want to continue");
                 a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }
        }
        System.out.println("thanks for using cybertek calculator");
    }
}
