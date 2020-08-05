package day25_AARecap;

import java.util.Arrays;

public class Combine2Arrays {

    public static void main(String[] args) {

        int arr1 [] = {1,2,3,4,5};
        //             0 1 2 3 4
        int arr2 [] = {6,7,8,9,10};
        //             0  1  2  3   4
        int arr3 [] = new int[arr1.length + arr2.length];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0; i<=arr1.length-1; i++){
            arr3[i]=arr1[i];
        }


        for (int i=0; i<=arr2.length-1; i++){
            arr3[i+(arr1.length)]= arr2[i];
        }


        System.out.println(Arrays.toString(arr3));

        int max = arr3[0];
        int min = arr3[0];

        for (int i =0; i<=arr3.length-1;i++){
            if (max < arr3[i]){ // arr3[1] < arr3[]
                max= arr3[i]; // max = arr3[2]
            }
            if (min > arr3[i]){
                min= arr3[i];
            }
        }
        System.out.println("Arr3 max is: " + max);
        System.out.println("Arr3 min is: " + min);
    }
}
