package day32_MethodOverLoading;

public class MethodOverLoadingPractice1 {


    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);


    }

    public static void add(int a, int b,int c) {
        int sum = a + b + c;
        System.out.println(sum);

    }

    public static void add(int a, int b,int c,int d) {
        int sum = a + b + c + d;
        System.out.println(sum);

    }
}
