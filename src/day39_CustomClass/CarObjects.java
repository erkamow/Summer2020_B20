package day39_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
            car1.brand = "Toyota";
            car1.model = "Corolla";
            car1.year = 2020;
            car1.color = "White";
            car1.price = 19000.50;
            car1.mileage = 20000;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.mileage);
        System.out.println(car1.price);
        System.out.println(car1.color);

        System.out.println("=================================================");

        Car car2 = new Car();
        car2.brand = "Mercedes";
        car2.model = "C Class";
        car2.year = 2020;
        car2.color = "White";
        car2.price = 43000;
        car2.mileage = 1000;

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.mileage);
        System.out.println(car2.price);
        System.out.println(car2.color);

    }
}
