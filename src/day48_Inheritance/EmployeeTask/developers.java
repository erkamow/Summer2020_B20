package day48_Inheritance.EmployeeTask;

public class developers extends Employee {

    public developers(String name,int ID,String jobTitle,char gender){
        setEmpInfo(name, ID, jobTitle, gender);
    }

    public void fixingBugs(){
        System.out.println("Developers Fix bugs");
    }
}
