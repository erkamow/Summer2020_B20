package day19_ForLoop_Break_Continue;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for(int i = 5; i < 10; i++){
            System.out.println("hello");
            System.out.println("How are you");
        }

        System.out.println("========================================");

        for(int i = 1; i <= 5; i++) // Do not use anytime!!!!!!!
            System.out.println("hello");
            System.out.println(" how are you");
    }
}
