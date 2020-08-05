package day16_String;

public class String_equals {

    public static void main(String[] args) {

        String str1 = "Java";// string pool
        String str2 = new String("Java");// heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        String str5 = "Java";
        String str6 = "Java";

        System.out.println(str5==str6);
        System.out.println(str5.equals(str6));

        String str7 = "JAVA";
        String str8 = "java";

        System.out.println(str7==str8);
        System.out.println(str7.equals(str8));
    }
}
