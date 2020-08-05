package day24_Arrays;

import java.util.Arrays;

public class Arrays_Utility {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        System.out.println( Arrays.toString(arr) );

        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"erkam","kubra","ammar",};

        System.out.println(names); // in order to print array variable we MUST convert it to string

        System.out.println(Arrays.toString(names));

        System.out.println("============================================================");

        int nums[] = {5,4,6,5,4,3,10};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums); // [3,4,4,5,5,6,10]

        System.out.println(Arrays.toString(nums));

        System.out.println("maximum number: "+nums[nums.length-1]);
        System.out.println("minimum number: "+nums[0]);

        String students[] = {"mehdi","elkem","meee","trump"};

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("=================================================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean b1 = Arrays.equals(arr1,arr2);

        System.out.println(b1);

        int[] arr3 ={2,1,3};

        Arrays.sort(arr2);
        Arrays.sort(arr3);

        boolean b2 = Arrays.equals(arr2,arr3);
        System.out.println(b2);

        int[] arr4 = {1,1,2,3}; // lengths are always should be the same
        int[] arr5 = {1,2,3};
        boolean b3 = Arrays.equals(arr4,arr5);

        System.out.println(b3);

    }
}
