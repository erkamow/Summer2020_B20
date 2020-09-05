package day51_Expections.AnimalTask;

public class Cat extends Pet{
    public String motherLand;


    public Cat(String name, int age, char gender, String breed, String color,String motherLand) {
        super(name, age, gender, breed, color);
        this.motherLand = motherLand;
    }
    protected void eat(){
        System.out.println(name+" is eating tuna fish");
    }
    protected void drink(){
        System.out.println(name+" is drinking milk");
    }
    protected void sleep(){
        System.out.println(name+" is sleeping its own bed");
    }
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nBreed: "+breed+"\nColor: "+color+"\nFrom: "+motherLand;
    }
}
