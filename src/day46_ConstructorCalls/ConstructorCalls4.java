package day46_ConstructorCalls;

public class ConstructorCalls4 {


    public ConstructorCalls4(){
         // this(); constructor cannot call itself
    }

    public ConstructorCalls4(int a){
        this();
        System.out.println("Erkam");

    }

    public ConstructorCalls4(double a){
        this(10);
        System.out.println("Kubra");

    }

    public ConstructorCalls4(String a){
        this(2.5);
        System.out.println("Ammar");
    }

    public static void main(String[] args) {
        new ConstructorCalls4("Erkam");
    }

}
