package day54_Abstract.EmployeeTask;

import java.time.LocalDate;

public final class Developer extends Employee{

    public Developer(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name, gender, DOfB, jobTitle, salary);
    }

    public void fixBug(){
        System.out.println(name+" fixing bug");
    }
}
