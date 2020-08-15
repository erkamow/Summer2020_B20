package day41_Static;

public class carObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setCarInfo("mercedes","C300",2020,47000,"white");
        car2.setCarInfo("WV","Jetta",2021,27000,"Gray");

        System.out.println(car1);
        System.out.println(car2);

    }


}
