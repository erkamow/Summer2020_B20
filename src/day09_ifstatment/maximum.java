package day09_ifstatment;

public class maximum {

    public static void main(String[] args) {

        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aIsMax = a > b && a > c;
        //               true && false ===> false
        boolean bIsMax = b > a && b > c;
        //               false && false ===> false
        boolean cIsMax = c > a && c > b;
        //               true && true ===> true

        if (aIsMax == true) {
            System.out.println("a is maximum number");
        }
        if (bIsMax == true) {
            System.out.println("b is maximum number");
        }
        if (cIsMax == true) {
            System.out.println("c is maximum number");
        }

    }
}
