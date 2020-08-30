package day48_Inheritance.DeviceTask;

public class TV extends Device{

    public boolean hasRemote;

    public TV(String brand,String model,double price,boolean hasBattery,boolean hasMemory,String screenSize,boolean hasRemote){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.hasRemote = hasRemote;

    }


    public void watch(){
        System.out.println("watching "+brand+" "+ model);
    }

}
