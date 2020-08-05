package day07_Unary_Shortland;

public class post_VS_pre {


    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a);

        System.out.println("==============================================");

        int b = 10;
        System.out.println(b++);
        System.out.println(b);
        int c = 10;
        System.out.println(c--);
        System.out.println(c);

        System.out.println("=============================================");

        int e = 25;
        int d = e++;
        System.out.println(e);
        System.out.println(d);

        System.out.println("==============================================");

        int x = 8;
        int y = x--;
        System.out.println(y);
        System.out.println(x);

        System.out.println("=================================================");

        int A = 1;
        A = -A-- + A++ / -A-- * --A;
        // A = -1  + 0  /  -1  *  -1
        // A = -1  + 0  *  -1
        // A = -1  + 0  = -1
        System.out.println(A);

        System.out.println("===================================================");

        int B = 50;
        B = --B + B++ + B-- + B++;
        //B = 49 + 49 + 50 + 49
        //B = 197
        System.out.println(B);

        System.out.println("==========================================");

        int f = 4;
        int k = f * 4 - f++;
        // 4 * 4 - 4
        //k = 12
        System.out.println(k);







    }
}
