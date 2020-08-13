package day40_CustomClassRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

        offer ofr1 = new offer();
        offer ofr2 = new offer();
        offer ofr3 = new offer();



        ofr1.setOffer(180000,"Atlanta",true,
                true,false,"SDET",true);
        ofr2.setOffer(120000,"Dallas",true,
                false,true,"Test Lead",true);
        ofr3.setOffer(160000,"San Francisco",true,
                false,false,"QA",true);

        ArrayList<offer> offerList = new ArrayList<>();
        offerList.addAll(Arrays.asList(ofr1,ofr2,ofr3));
        // offerList.removeIf(p ->p.salary < 120000);
         offerList.removeIf(p ->p.salary < 180000 || !p.location.equals("Atlanta"));

        for(offer eachOfr : offerList){
            eachOfr.getOfferInfo();
        }

        System.out.println("============================================================");

        // offerList.removeIf(p ->p.salary < 180000 || !p.location.equals("Atlanta"));
       // System.out.println("Number of offers: "+offerList.size());




    }
}
