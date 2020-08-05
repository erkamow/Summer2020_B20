package day15_String;

public class practice_Substring {

    public static void main(String[] args) {

        String sentence = "Java is fun";

        String word = sentence.substring(0,4);
        System.out.println(word);

        String word2 = sentence.substring(8,11);
        System.out.println(word2);

        String sentence2 = "I like movies and tv series";
        String movies =sentence2.substring(7,13);
        System.out.println(movies);

        System.out.println("===============================================");

        String firstName = "ERKAM";
        String firstChar = firstName.substring(0,1);
        System.out.println(firstChar);
        String rest = firstName.substring(1,5);
        System.out.println(rest);

        System.out.println("=======================================================");

        String LastName = "school";
        String firstChar2 = LastName.substring(0,1);
        String remaining = LastName.substring(1);
        System.out.println(firstChar2);
        System.out.println(remaining);

        System.out.println("=========================================================");

        String s = "I like game of thrones";
        String series = s.substring(7);
        System.out.println(series);


        String s2 = "I like java programing language";
       s2 = s2.substring(7);
        System.out.println(s2);
    }
}
