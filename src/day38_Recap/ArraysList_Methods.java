package day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_Methods {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("bmw","mercedes","infinity","tesla","WV","lamborghini","lexus"));

        cars.remove(3);
    }
}
