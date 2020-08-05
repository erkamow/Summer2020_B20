package day36_ArraysList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer element : list) {

            int count = 0;
            for (Integer each : list) {
                if (each == element) {
                    count++;
                }

            }
            if (count == 1) {
                uniques.add(element);

            }

        }
        System.out.println(uniques);



    }
}

