package day41_Static;

public class Developers {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name,double salary,String gender,int age){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String toString(){
        return "name: "+name+", salary: "+"$"+salary+", gender: "+gender+", age: "+age;
    }


    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBugs(){
        System.out.println(name+" is crying");
    }
}


class DeveloperObject{
    public static void main(String[] args) {

        Developers[] developer = {new Developers(),new Developers(),new Developers(),new Developers(),new Developers(),new Developers()};

        developer[0].setInfo("Erkam",120000,"Male",36);
        developer[1].setInfo("kubra",150000,"Female",24);
        developer[2].setInfo("Ammar",180000,"Male",23);
        developer[3].setInfo("Zafer",140000,"Male",25);
        developer[4].setInfo("Ugur",130000,"Male",29);
        developer[5].setInfo("Arif",160000,"Male",22);

        for(Developers eachDev : developer){
            eachDev.coding();
        }
        System.out.println("==============================================================");

        for(int i = 0; i <= developer.length-1; i++){
            developer[i].fixBugs();
        }
    }
}
