package day09_ifstatment;

public class Vote_If_Else {

    public static void main(String[] args) {

        int age = 21;
        boolean usCitizen = true;

        if(age >= 18 && usCitizen ){
            System.out.println(" eligible to vote");
        }else{
            System.out.println(" not eligible to vote");
        }

    }
}
