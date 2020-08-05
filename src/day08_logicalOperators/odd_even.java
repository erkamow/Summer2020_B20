package day08_logicalOperators;

public class odd_even {

    public static void main(String[] args) {

        int number = 101;


        boolean even = number % 2 == 0;
        boolean odd  = number % 2 != 0;

        if(even){
            System.out.println(number + " is even number");
        }
        if(odd){
            System.out.println(number + " is odd number");
        }

    }
}
