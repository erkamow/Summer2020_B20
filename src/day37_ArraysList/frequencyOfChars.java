package day37_ArraysList;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class frequencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBC";
        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(str.split("")));

        String nonDup = Util.removeDup(str);
        for(String each : nonDup.split("")){
            int count = Collections.frequency(list,each);
            System.out.print(""+each+count+" ");
        }
    }
}
