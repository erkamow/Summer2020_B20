package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResource.*; // imports all statics from HumanResource

public class BankOfAzerbaijan {

    public static void main(String[] args) {

        ArrayList<employee> list = new ArrayList<>();
        /*
        list.add(HumanResource.employee1);
        list.add(HumanResource.employee3);
        list.add(HumanResource.employee5);

         */

        list.addAll(Arrays.asList(HumanResource.employee1,HumanResource.employee2,HumanResource.employee3));

        System.out.println(list.get(1));

        System.out.println("Total number of employees: "+list.size());

        System.out.println("====================================================================");

        for(employee each:list){
            System.out.println(each.name+" : "+each.salary);
        }
    }
}
