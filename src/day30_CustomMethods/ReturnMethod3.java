package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethod3 {

    public static void main(String[] args) {

        int[] arr = {100,200,50,40,60};
        int num = max(arr);
        System.out.println(num);
        System.out.println(num > 300);
        int[] arr2 = {1,2,3,4,5};
        max2(arr2);

    }


    public static int max(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
    public static void max2(int[] arr2){
        Arrays.sort(arr2);
        int max = arr2[arr2.length-1];
        System.out.println(max);
    }
}
