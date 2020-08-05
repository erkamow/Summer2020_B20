package day10_IfStatments;

public class character_identify {

    public static void main(String[] args) {

        char character = '@';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);

       if(isAlphabetic == true){
           System.out.println(character + " is Alphabetic character");

       }else{
           System.out.println(character + " is not Alphabetic character");
       }

    }
}
