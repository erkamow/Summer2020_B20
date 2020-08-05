package day26_multiDimensioanlArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multiDimensionalArray {


    public static void main(String[] args) {

        char[] ch1 = {'A','B'};
        char[] ch2 = {'C','D','E'};
        char[] ch3 = {'F','G','H'};

         //               0 , 1     0 , 1 , 2     0 , 1 , 2
        char[][] ch2D ={{'A','B'},{'C','D','E'},{'F','G','H'}};
        //                  0    ,      1      ,      2

        System.out.println(Arrays.toString(ch2D[1]));

        System.out.println(Arrays.toString(ch2D[2]));

        // H
        System.out.println((ch2D[2][2]));
        // C
        System.out.println(ch2D[1][0]);
        // G B
        System.out.println(ch2D[2][1]+" "+ ch2D[0][1]);

        System.out.println("=========================================================");

        int [][] numsD = {{1,2,3},{4},{5,6},{7,8,9,10}};

        //     [7,8,9,10]
        System.out.println(Arrays.toString(numsD[3]));
        // [5,6]
        System.out.println(Arrays.toString(numsD[2]));

        for(int i = 0; i <= numsD.length-1; i++){
            System.out.println(Arrays.toString(numsD[i]));
        }


        for(int[] each : numsD){
            System.out.println(Arrays.toString(each));
        }
        // Arrays.deepToString =====> used for only multi dimensional array to convert to string...

        System.out.println(Arrays.deepToString(numsD));








    }


}
