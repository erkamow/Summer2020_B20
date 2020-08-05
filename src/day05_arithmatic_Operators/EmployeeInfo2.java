package day05_arithmatic_Operators;

public class EmployeeInfo2 {
    public static void main(String[] args) {


        String firstName = "John";
        String lastName = "Daniel";
        char Gender  = 'M';
        int age = 35;
        String CompanyName = "CapitalOne";
        String JobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;
        String fullName = firstName+ " " + lastName;

        System.out.println(fullName + " First name is: " + firstName );
        System.out.println(fullName + " lastName is: " + lastName );
        System.out.println(fullName + " Gender is: " + Gender );
        System.out.println(fullName + " Age is:" + age );
        System.out.println(fullName + " Company Name is: " + CompanyName );
        System.out.println(fullName + " Job Title is: " + JobTitle );
        System.out.println(fullName + " is fulltime: " + isFullTime );
        System.out.println(fullName + " is married: " + isMarried );
        System.out.println(fullName + " Salary is: " + salary);


    }
}
