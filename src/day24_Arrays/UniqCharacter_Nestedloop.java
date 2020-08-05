package day24_Arrays;

public class UniqCharacter_Nestedloop {

    public static void main(String[] args) {

        String str = "aabcc";

        String uniques = "";

        for(int i = 0; i <= str.length()-1; i++){  //aabcc
            char ch = str.charAt(i); // aabcc                       a b c c
            int first = str.indexOf(ch); //  00233
            int last = str.lastIndexOf(ch); // 11244

            if(first == last){
                uniques+=ch; // b
            }

        }
        System.out.println(uniques);
    }
}
