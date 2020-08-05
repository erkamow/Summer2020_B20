package day36_ArraysList;

import java.util.ArrayList;

public class MultipleOddNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 20; i++){
            list.add(i);
        }
        System.out.println(list);


        for(int i = 0; i <= list.size()-1; i++){
            Integer each = list.get(i);
            if(each % 2 !=0){
                list.set(i,each*2);
            }else{
                list.set(i,each*3);
            }
        }
        System.out.println(list);


    }
}
