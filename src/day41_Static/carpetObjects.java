package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        Carpet carpet3 = new Carpet();
        Carpet carpet4 = new Carpet();


        carpet1.customOrder(12,15,13,true);
        carpet2.customOrder(9,13,8,false);
        carpet3.customOrder(5,8,7,false);
        carpet4.customOrder(8,10,10,true);


        ArrayList<Carpet> carpetsList = new ArrayList<>();
        carpetsList.addAll(Arrays.asList(carpet1,carpet2,carpet3,carpet4));
        // carpetsList.removeIf(p -> p.isPersian);
        //carpetsList.removeIf(p -> !p.isPersian);


        for(Carpet eacCarpet : carpetsList){
            eacCarpet.getCarpetInfo();
        }



    }
}
