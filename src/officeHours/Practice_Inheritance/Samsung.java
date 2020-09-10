package officeHours.Practice_Inheritance;

public class Samsung extends Phone{

    public Samsung(String model,double price){
        super(model,price);

    }
    static {
        brand = "Samsung";
        madeIn = "Korea";
    }

    public void call(long phoneNumber){
        System.out.println("Samsung "+model+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Samsung "+model+" is texting to: "+phoneNumber);
    }


}
