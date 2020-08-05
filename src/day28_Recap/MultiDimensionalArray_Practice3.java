package day28_Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray_Practice3 {

    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5}};

        int[][][] arr3D ={  {{1,2,3},{4,5}}  , {{6,7,8},{9,10}}  };


        System.out.println(Arrays.deepToString(arr3D));
        // {{6,7,8} , {9,10}}

        System.out.println(Arrays.deepToString(arr3D[1]));

        // {4,5}
        System.out.println(Arrays.toString(arr3D[0][1]));

        // 7

        System.out.println(arr3D[1][0][1]);

        System.out.println("===========================================================");

        for(int i = 0; i <= arr3D.length-1; i++){
            int[][] each2D = arr3D[i];
            for(int j = 0; j <= each2D.length-1; j++){
                int[] each1D = each2D[j];
                for(int s = 0; s <= each1D.length-1; s++){
                    int eachElements = each1D[s];
                    System.out.print(eachElements+ " ");
                }

            }
            System.out.println();
        }
        System.out.println("=============================================================");
        for(int[][] each2D : arr3D){
            for(int[] each1D : each2D){
                for(int eachElements : each1D){
                    if(eachElements % 2 !=0){
                        continue;

                    }
                    System.out.print(eachElements+" ");

                }
            }
            System.out.println();
        }
    }
}
