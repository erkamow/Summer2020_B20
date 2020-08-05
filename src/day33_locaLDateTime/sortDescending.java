package day33_locaLDateTime;

import java.util.Arrays;

public class sortDescending {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[5];

        arr2[0] = arr[arr.length - 1];
        arr2[1] = arr[3];
        arr2[2] = arr[2];
        arr2[3] = arr[1];
        arr2[4] = arr[0];
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("=================================================");
        int[] scores = {100,75,85,95,65,55};
        scores = sortDesc(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("=================================================");
        double[] scores2 = {1.2,45.6,10.0,21.7,30.5,6.9};
        scores2 = sortDesc(scores2);
        System.out.println(Arrays.toString(scores2));

    }


    public static int[] sortDesc(int[] arr) {
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;


    }
    public static double[]sortDesc(double[] arr){
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;

    }
}

