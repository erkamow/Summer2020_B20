package day12_Switch_Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AgeGroups {

    public static void main(String[] args) {

        /*
        Teeanager (<21)
        Adult (>=21 && <55)
        Senior (> 55 )
         */

        int age = 20;

        String ageGroup = "";

        if(age >1 && age <=150){
            if(age > 0 && age < 21){
                ageGroup = " Teenager";

            }else if(age >=21 && age < 55){
                ageGroup = " Adult";
            }else{
                ageGroup = " Senior";
            }




        }else{
            ageGroup = " invalid";
        }
        System.out.println(ageGroup);

        String ageGroup2 = (age > 1 && age <= 150? (age >= 1 && age <21)?
                " Teenager" :(age >=21 && age < 55)? " adult" : " Senior" : " invalid");
        System.out.println(ageGroup2);
    }


}
