package officeHours.Practice_Inheritance;

public class Apple extends Phone {

    public Apple(String model,double price){
        super(model, price);
    }
    static {
        brand = "Apple";
        madeIn = "China";
    }

    public void call(long phoneNumber){
        System.out.println("Apple "+model+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Apple "+model+" is texting to: "+phoneNumber);
    }
}
