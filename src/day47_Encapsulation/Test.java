package day47_Encapsulation;

public class Test {

    public static void main(String[] args) {
        // public         visible at everywhere in any package and class
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        // default        visible at only  in same package
        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();

        // private         visible at only in same class
        //System.out.println(AccessModifiers.privateVariable);
        //AccessModifiers.privateMethod();


        Encapsulation obj1 = new Encapsulation();
        //System.out.println(obj1.ssn);
        System.out.println(obj1.getSsn());
        obj1.setSsn(7654321);
        System.out.println(obj1.getSsn());
    }
}
