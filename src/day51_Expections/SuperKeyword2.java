package day51_Expections;


class B{
    public B(){
        System.out.println("super class default constructor");
    }
}

public class SuperKeyword2 extends B{

    public SuperKeyword2(){
        super(); // call the super class constructor
        System.out.println("sub class default constructor");
    }

    public static void main(String[] args) {

        new SuperKeyword2();


    }
}
