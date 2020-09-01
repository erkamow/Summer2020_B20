package day49_Inheritance.ScrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam extends employee{


    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developers> developers = new ArrayList<>();

    public ScrumTeam(Tester[] testers,Developers[] developers){
        addTesters(testers);
        addDevelopers(developers);
    }


    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developers developer){
        developers.add(developer);
    }
    public void addDevelopers(Developers[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }
    public void removeTesters(int employeeID){
        testers.removeIf(p->p.ID == employeeID);
    }
    public void removeDevelopers(int employeeID){
        developers.removeIf(p->p.ID == employeeID);
    }
    public void removeTesterDeveloper(int testerID , int developerID){
        removeDevelopers(developerID);
        removeTesters(testerID);
    }
    public String toString(){
        return "================================"+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+ " point (Dev.Team * 8 Days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+ " point for current Sprint (No days Off)"+
                "================================";
    }




}
