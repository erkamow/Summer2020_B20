package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClassesPractice1 {

    public static void main(String[] args) {

        Integer[] arr2 = {1,2,3,4};
        for(Integer each : arr2){
            System.out.print(each+" ");
        }
        System.out.println();

        Double[] arr3 = {1.0,2.0,3.0,4.0,5.0,6.0,7.0};
        for(Double each : arr3){
            System.out.print(each+ " ");
        }
        System.out.println();

        char[] arr5 = {65,67,68,69};
        System.out.println(Arrays.toString(arr5));

        char ch = 79;
        Character ch2 = 79;
        System.out.println(ch2);

        String[] nums1 = {"12.5","13.4","14.3","15.2"};
        double[] nums2 = new double[nums1.length];
        for(int i = 0; i <= nums1.length-1; i++){
         nums2[i] = Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));
    }
}
