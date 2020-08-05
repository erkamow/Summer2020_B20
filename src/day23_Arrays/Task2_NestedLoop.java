package day23_Arrays;

import java.util.Scanner;

public class Task2_NestedLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcome to cybertek inn");

        while (true) {


            System.out.println("please choose from the follwing: ");
            System.out.println("1. king bed: $120");
            System.out.println("2. queen bed: $100");
            System.out.println("3. single bed: $50");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 50;
                    break;
            }
            System.out.println("do you want to reserve another room");
            String a = scan.next().toLowerCase();
            while ( !(a.equals("yes")||a.equals("no")) ){
                System.out.println("please re-enter");
                System.out.println("do you want to reserve another room?");
                a=scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }
        }
        System.out.println("your total is: "+total);
    }
}
