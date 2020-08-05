package day36_ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(25);
        list.add(35);

        Collections.sort(list);

        System.out.println(list);

        System.out.println("Max number: "+list.get(list.size()-1));
        System.out.println("Min number: "+list.get(0));

        System.out.println("===================================================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        System.out.println(list1);

        Collections.swap(list1,1,2);
        System.out.println(list1);

        Collections.swap(list1,0,list1.size()-1);
        System.out.println(list1);

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('A');
        list2.add('A');
        list2.add('A');
        list2.add('C');

        int count = Collections.frequency(list2,'B');
        System.out.println(count);


    }
}
