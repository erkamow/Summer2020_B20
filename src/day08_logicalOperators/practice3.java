package day08_logicalOperators;

public class practice3 {

    public static void main(String[] args) {

        int b = 2;
        boolean res = ++b == 2  || --b == 2 && --b == 2;
        //            3 == 2 || 2 == 2 && 1 == 2
        //            false ||  true   && false
        //                   true  &&  false
        //                         false
        System.out.println(res);
        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5;
        //      r2 =  5 == 6 ||  6 == 5
        //      r2 =  false  ||  false
        //                  false
        System.out.println(r2);



        System.out.println(res);


    }
}
