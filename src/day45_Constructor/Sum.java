package day45_Constructor;

public class Sum {

    int a;
    int b;
    int c;
    double d;
    double e;
    double f;

    public Sum (int a , int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public Sum (int a, int b, int c){
        System.out.println(a+" + "+ b + " + " + c + " = "+ (a+b+c));
    }

    public Sum (double d, double e){
        System.out.println(d + " + " + e + " = " + (d + e));

    }

    public Sum (double d,double e,double f){
        System.out.println(d + " + " + e + " + " + f + " = " + (d + e + f));
    }

    public static void main(String[] args) {

        new Sum(10,20);

        new Sum(25.5,25);

        new Sum (21,30,45);

        new Sum (12.2,23.5,15.6);


    }
}
