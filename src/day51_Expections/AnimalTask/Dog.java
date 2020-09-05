package day51_Expections.AnimalTask;

public class Dog extends Pet {
    public double price;


    public Dog(String name, int age, char gender, String breed, String color,double price) {
        super(name, age, gender, breed, color);
        this.price = price;
    }

    protected void eat(){
        System.out.println(name+" is eating meatball");
    }
    protected void drink(){
        System.out.println(name+" is drinking water");
    }
    protected void sleep(){
        System.out.println(name+" is sleeping its shelter");
    }
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nBreed: "+breed+"\nColor: "+color+"\nPrice: "+price;
    }
}
