package day48_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("winston","medium",3,'M');
        System.out.println(dog1.name);
        System.out.println(dog1.size);
        System.out.println(dog1.gender);
        System.out.println(dog1.age);

        dog1.bark();
        dog1.sleep();
        dog1.eat();
        System.out.println(dog1);

        Cat myCat = new Cat("mila","small",1,'F');
        System.out.println(myCat);
        myCat.meowing();
    }
}
