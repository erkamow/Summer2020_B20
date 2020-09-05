package day51_Expections;

class C{

    public C(int a){
        System.out.println("super class int arg constructor");
    }
}

public class SuperKeyword3 extends C{   /// sub class has to call a constructor from super class

    public SuperKeyword3(int a){
        super(100);
        System.out.println("sub class constructor with int arg");

    }

    public static void main(String[] args) {
        new SuperKeyword3(100);
    }
}
