package day07_Unary_Shortland;

public class pozitive_negative_0 {

    public static void main(String[] args) {

        int a = 3,  b = 2;

        long c = (a+b) * 2 / 3 % 2;

        System.out.println(c);

        System.out.println((int)10.0/3);


        int number = 120;

        boolean num1 = number == 120;
        boolean num2 = number == -120;
        boolean num3 = number == 0;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        int number1 = 100;

        boolean poz = number1 > 0;
        boolean neg = number1 < 0;
        boolean zero = number1 == 0;
        System.out.println(poz);
        System.out.println(neg);
        System.out.println(zero);

    }
}
