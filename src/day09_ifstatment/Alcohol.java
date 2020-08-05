package day09_ifstatment;

public class Alcohol {

    public static void main(String[] args) {


        boolean hasID = true;
        int age = 19;

        boolean eligible = hasID && age >= 21;
        //                 true && false ==> false

        if(eligible == true){
            System.out.println("Eligible to buy alcohol");

        }
        if(eligible == false){
            System.out.println("not eligible to buy alcohol");

        }
    }
}
