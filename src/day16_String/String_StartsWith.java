package day16_String;

public class String_StartsWith {

    public static void main(String[] args) {

        String str = "Erkam";
        System.out.println(str.startsWith("M"));
        System.out.println(str.startsWith("J"));
        System.out.println(!str.startsWith("G"));

        System.out.println(str.startsWith("Er"));
        System.out.println(str.toLowerCase().contains("er"));
    }
}
