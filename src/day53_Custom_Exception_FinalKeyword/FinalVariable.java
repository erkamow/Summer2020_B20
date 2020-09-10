package day53_Custom_Exception_FinalKeyword;

import java.time.LocalDate;

public class FinalVariable {
    final static String eyeColor = "Brown"; // final instance variables need to be initialized right away
    final String bloodType = "A"; // final instance variables need to be initialized right away

    final int x;
    final static int y;

    static {           // final instance variables will not compile if not  initialized right away
        y = 20;          //  because static block always initializes first
    }
    public FinalVariable(int x){ // you initialized final instance variables in constructor if not right away
        this.x = x;
    }

    public static void main(String[] args) {

       final LocalDate dateOfBirth = LocalDate.of(1994,3,25);
        //dateOfBirth = LocalDate.of(1996,12,6);

        System.out.println(dateOfBirth);

        final long ssn = 1234567;
        // ssn = 9876543
        System.out.println(ssn);

        final double PI = 3.14;
        // PI = 2.14
        System.out.println(PI);

        final char gender = 'M';
        //gender = 'F';
        System.out.println(gender);
    }
}
