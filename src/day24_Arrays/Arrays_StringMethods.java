package day24_Arrays;

import java.util.Arrays;

public class Arrays_StringMethods {

    public static void main(String[] args) {

        String str = "ABCD";
        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("==================================================");
        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray(); // D,C,E,B,A
        char[] ch2 = str2.toCharArray(); // A,D,C,B,E

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean b1 = Arrays.equals(ch1,ch2);
        System.out.println(b1);

        System.out.println("====================================================");

        String sentence = "i love programing language";

        // "language programming love i"

        String[] words = sentence.split(" "); // {i , love , programming, language}
        System.out.println(Arrays.toString(words));

        for(int i = words.length-1; i >= 0; i--){
            System.out.print(words[i]+" ");
        }

        System.out.println();

        System.out.println("=================================================");
        String s = "JAVA";
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr)); // every single elements are string

        char[] c = s.toCharArray(); // every single elements are char
        System.out.println(Arrays.toString(c));
    }
}
