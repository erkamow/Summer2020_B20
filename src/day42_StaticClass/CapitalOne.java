package day42_StaticClass;

public class CapitalOne {
    public static void main(String[] args) {

        Tester[] testers = {new Tester(),new Tester(),new Tester()};
        testers[0].setTestInfo("Bedirhan",12345678,"Tester",123000,'M');
        testers[1].setTestInfo("Cengiz",87654321,"Tester",117000,'M');
        testers[2].setTestInfo("Merve",12332145,"Tester",135000,'F');

        Developer[] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setDevInfo("Irfan",34567898,"Developer",100000,'M');
        developers[1].setDevInfo("Mustafa",12567809,"Developer",132000,'M');
        developers[2].setDevInfo("Selda",43231254,"Developer",1450000,'F');
        developers[3].setDevInfo("Esra",23764567,"Developer",129000,'F');
        developers[4].setDevInfo("Halis",12323456,"Developers",156000,'M');

        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("M.Erkam Afsin","A.Ammar Afsin","Kubra Afsin");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);

        System.out.println("========================================================");

        for(Tester each: team1.testers){ // each tester in the scrum team
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("========================================================================");

        for(Developer eachDev: team1.developers){
            System.out.println(eachDev.name+" : $"+eachDev.salary);
        }
    }
}
