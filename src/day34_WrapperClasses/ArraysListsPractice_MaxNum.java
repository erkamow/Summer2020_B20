package day34_WrapperClasses;

import java.util.ArrayList;

public class ArraysListsPractice_MaxNum {
    public static void main(String[] args) {


        ArrayList<Integer> maxNum = new ArrayList<>();
        maxNum.add(10);
        maxNum.add(20);
        maxNum.add(30);
        maxNum.add(40);
        maxNum.add(50);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer each : maxNum){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
