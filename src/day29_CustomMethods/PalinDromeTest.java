package day29_CustomMethods;

public class PalinDromeTest {
    public static void main(String[] args) {

        palinDrome("father");
    }


    public static void palinDrome(String sentence){
        String result = "";
        for(int i = sentence.length()-1; i >= 0; i--){
            result+=sentence.charAt(i);
        }

        if (result.equalsIgnoreCase(sentence)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
