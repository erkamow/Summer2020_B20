package day27_Recap;

import java.util.Arrays;

public class Arrays_Utility {

    public static void main(String[] args) {

        String[] names = {"Odina","Liliia","Berk","Emine"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] nums = {85,75,65,110,90,45,56,78};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("maximum: "+nums[nums.length-1]);
        System.out.println("Minimum: "+nums[0]);

        System.out.println("===================================================");

        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","B","C"};

        System.out.println(Arrays.equals(s1,s2)); // true

        String[] s3 = {"C","B","A"};

        System.out.println(Arrays.equals(s1,s3)); // false


        String[] a1 = {"A","C","B"};
        String[] a2 = {"B","A","C"};

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1,a2));


        String[] Names = {"Erkam","Kubra"};

        System.out.println(Arrays.toString(Names));

        String b1 = Arrays.toString(Names);
        System.out.println(b1);


    }
}
