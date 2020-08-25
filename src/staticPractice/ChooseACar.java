package staticPractice;

import day23_Arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import static staticPractice.availableCars.*;

public class ChooseACar {
    public static void main(String[] args) {


        ArrayList<mercedesBenz> list = new ArrayList<>();
        list.addAll(Arrays.asList(car1,car2,car3,car4));
        System.out.println(list.get(1));
        System.out.println();
        System.out.println(list.get(2));
        System.out.println();
        System.out.println(list.get(0));
        System.out.println("======================");

        for(mercedesBenz each : list){
            System.out.println(each);
            System.out.println("=======================================================");
        }

    }
}
