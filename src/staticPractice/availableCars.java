package staticPractice;

public class availableCars {


    static mercedesBenz car1;
    static mercedesBenz car2;
    static mercedesBenz car3;
    static mercedesBenz car4;

    static {
        car1 = new mercedesBenz("c300","sedan",2019,1200,320000);
        car2 = new mercedesBenz("GLE 43","SUV",2020,500,45000);
        car3 = new mercedesBenz("SL 63","Cabriolet",2017,23000,35000);
        car4 = new mercedesBenz("S Class","Sedan",2016,55000,23000);
    }
}
