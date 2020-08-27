package day46_ConstructorCalls;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        System.out.println("X");

    }

    public ConstructorCalls3(int a){
        this();
        System.out.println("Y");

    }

    public ConstructorCalls3(double a){
        this(5);
        System.out.println("Z");

    }

    public static void main(String[] args) {
        new ConstructorCalls3(10.0);
    }
}
