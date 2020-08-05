package day06_comparisonOperators;

public class relational_operators {
    public static void main(String[] args) {

        // relational operators: returns boolean at the end
        // >:  greater than
        // <:  less than
        // >=: greater or equal
        // <=: less or equal
        // ==: equal
        // !=: not equal
        // 9 > 8 ==> true
        // 7 < 6 ==> false
        // 7 >= 7 ==> true
        // 8 >= 6 ==> true
        // 9 <= 25 ==> true

        // 10 == 10 ==> true
        // 'A' == 'A' ==> true

        boolean r1 = 10>9;
        System.out.println(r1);
        boolean r2 = 100 < 9000;
        System.out.println(r2);

        boolean r3 = 87 >= 85;
        System.out.println(r3);

        boolean r4 = 65 <= 79;
        System.out.println(r4);

        boolean r5 = 32.1 == 32.1;
        System.out.println(r5);

        boolean r6 = -45 != 67;
        System.out.println(r6);

        boolean r7 = "Erkamow" == "Erkamow";
        System.out.println(r7);

        boolean r8 = "Kubra" == "kubra"; // java is case sensivity
        System.out.println(r8);

        boolean r9 = 'A' == 65;
        System.out.println(r9);

        boolean result1 = 100 == 100.0;
        System.out.println(result1);

        boolean result2 = "100" == "100.0";
        System.out.println(result2);

        int number = 100;
        boolean even = number%2 == 0;
        System.out.println(even);

        int number2 = 101;
        boolean even2 = number2%2 == 0;
        System.out.println(even2);

        int number3 = 105;
        boolean odd3 = number3 % 2 != 0;
        System.out.println(odd3);

        int x = 1000;
        boolean div3 = x % 3 == 0;       // x is odd number.
        boolean div4 = x % 3 != 0;
        System.out.println(div3);
        System.out.println(div4);


    }
}
