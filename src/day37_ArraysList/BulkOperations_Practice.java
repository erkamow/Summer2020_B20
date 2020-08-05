package day37_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Wagar");
        students.add("beslan");
        students.add("dawud");
        students.add("Ramazan");
        students.add("mehary");

        boolean r1 = students.containsAll(Arrays.asList("ulku","busra"));
        System.out.println(r1);

        System.out.println("======================================================");

        ArrayList<String> group1 = new ArrayList<>();
        group1.addAll(Arrays.asList("Erkam","Kubra","Ammar","Zafer","Ugur"));
        boolean e1 = group1.containsAll(Arrays.asList("Kubra","Ammar"));
        System.out.println(e1);

        System.out.println("=========================================================");

        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.addAll( Arrays.asList("Ahmed","Muhtar","Ahmed","Virgina","Beslan","Ibrahim","Ahmed"));
       // employeeNames.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employeeNames);
        employeeNames.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employeeNames);


    }
}
