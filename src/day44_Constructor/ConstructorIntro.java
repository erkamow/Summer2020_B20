package day44_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(String arr,int a){
        System.out.println("Hello "+ arr+" "+a);

    }

    public static void main(String[] args) {
       // ConstructorIntro obj = new ConstructorIntro(10);

      //  ConstructorIntro obj2 = new ConstructorIntro(9,7);

        ConstructorIntro obj3 = new ConstructorIntro("Erkam",10);
        ConstructorIntro obj4 = new ConstructorIntro("kubra",5);
        ConstructorIntro obj5 = new ConstructorIntro("ammar",15);


    }


}
