package day47_Encapsulation;

public class CapitalOneEmployee {

    String employeeName;
    int employeeAge;
    String jobTitle;
    public static String CompanyName;
    static {
        CompanyName = "capitalOne";
    }

    public CapitalOneEmployee (String employeeName,int employeeAge,String jobTitle){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jobTitle = jobTitle;
    }

    private long ID = 19941996;
    public long getID() {
        return ID;
    }
    public void setID(long ID) {
        this.ID = ID;
    }

    private double salary = 145000;
    public double getSalary (){
        return salary;
    }
    public void setSalary(double salary){this.salary = salary;}

    private String Adress = "1209 summerbrook Dr. Atlanta / GA";
    public String getAdress (){
        return Adress;
    }
    public void setAdress (String Adress){
        this.Adress = Adress;
    }

    public String toString(){
        return "Employee Name: "+employeeName+"\nEmployee Age: "+employeeAge+"\nJob Title: "+jobTitle+"\nCompany Name: "+CompanyName;
    }

}
