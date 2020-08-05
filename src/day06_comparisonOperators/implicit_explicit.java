package day06_comparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {


        short s1 = 100;
        long l1 = s1;  // implicit casting : automatically done

        long l2 = (long)s1; // manually implicit

        int a1 = 240;

        double a2 = a1; //automatically

        double a3 =(double)a1; //manually

        System.out.println(a2);
        System.out.println(a3);

        double e1 = 1453.0; // is has to be done manually
        int e2 = (int)e1;   // always manually

        System.out.println(e1);
        System.out.println(e2);

        long f1 = 4400;
        short f2 = (short)f1;
        System.out.println(f2);

        double d1 = 324567.34;
        float d2 = (float)d1;
        System.out.println(d2);

        long r1 = -500;
        int p1 = (short)r1;
        System.out.println(p1);

       int g1 = 46;
       short g2 = (short)g1;
        System.out.println(g2);

        double q1 = 120.5;
        int q2 = (int)q1;
        System.out.println(q2);

        int k1 = 320;
        double k2 =k1;
        System.out.println(k2);





    }
}
