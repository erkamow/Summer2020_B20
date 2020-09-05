package day51_Expections.AnimalTask;

public class House {
    public static void main(String[] args) {


        Dog dog1 = new Dog("jojo", 5, 'M', "german wolf", "brown",5000);
        System.out.println(dog1);
        dog1.eat();
        dog1.drink();
        dog1.sleep();

        System.out.println("=========================================");

        Cat cat1 = new Cat("tekir",6,'M',"Van Cat","white","Eastern Turkey");
        System.out.println(cat1);
        cat1.eat();
        cat1.drink();
        cat1.sleep();

    }
}
