package day29_CustomMethods;

public class Method_Practice {


    public static void main(String[] args) {

        oddNumbers();
        System.out.println("hello");

        oddNumbers();
        System.out.println("hello");

        evenNumbers();
        System.out.println("hello");



    }

    // Task1
    public static void oddNumbers(){

        for(int i = 1; i <= 100; i+=2){
            System.out.print(i+" ");

        }
        System.out.println();

    }

    // Task2

    public static void evenNumbers(){
        for(int i = 0; i <= 100; i+=2){
            System.out.print(i+" ");

        }
        System.out.println();
    }
}
