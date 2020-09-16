package day54_Abstract.EmployeeTask;

import java.time.LocalDate;

public final class Tester extends Employee{ // can only be sub class

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name, gender, DOfB, jobTitle, salary);
    }
    public void findBug(){
        System.out.println(name+" found a bug");
    }
}
