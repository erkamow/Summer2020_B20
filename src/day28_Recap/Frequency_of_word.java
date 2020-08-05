package day28_Recap;

public class Frequency_of_word {

    public static void main(String[] args) {

        String str = " javajava";

        // "java"

        int count = 0;
        for(int i = 0; i <= str.length()-4; i++){

            String s = str.substring(i,i+4);
            if(s.equals("java")){
                count++;
            }

        }
        System.out.println(count);
    }
}
