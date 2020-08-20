package staticPractice;

public class mercedesBenz {

    String model;
    String type;
    int year;
    double mileage;
    double price;


    public mercedesBenz(String model,String type,int year,double mileage,double price){
        this.model = model;
        this.type = type;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }
    public String toString(){
        return "Model: "+model+"\nType: "+type+"\nYear: "+year+"\nMileage: "+mileage+"\nPrice: "+price;
    }
}
