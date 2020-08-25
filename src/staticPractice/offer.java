package staticPractice;

public class offer {
    /*
    Create a class called Offer that has:
               fields :
                    location, company, salary , isFullTime
                create a constructor that can initialize all the fields

            toString -- print all info about offers
        create a class called MyOffers
            Create 5 offer objects
                1. use for loop to print out the info of each offer
                2. write a program that can only retain the offers if:
                        1. the offer is for fulltime position
                        2. offer is from your local area
                        3. salary is greater than 100K

     */

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public offer (String location,String company,double salary,boolean isFullTime){

        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;




    }

    public String toString(){
        return "Location: "+location+"\nCompany: "+company+"\nSalary: "+salary+"\nisFullTime: "+isFullTime;


    }
}
