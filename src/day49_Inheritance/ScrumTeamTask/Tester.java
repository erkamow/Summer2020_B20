package day49_Inheritance.ScrumTeamTask;

public class Tester extends employee{




    public Tester(String name,int age,char gender,double salary,int ID,String jobTitle){
        setInfo(name, age, gender,salary,ID,jobTitle);


    }
    public void smokeTest(){
        System.out.println(name+" check his/her smoke test every morning");
    }
    public void creatingTicket(){
        System.out.println(name+" creates ticket when there is bug");
    }


}
