package day15_String;

import java.lang.String; // does not need to be imported.Automatically will be imported from the package

import java.util.Scanner; // if you wanna use must be imported manually

public class String_Intro {

    public static void main(String[] args) {

        String name = "Erkam"; // String literal
        String name1 = new String("kubra");
        System.out.println(name1);
        System.out.println(name);

        String s1 = "Cat";
        String s2 = "Cat";
           // String s1 == String s2 ===> true

        System.out.println( s1 == s2);

        String d1 = "Dog";
        String d2 = "dog";
           // String d1 != String d2 ===> False

        System.out.println( d1 == d2);

        String t1 = new String("Tiger");
        String t2 = new String("Tiger");

        System.out.println( t1 == t2);
               // new String("Tiger") != new String("Tiger") ===> False

        System.out.println("=====================================================");

        String c1 = "Erkam"; // pool
        String c2 = new String("Erkam"); // heap
        String c3 = new String("Erkam"); // heap
        String c4 = "Erkam"; // pool
        String c5 = "erkam";

        System.out.println( c1 == c2);
        System.out.println( c2 == c3);
        System.out.println( c1 == c4);
        System.out.println( c1 == c5);

        System.out.println("===============================================");

        String str1 = "Java";
        str1 = "JavaScript";
        System.out.println(str1);

        str1 = "Java";
        System.out.println(str1);




    }
}
