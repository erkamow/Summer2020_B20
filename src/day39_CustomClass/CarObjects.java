package day39_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        /*
            car1.brand = "Toyota";
            car1.model = "Corolla";
            car1.year = 2020;
            car1.color = "White";
            car1.price = 19000.50;
            car1.mileage = 20000;

         */
        car1.setInfo("Toyota","Coralla",2010,
                "Red",55000,16000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.mileage);
        System.out.println(car1.price);
        System.out.println(car1.color);

        System.out.println("=================================================");

        Car car2 = new Car();
        /*
        car2.brand = "Mercedes";
        car2.model = "C Class";
        car2.year = 2020;
        car2.color = "White";
        car2.price = 43000;
        car2.mileage = 1000;

         */

        car2.setInfo("bmw","x5",2005,"black",20000,
                4500);

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.mileage);
        System.out.println(car2.price);
        System.out.println(car2.color);

        System.out.println("=========================================================");

        Car myCar = new Car();

        myCar.setInfo("Maserati","Ghibli",2019,"Blue",2000,45000);
        myCar.getCarInfo();
        System.out.println("=======================================================");
        System.out.println(myCar.color);
        System.out.println(myCar.year);
        System.out.println(myCar.brand);
        System.out.println(myCar.mileage);
        System.out.println(myCar.model);
        System.out.println(myCar.price);


    }
}
