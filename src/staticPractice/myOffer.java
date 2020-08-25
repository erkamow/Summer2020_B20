package staticPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffer {

    public static void main(String[] args) {

        offer ofr1 = new offer("Atlanta/GA","mbUSA",120000,true);
        offer ofr2 = new offer("Washington DC/VA","Bank of America",140000,true);
        offer ofr3 = new offer("Charlotte/NC","Krouger",90000,false);
        offer ofr4 = new offer("Boston/MA","BBC News",150000,true);

        ArrayList<offer> offersList = new ArrayList<>();
        offersList.addAll(Arrays.asList(ofr1,ofr2,ofr3,ofr4));

        for(offer each : offersList){
            System.out.println("========================");
            System.out.println(each);


        }

        System.out.println("**********************************************************************");
         // offersList.removeIf(p->p.isFullTime==false);
        // offersList.removeIf(p->!p.location.equals("Atlanta/GA"));
       //  offersList.removeIf(p->p.salary<100000);
        System.out.println(offersList);







    }
}
