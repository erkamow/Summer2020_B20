package day48_Inheritance.DeviceTask;

public class phone extends Device {

    public boolean hasSIMCard;

    public phone(String brand,String model,double price,boolean hasBattery,boolean hasMemory,String screenSize,boolean hasSIMCard){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
         this.hasSIMCard = hasSIMCard;
    }
    public void Use(){
        System.out.println("using "+brand+" "+model);
    }
    public void call(long phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
}
