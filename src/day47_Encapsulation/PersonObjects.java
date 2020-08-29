package day47_Encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Erkam",26,"M","03/25/1994");
        person1.setID(14535454);
        person1.setSsn(19941996);

        System.out.println(person1+"\nPersonal ID: "+person1.getID()+"\nSSN: "+person1.getSsn()+"\nAddress: "+person1.getAddress());
    }
}
