package day39_CustomClass;

public class Car {
    /*
    Attributes:
    model,brand,year,color,mileage,price...
     */


    String model;
    String brand;
    String color;
    int year;
    double mileage;
    double price;

    public  void setInfo(String carBrand,String carModel,int carYear,
                        String carColor,double carMileage,double carPrice){

        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;


    }
    public void getCarInfo(){
        System.out.println(year +" "+brand+" "+model+", "+ color+", "+mileage+", $"+price);
    }
}
