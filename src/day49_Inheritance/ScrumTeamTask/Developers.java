package day49_Inheritance.ScrumTeamTask;

public class Developers extends employee {


    public Developers(String name, int age, char gender, double salary, int ID, String jobTitle) {
  setInfo(name, age, gender, salary, ID, jobTitle);

    }
    public void fixBugs(){
        System.out.println(name+" is fixing bugs and defects");
    }
    public void coding(){
        System.out.println(name+" is writing codes");
    }


}
