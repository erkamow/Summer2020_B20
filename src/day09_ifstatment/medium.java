package day09_ifstatment;

public class medium {

    public static void main(String[] args) {

        double a = 1000;
        double b = 2000;
        double c = 3000;

        boolean aMed = (a > b && a < c) || (b > a && a > c);
        //             false && false ===> false
        boolean bMed = (b > a && b < c) || (a < b && b > c);
        //             true && true ===> true
        boolean cMed = (c > a && c < b) || (a > c && c > b);
        //             true && false ===> false

        if(aMed == true){
            System.out.println("a is medium number");
        }
        if(bMed == true){
            System.out.println("b is medium number");
        }
        if (cMed == true){
            System.out.println("c is meidum number");
        }





    }
}
