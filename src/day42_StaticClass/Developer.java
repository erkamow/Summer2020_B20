package day42_StaticClass;

public class Developer {
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setDevInfo(String name,long employeeID,String jobTitle,double salary,char gender){

        this.name = name;
        this.gender = gender;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;



    }
    public void coding(){
        System.out.println(name+" is coding ");
    }
    public void fixBug(){
        System.out.println(name+" fixing bug ");
    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Employee ID: "+employeeID+", job title: "+jobTitle+", salary: "+salary;

    }
}
