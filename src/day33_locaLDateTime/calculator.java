package day33_locaLDateTime;

import java.util.Arrays;

public class calculator {
    public static void main(String[] args) {
        int a = 10;
        double b = 20;
        System.out.println(addition(a,(int)b));
        float num1 = 10;
        float num2 = 20;
        System.out.println(addition(num1,num2) );

        int[] arr = {4,3,2,1};
        Arrays.sort(arr);

        char[] arr2 = {'C','B','A'};
        Arrays.sort(arr2);

        int l = 34;
        int d = 3;
        System.out.println(multiplication(l,d));
    }



    public static int addition(int a,int b){
        return a + b;
    }
    public static double addition(double a,double b){
        return a + b;
    }
    public static double addition(double a, int b){
        return a + b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static double multiplication(double a, double b){
        return a * b;
    }

}
