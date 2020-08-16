package day42_StaticClass;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {
        System.out.println(b);
        // System.out.println(a); (main main method is static method therefore  it does not accept instance method)
        // System.out.println(this.a);

        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);
        // Creating an  object is the only way to use instance method inside main method

        staticMethod();
        StaticMethods.staticMethod();


        // instanceMethod();
        // StaticMethods.instanceMethod();   only static class members allow to use inside static class

        obj.instanceMethod();

    }


    public static void staticMethod(){


    }

    public void instanceMethod(){



    }
}
