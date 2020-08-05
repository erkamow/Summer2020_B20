package day30_CustomMethods;
import Library.customMethods;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {
        MaxNum(12,16);
        int[] arr = {23,45,67,89,0,21};
        Descending(arr);
        int[] a1 = {1,2,3,4};
        int[] a2 = {5,6,7};
        combine2Array(a1,a2);
        PosNegZero(24);
        System.out.println("======================================");
        int[] a3 = {-100,200,-10000,999,-4000,0,45};
        for(int each:a3){
            PosNegZero(each);
        }


    }
     // Task 1
    public static void MaxNum(int a,int b){
        if(a==b){
            System.out.println("equal");
            return;
        }
        if(a>=b){
            System.out.println(a+" is the max number");
        }else{
            System.out.println(b+" is the max number");
        }
    } // max num between 2 numbers
     // Task 2
    public static void Descending(int[]arr){  // {10,9,20,30,5,6,7};
        Arrays.sort(arr); // {5,6,7,9,10,20,30}

        for(int i = arr.length-1; i >=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // Task 3: {1,2,3} {4,5,6} ===> {1,2,3,4,5,6}
    public static void combine2Array(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;
        for(int each:arr1){
            arr3[i]=each;
            i++;
        }
        for(int each:arr2){
            arr3[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));

    }
    // Task 4:
    public static void PosNegZero(int num){

        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num < 0){

            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }

}
