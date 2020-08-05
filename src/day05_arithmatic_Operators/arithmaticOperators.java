package day05_arithmatic_Operators;

public class arithmaticOperators {

    public static void main(String[] args) {

        System.out.println( 20 + 3 - 2 + 1);

        // 23-2+1
        // 22
        System.out.println( 10/3 ); //int/int ===> int
        System.out.println( 10.0/3 ); //double/int ===> double
        System.out.println( 3/10.0 ); //int/double ===> double
        System.out.println( 3.0/10.3 );//double/double ====> double
        System.out.println( 10%3 );
        System.out.println( 10.0%3 );

        System.out.println( 10%4 );
        //10 / 4 = 2
        //10 - (4*2) = 2
        System.out.println( 30%8 );

        System.out.println( 99%4 );
        // 99/4=24
        // 99 - (24*4)
        // 99-96=3



    }

}
