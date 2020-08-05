package day24_Arrays;

import java.util.Scanner;

public class Arrays_minAndMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers do you want to to enter");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i <= n-1; i++){ // get user input and storing them in the array
            System.out.println("enter a number");
            int num = scan.nextInt();
            arr[i] = num;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] > max){
                max=arr[i];
            }

            if(arr[i] < min){
                min = arr[0];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
