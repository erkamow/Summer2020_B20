package day35_ArrayLists;

import java.util.ArrayList;

public class ArraysListMethods {
    public static void main(String[] args) {

        ArrayList<String> goodStudents = new ArrayList<>();

        goodStudents.add("Erkam");
        goodStudents.add("Kubra");
        goodStudents.add("Ammar");
        goodStudents.add("Zafer");
        goodStudents.add("Ugur");

        goodStudents.set(3,"Mehmet");
        System.out.println(goodStudents);

        goodStudents.clear();
        System.out.println(goodStudents);
        System.out.println(goodStudents.size());

        System.out.println("=======================================================");

        // remove ( int index )
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // 0
        list.add(2); // 1
        list.add(3); // 2
        list.add(4); // 3
        list.add(5); // 4

        list.remove(2);
        list.remove(3);

        System.out.println(list);
        System.out.println(list.size());

        System.out.println("========================================================");

        //remove(Element)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1); // 0
        list2.add(2); // 1
        list2.add(3); // 2
        list2.add(4); // 3
        list2.add(5); // 4

        Integer a = 1;

        list2.remove(a);
        System.out.println(list2);

        System.out.println("==========================================================");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("erkam"); // 0
        list3.add("ammar"); // 1
        list3.add("zafer"); // 2
        list3.add("kubra"); // 3
        list3.add("mehmet"); // 4

        list3.remove("mehmet");

        System.out.println(list3);





    }
}
