package day48_Inheritance.EmployeeTask;

public class developers extends Employee {

    public developers(double salary,String name,int age,String jobTitle,char gender){
        setEmpInfo(salary, name, age, jobTitle, gender);
    }

    public void fixingBugs(){
        System.out.println("Developers Fix bugs");
    }
}
