package day49_Inheritance.ScrumTeamTask;

public class person {


    public String name;
    public int age;
    public char gender;

    private long ssn ;
    public long getSsn(){
        return ssn;
    }
    public void setSsn(long ssn){
        this.ssn = ssn;
    }


    public void setInfo(String name,int age,char gender){

        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public void walk(){
        System.out.println(name+" is walking ");
    }
    public void sleep(){
        System.out.println(name+" is sleeping ");
    }
    public void eat(){
        System.out.println(name+" is eating ");
    }


}
