package day42_StaticClass;

public class Car {

    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;

   static boolean hasWheel = true;
   static int numberOfTires = 4;
   static boolean hasEngine = true;
   static boolean hasDoors = true;
   static boolean hasAirBag = true;
   static boolean hasSeatBelt = true;
   static boolean hasHorn = true;

   public void start(){
       System.out.println("Starting "+brand+" "+model);
   }

   public static void printTires(){
       System.out.println("Tires: "+numberOfTires);
   }

   public String toString(){
       return "brand: "+ brand+", model: "+model+", year: "+year+", color: "+color
               +"\nnumber of tires: "+numberOfTires+"\nhas engine: "+hasEngine
               +"\nhas wheel: "+hasWheel+"\nhas airbags: "+hasAirBag;
   }

}
