package officeHours;

import java.util.ArrayList;

public class PizzaObjects {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzaForB20 = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            Pizza order1 = new Pizza();
            order1.setPizzaInfo("Small",2,2);
            pizzaForB20.add(order1);

        }
        System.out.println("Total number of pizza: "+pizzaForB20.size());
        double totalPrice = 0;

        for(Pizza each : pizzaForB20){
            totalPrice+=each.calCost();

        }
        System.out.println("Total price: $"+totalPrice);




        Pizza order1 = new Pizza();
        Pizza order2 = new Pizza();
        Pizza order3 = new Pizza();


        order1.setPizzaInfo("Small",2,2);
        System.out.println(order1);
        order2.setPizzaInfo("medium",1,3);
        System.out.println(order2);
        order3.setPizzaInfo("large",3,4);
        System.out.println(order3);
    }
}
