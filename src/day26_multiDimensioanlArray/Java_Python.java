package day26_multiDimensioanlArray;

import java.util.Arrays;



public class Java_Python {

    public static void main(String[] args) {

        String sentence = " i love Java, Python is cool";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int countJava = 0;
        int countPython = 0;

        for (int i = 0; i <= words.length - 1; i++) {

            if (words[i].contains("Java")) {
                countJava += 1;
            }else if (words[i].toLowerCase().contains("java")) {
                countJava += 1;
            }
                if (words[i].contains("Python")) {
                    countPython += 1;
                } else if (words[i].toLowerCase().contains("python")) {
                    countPython += 1;
                }


            }

        System.out.println("" + countJava + " " + "Java");
        System.out.println("" + countPython + " " + "Python");

    }
}
