package day48_Inheritance.EmployeeTask;

public class Employee {



    public String name;
    public int ID;
    public String jobTitle;
    public char gender;

    public static String companyName;
    static {
        companyName = "PNC Bank";
    }

    private double salary = 135000;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setEmpInfo ( String name, int ID, String jobTitle, char gender){

        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.gender = gender;


    }
    public String toString(){
        return "Salary $"+ getSalary()+ "\nname: "+name+"\nID :"+ID+"\njob Title: "+jobTitle+"\nGender: "
                +gender+"\ncompany name: "+companyName;
    }
}
