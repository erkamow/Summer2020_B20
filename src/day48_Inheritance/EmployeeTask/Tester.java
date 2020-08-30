package day48_Inheritance.EmployeeTask;

public class Tester extends Employee {

    public Tester(String name, int ID,String jobTitle,char gender){
        setEmpInfo( name, ID, jobTitle, gender);
    }
    public void findingBugs(){
        System.out.println("Testers test the application");
    }
}
