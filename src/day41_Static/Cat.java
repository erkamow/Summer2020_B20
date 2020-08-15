package day41_Static;

public class Cat {

    String name;
    int age;
    char gender;
    String color;
    String breed;

    public void setCatInfo(String name,int age,char gender,String color,String breed){

        this.name = name;
        this.age = age;
        this. gender = gender;
        this.color = color;
        this.breed = breed;



    }

    public void eat(String catFood){
        System.out.println(name+" is eating "+catFood);
    }

    public void drink(String catDrink){
        System.out.println(name+" is drinking "+catDrink);
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" Color: "+color+" Breed: "+breed;
    }
}
