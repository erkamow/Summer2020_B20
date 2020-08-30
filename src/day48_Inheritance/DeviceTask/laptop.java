package day48_Inheritance.DeviceTask;

public class laptop extends Device{

    public boolean hasKeyboard;
    public boolean hasCPU;
    public boolean hasMouse;
    public String OS;

    public laptop(String brand,String model,double price,boolean hasBattery,boolean hasMemory,String screenSize,
                  boolean hasKeyboard,boolean hasCPU,boolean hasMouse,String OS){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.hasKeyboard = hasKeyboard;
        this.hasCPU = hasCPU;
        this.hasMouse = hasMouse;
        this.OS = OS;
    }

    public void Using(){
        System.out.println("Using "+brand+" "+model);
    }
}
