package day43_Static;

public class Static_Block {



    public static void main(String[] args) {
        System.out.println("Main method");
    }
    static {
        System.out.println("Static Block"); // static block always execute first even if it is placed after main method
    }
}
