package day34_WrapperClasses;

import java.util.ArrayList;

public class ArraysLists_Intro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
                  scores.add(95); // autoboxing
                  scores.add(100);
                  scores.add(75);
                  scores.add(85);
                  scores.add(1,65);

        System.out.println(scores);
        //100
        System.out.println(scores.get(2));


    }
}
