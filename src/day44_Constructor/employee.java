package day44_Constructor;

/*1. Create a class called Employee
        instance variables:
        name, id, ssn, jobTitle, salary, gender
        actions:
        setEmployeeInfo(): can initialize all the instance variables
        toString(): can return the info of the employee as string

*/

public class employee {

    String name;
    long ID;
    double ssn;
    String jobTitle;
    double salary;
    char gender;

   static boolean isEmployed ;
   static boolean hasSalary ;

   static {   // always runs first, only one time.
       isEmployed = true;
       hasSalary = true;
   }


    public void setInfo(String name,long ID,double ssn,String jobTitle,double salary,char gender){

        this.name = name;
        this.ID = ID;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;



    }
    public String toString(){
        return "Name: "+name+", ID: "+ID+", ssn: "+ssn+", jobTitle: "+jobTitle+", salary: "+salary+", gender: "+gender;
    }



}
