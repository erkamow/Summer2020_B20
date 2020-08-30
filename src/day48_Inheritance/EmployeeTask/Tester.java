package day48_Inheritance.EmployeeTask;

public class Tester extends Employee {

    public Tester(double salary,String name, int ID,String jobTitle,char gender){
        setEmpInfo(salary, name, ID, jobTitle, gender);
    }
    public void findingBugs(){
        System.out.println("Testers test the application");
    }
}
