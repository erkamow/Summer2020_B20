package day16_String;

public class String_equalsIgnoreCase {

    public static void main(String[] args) {

        String name1 = "Erkam Afsin";
        String name2 = "ERKAM AFSIN";

        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1==name2);
    }
}
