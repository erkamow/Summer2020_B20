package day50_Inheritance_Overriding.CarTask;

public class CarObjects {
    public static void main(String[] args) {


        honda honda1 = new honda();
        mercedes merco1 = new mercedes();
        tesla tesla1 = new tesla();
        jeep jeep1 = new jeep();
        bmw bmw1 = new bmw();

        honda1.start();
        System.out.println("======================");
        merco1.start();
        System.out.println("=======================");
        tesla1.start();
        System.out.println("=========================");
        jeep1.start();
        System.out.println("=========================");
        bmw1.start();
    }
}
