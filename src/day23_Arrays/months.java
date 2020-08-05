package day23_Arrays;

import java.util.Scanner;

public class months {

    public static void main(String[] args) {

        String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number between 1-12");
        int number = scan.nextInt();
        System.out.println(months[number-1]);

    }
}
