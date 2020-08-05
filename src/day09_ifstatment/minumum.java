package day09_ifstatment;

public class minumum {

    public static void main(String[] args) {

        double a = 10;
        double b = 20;
        double c = 30;

        boolean aIsMin = a < b && a < c;
        //               true &&  true ===> true
        boolean bIsMin = b < a && b < c;
        //               false && true ===> false
        boolean cIsMin = c < a && c < b;
        //               false && false ===> false

        if(aIsMin == true){
            System.out.println("a is the minumum number");
        }
        if(bIsMin == true){
            System.out.println("b is the minumum number");
        }
        if (cIsMin == true){
            System.out.println("c is the minumum number");
        }


    }
}
