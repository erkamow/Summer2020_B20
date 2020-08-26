package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class shoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Apple",1.30,5);
        Item item2 = new Item("Coke",0.50,36);
        Item item3 = new Item("Water",0.25,50);
        Item item4 = new Item("Pizza",7.99,3);

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4));

        for(Item each : shoppingList){
            System.out.println("===========================");
            System.out.println(each);
        }
    }
}
