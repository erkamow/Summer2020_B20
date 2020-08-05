package day07_Unary_Shortland;

public class divisible_2_3_5 {

    public static void main(String[] args) {


        int number = 65;

        boolean num1 = number % 2 == 0;

        System.out.println( number + " is divisible by 2: " + num1);

        boolean num2 = number % 3 == 0;

        System.out.println( number + " is divisible by 3: " + num2);

        boolean num3 = number % 5 ==0;

        System.out.println( number + " is divisible by 5 " + num3);
    }
}
