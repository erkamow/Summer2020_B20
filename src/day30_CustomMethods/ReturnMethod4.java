package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethod4 {
    public static void main(String[] args) {
        int[] s1 = {1,2,3};
        int[] s2 = {4,5,6};

        int[] s3 = combine2Array(s1,s2);
        System.out.println(Arrays.toString(s3));
        System.out.println(s3[0]);
    }




    public static int[] combine2Array(int[] arr1,int[] arr2){
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
        return arr3;


    }
}
