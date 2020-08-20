package day44_Constructor;

import day44_Constructor.employee;

public class employeeObjects {
    public static void main(String[] args) {


        employee emp1 = new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();

        emp1.setInfo("Erkam",123321456,45687,"SDET",130000,'M');
        System.out.println(emp1);
        emp2.setInfo("Kubra",12345678,32145,"QA",150000,'F');
        System.out.println(emp2);
        emp3.setInfo("Ammar",12345632,87654,"Test lead",160000,'M');
        System.out.println(emp3);


    }
}

