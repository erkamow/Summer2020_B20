package day27_Recap;

import day23_Arrays.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {

    public static void main(String[] args) {

        String names[] = {"erkam","ammar","zafer",};
        System.out.println(Arrays.toString(names));
        System.out.println(names[1]);
        System.out.println(names[0]);
        System.out.println(names[2]);

        System.out.println("================================");

        for(int i = 0; i <= names.length-1; i++){
            if(names[i].toLowerCase().startsWith("a")){
                continue;
            }
            System.out.println(names[i]);
        }
        System.out.println("============================================================");

        int[] numbers = new int[5];

        System.out.println(numbers);
        numbers[3]= 25;
        numbers[0]= 100;
        numbers[3]= 300;
        System.out.println(Arrays.toString(numbers));
        System.out.println("============================================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("how many names do you want to enter");

        String[] students = new String[scan.nextInt()];

        scan.nextLine();

        for(int i = 0; i <= students.length-1; i++){
            System.out.println("Enter a name");
            students[i] = scan.nextLine();

        }



        System.out.println(Arrays.toString(students));



    }
}
