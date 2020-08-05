package day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_Methods {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("bmw","mercedes","infinity","tesla","WV","lamborghini","lexus","mercedes"));

        //cars.remove(3);
        //cars.remove("tesla");
        //cars.removeAll(Arrays.asList("tesla","bmw"));
        //cars.removeIf(p-> p.toLowerCase().contains("m"));
        //cars.retainAll(Arrays.asList("mercedes"));
        System.out.println(cars);

        System.out.println("=====================================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Paper Towels","Toilet Paper","Mango","Orange","Avocado"));

        //pepsi
        boolean r1 = groceryList.contains("pepsi");
        System.out.println(r1);

        // eggs , milk ,orange
        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs","Orange","Milk","Water"));
        System.out.println(r2);

        System.out.println("total number of size: "+ groceryList.size());

        // set te dragon fruit to apple

        groceryList.set(groceryList.size()-1, "apple");
        groceryList.set(groceryList.indexOf("Paper Towels"),"Dish Washer");
        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);

    }
}
