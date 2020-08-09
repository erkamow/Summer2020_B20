package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("lexus","RX350",2019,"white",2000,30000);
        car1.getCarInfo();
        System.out.println("=============================================");
        car2.setInfo("mercedes","S63 AMG",2020,"Black",0,110000);
        car2.getCarInfo();
        System.out.println("==============================================");
        car3.setInfo("bmw","M4",2018,"Blue",2300,55000);
        car3.getCarInfo();
        System.out.println("===============================================");
        car4.setInfo("Audi","S5",2016,"Red",1300,35000);
        car4.getCarInfo();
        System.out.println("================================================");
        car5.setInfo("Chevrolette","Corvette",2019,"Black",4000,54000);
        car5.getCarInfo();

    }
}
