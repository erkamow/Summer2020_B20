package day16_String;

public class String_Index {

    public static void main(String[] args) {

        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");
        int r3 = s5.indexOf("rn");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("========================================");

        String s6 = "Java is a programming language, and Java is fun";
        int I1 = s6.indexOf("J"); // first J index number
        int I2 = s6.lastIndexOf("J"); // last J index number
        System.out.println(I1);
        System.out.println(I2);
        System.out.println("=========================================");

        String s7 = "Java";
        int a1 = s7.indexOf("A");
        System.out.println(a1);
    }


}
