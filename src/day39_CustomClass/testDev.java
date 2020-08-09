package day39_CustomClass;

public class testDev {

    String name;
    char gender;
    int ssn;
    int idNum;
    String title;
    double salary;
    String company;

    public void setInfo(String employeeName,char employeeGender, int SSNnum,int numID,String jobTitle,double Salary,
                        String companyName){
        name = employeeName;
        gender = employeeGender;
        ssn = SSNnum;
        idNum =numID;
        title = jobTitle;
        salary =Salary;
        company = companyName;

    }
    public void getInfo(){
        System.out.println(name+", "+gender+", "+ssn+", "+idNum+", "+title+", "+salary+"$"+", "+company);
    }
}
