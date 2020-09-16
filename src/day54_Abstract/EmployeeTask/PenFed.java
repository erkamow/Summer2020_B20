package day54_Abstract.EmployeeTask;

import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Erkam Afsin",'M',
                LocalDate.of(1994,03,25),"QA",145000);
        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);
        System.out.println(tester1);


        tester1.findBug();

        System.out.println("=================================================");


        Developer dev1 = new Developer("Kubra Afsin",'F',
                LocalDate.of(1996,12,06),"Test Lead",150000);
        System.out.println(dev1.gender);
        System.out.println(dev1.DOfB);
        System.out.println(dev1);

        dev1.fixBug();
    }
}
