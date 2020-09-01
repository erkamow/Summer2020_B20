package day49_Inheritance.ScrumTeamTask;

import day42_StaticClass.Developer;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleIncObjects {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Erkam AFSIN",26,'M',135000,945494,"SDET");
        tester1.setSsn(123456);
        Tester tester2 = new Tester("Kubra AFSIN",23,'F',145000,965496,"QA engineer");
        tester2.setSsn(654321);
        Tester tester3 = new Tester("Ammar AFSIN",24,'M',155000,549654,"Test Lead");
        tester3.setSsn(234567);

        Tester[] testersList = {tester1,tester2,tester3};


            System.out.println(Arrays.toString(testersList));

        System.out.println("##########################################################################################3");

        Developers dev1 = new Developers("Bedirhan dogan",24,'M',125000,988753,"Developer");
        dev1.setSsn(4563234);
        Developers dev2 = new Developers("cengiz dogan",21,'M',110000,456787,"Dev lead");
        dev2.setSsn(2342342);
        Developers dev3 = new Developers("ugur tiryaki",30,'M',115000,3458762,"developer");
        dev3.setSsn(4234234);

        Developers[] devList = {dev1,dev2,dev3};
        System.out.println(Arrays.toString(devList));


        System.out.println("#######################################################################################");


        ScrumTeam scrumTeam = new ScrumTeam(testersList,devList);

        System.out.println(scrumTeam);


    }
}
