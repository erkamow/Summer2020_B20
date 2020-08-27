package day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {


        Car car1 = new Car("mercedes","C 300","White",2020,47300);
        Car car2 = new Car("wolskwagen","Jetta R line","Black",2020,29900);
        Car car3 = new Car("BMW","4 Series","Red",2015,34000);

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(car1,car2,car3));
        for(Car each : carList){
            System.out.println("=================================");
            System.out.println(each);
        }
    }
}
