package day25_AARecap;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int arr1[] = {10,11,8,9,12,5,15};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        for(int i = arr1.length-1; i >=0; i--){
            System.out.print(arr1[i] + " ");
        }

    }
}
