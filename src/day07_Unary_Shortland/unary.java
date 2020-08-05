package day07_Unary_Shortland;

public class unary {

    public static void main(String[] args) {

        int a = 20;
        a = a + 1;
        System.out.println(a);
        int b = 30;
        b = b - 1;
        System.out.println(b);
        --b;
        System.out.println(b);

        int c = 10;
      //  c = c +1; // c =11
        ++c;
        System.out.println(c);
        // pre: place the the increment or decrement operators before variable
        // increases or decreases the value b 1 immediately

        int x = 100;
        System.out.println(++x);
        int y = 200;
        System.out.println(--y);

        // post: place the increment or decrement operators after  variable
        // first passes the current value then next step it increases or decreases the value by 1
        


    }
}
