package day38_Recap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collection_utilities {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R', 'S', 'O', 'P', 'D', 'A', 'C', 'B'));
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Erkam", "Ammar", "Kubra", "Zafer", "Akif"));
        students.set(students.size() - 1, "ugur");
        Collections.swap(students, 3, 4);

        System.out.println(students);

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("coffe", "coffe", "egg", "battery", "battery", "battery"));
        int count = Collections.frequency(items, "coffe");
        System.out.println(count);

        ArrayList<String> unigue = new ArrayList<>();
        for (String each : items) {
            int i = Collections.frequency(items, each);
            if (i == 1) {
                unigue.add(each);
            }

        }
        System.out.println(unigue);

        System.out.println("=========================================================");
        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p -> Collections.frequency(unique2,p)>1);
        System.out.println(unique2);


        System.out.println("==================================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,1000,600,3000,1000,1000,500,450,400));
        Collections.replaceAll(numbers,1000,333);
        System.out.println(numbers);



    }
}

