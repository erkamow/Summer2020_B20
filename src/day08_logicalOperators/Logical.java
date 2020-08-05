package day08_logicalOperators;

public class Logical {

    public static void main(String[] args) {

        // ! : opposite boolean

        boolean r1 = 9 > 7 ; // true
        boolean r2 = !r1 ;   // false

        System.out.println(r1 + " : " + r2);

        System.out.println( !false);
        System.out.println( !true);

        boolean r3 = !false == true;
        System.out.println(r3);

        boolean r4 = true == !true;
        System.out.println(r4);

        boolean r5 = 9 > 5 && 9 > 10;
        System.out.println(r5);

    }
}
