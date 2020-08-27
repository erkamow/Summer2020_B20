package day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Erkam AFSIN","SDET",14535454,120000);
        Employee emp2 = new Employee("Kubra AFSIN","QA engineer",1234563,135000);
        Employee emp3 = new Employee("Ammar AFSIN","Test Lead",3216544,140000);

        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(emp1,emp2,emp3));
        

        for(Employee each : empList){
            System.out.println("==========================================");
            System.out.println(each);
        }
    }
}
