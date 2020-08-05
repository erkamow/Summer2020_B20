package day35_ArrayLists;

import java.util.ArrayList;

public class ReversedOrder {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(int i = 4; i >=0; i--){

            System.out.print(numbers.get(i)+ " ");
        }
    }
}
