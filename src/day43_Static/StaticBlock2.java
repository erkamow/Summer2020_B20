package day43_Static;

import day42_StaticClass.Tester;

public class StaticBlock2 {

    static int a;
    static String b;
    static Tester tester1;

    static {
        a = 10;
        b = "Erkamow";

        Tester tester1 = new Tester();
        tester1.setTestInfo("erkam",123456,"SDET",120000,'M');

    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
