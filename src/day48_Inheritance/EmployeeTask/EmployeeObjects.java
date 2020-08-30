package day48_Inheritance.EmployeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Erkam",123456,"SDET",'M');
        tester1.findingBugs();
        System.out.println(tester1);

        System.out.println("==========================================");

        developers dev1 = new developers("Kubra",654321,"Dev Lead",'F');
        dev1.fixingBugs();
        System.out.println(dev1);
    }


}
