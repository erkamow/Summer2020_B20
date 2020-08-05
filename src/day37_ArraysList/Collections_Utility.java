package day37_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,45,67,89,100,44,34));

        // max number
        Integer max = Collections.max(list);
        System.out.println(max);
        //min number
        Integer min = Collections.min(list);
        System.out.println(min);

        System.out.println("============================================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ramazan","Islem","Saim","Muhtar","Asiya","Muhtar"));
        //replaceAll
        Collections.replaceAll(names,"Muhtar","Erkam");
        System.out.println(names);


    }
}
