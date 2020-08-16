package day42_StaticClass;

public class Tester {

    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTestInfo(String name,long employeeID,String jobTitle,double salary,char gender){

        this.name = name;
        this.gender = gender;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;



    }
    public void smokeTesting(){
        System.out.println(name+" smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Employee ID: "+employeeID+", job title: "+jobTitle+", salary: "+salary;

    }
}
