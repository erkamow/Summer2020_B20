package day07_Unary_Shortland;

public class shorthand_operators {

    public static void main(String[] args) {

        int a = 100;
        a+=a;
        System.out.println(a);
        int b = 100;
        b*=b;
        System.out.println(b);

        System.out.println("===========================");


        int z = 300;
        z += 200;
        System.out.println(z);

        String firstName = "Erkam";
        firstName +=" Afsin";
        System.out.println(firstName);

        System.out.println("=====================================================");

        int x = 65;
        x /= 5;
        System.out.println(x);

        int budget = 10000;
        budget /= 2;
        System.out.println(budget);

        System.out.println("===================================================");

        int v =10;
        v %= 2;
        System.out.println(v);

        int u = 17;
        u %= 2;
        System.out.println(u);

        double f = 400.5;
        f %= 2;
        System.out.println(f);

        int g = 35;
        g = g + 5;
        System.out.println(g);


    }
}
