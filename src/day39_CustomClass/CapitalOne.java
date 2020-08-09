package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        employee emp1 = new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();
        employee emp4 = new employee();
        employee emp5 = new employee();
        employee emp6 = new employee();


        emp1.setEmployeeInfo("Roman", 'M', "123456789", "QA", 120000);
        emp2.setEmployeeInfo("Meerim", 'F', "124312325", "QA", 120000.50);
        emp3.setEmployeeInfo("Musa", 'M', "123456789", "SDET", 135000);
        emp4.setEmployeeInfo("Ramazan", 'M', "342151342", "SDET", 150000);
        emp5.setEmployeeInfo("Tetiana", 'F', "987654321", "SDET", 125000);
        emp6.setEmployeeInfo("Virgina", 'F', "456789125", "BA", 150000.70);


        ArrayList<employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6));


        double max = Integer.MIN_VALUE;
        String name = "";
        for (employee each : employeeList) {
            double eachSalary = each.salary;
            if (eachSalary > max) {
                max = eachSalary;
                name = each.name;
            }

        }


        System.out.println("Maximum Salary: " + max);
        System.out.println("Name: " + name);

        System.out.println("========================================");

        //  employeeList.removeIf( p -> p.salary < 150000 );

        for (employee each : employeeList) {
            // each.getEmployeeInfo();
            System.out.println(each.name + " : " + each.salary);

        }
    }
}
