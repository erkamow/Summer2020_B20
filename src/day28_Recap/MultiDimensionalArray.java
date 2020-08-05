package day28_Recap;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int[] arr1D = {1,2,3};

        int[][] arr2D = {  {1,2,3},{4,5,6,7,8},{9,10,11,12,13}   };
        //                    0    ,    1      ,       2

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(arr2D[1][4]);
        System.out.println("====================================================");

        for(int i = 0; i<= arr2D.length-1; i++){  // gets each 1D array from 2D array
            int[] each1DArray = arr2D[i];
            // System.out.println(Arrays.toString(each1DArray));
            for(int j = 0; j <= each1DArray.length-1; j++){ // gets each elements from 1D array
                int eachNum = each1DArray[j];
                if(eachNum % 2 == 0){
                    System.out.print(eachNum+" ");
                }

            }
        }
        System.out.println();
        System.out.println("===========================================================");

        for(int[] each1D : arr2D){
            for(int eachElement : each1D){
                if(eachElement % 2 !=0 ){
                    System.out.print(eachElement+ " ");
                }

            }
        }
        System.out.println();

    }
}
