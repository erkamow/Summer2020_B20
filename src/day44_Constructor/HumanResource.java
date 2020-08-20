package day44_Constructor;

/*
2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees

 */

public class HumanResource {

    static employee employee1;
    static employee employee2;
    static employee employee3;
    static employee employee4;
    static employee employee5;

    static {
        employee1 = new employee();
        employee2 = new employee();
        employee3 = new employee();
        employee4 = new employee();
        employee5 = new employee();

        employee1.setInfo("Erkam",123321456,45687,"SDET",130000,'M');
        employee2.setInfo("Kubra",12345678,32145,"QA",150000,'F');
        employee3.setInfo("Ammar",12345632,87654,"Test lead",160000,'M');
        employee4.setInfo("zafer",1234589,456098,"Tester",110000,'M');
        employee5.setInfo("ugur",316784223,321098,"PO",145000,'M');




    }


}
