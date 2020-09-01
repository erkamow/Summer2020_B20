package day49_Inheritance.ScrumTeamTask;

public class employee  extends person{

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name,int age,char gender,double salary,int ID,String jobTitle){
        setInfo(name,age,gender);
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
    }
    public void work(){
        System.out.println(name + " is working");
    }
    public String toString(){
        return "\nName: "+name+"\nAge: "+age+"\nGender: "+gender+
                "\nSalary: $"+salary+"\nID num: "+ID+"\nJob title: "+jobTitle+"\nSSN: "+getSsn()
                + "\n===================================================";
    }
}
