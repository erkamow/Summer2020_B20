package day37_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r1 = list.contains(1); //true

        // list.containsAll(1,2,3,4);

        ArrayList<Integer> element = new ArrayList<>();
        element.add(1);
        element.add(2);
        element.add(3);

        boolean r2 = list.containsAll(element);

        System.out.println(r2);

        System.out.println("====================================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        Integer [] arr = {10,20,4};
        boolean r3 = list2.containsAll(Arrays.asList(arr));
        System.out.println(r3);
        System.out.println("===================================================");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(30,25,40,15,55,65,75,85,95));
        System.out.println(numbers);
        System.out.println("====================================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,4,5,5,6,7,8,8,9,10,11,12,13));
        nums.removeAll(Arrays.asList(1,2,5,10,11)); // remove all the 1
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);
        System.out.println("====================================================");

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,2,2,3,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,11,12,13,14));
        num1.retainAll(Arrays.asList(1,2,3,9));
        System.out.println(num1);









    }
}