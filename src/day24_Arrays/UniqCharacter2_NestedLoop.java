package day24_Arrays;

import java.util.Scanner;

public class UniqCharacter2_NestedLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String unique = "";

        for(int j = 0 ; j <= str.length()-1; j++){
            char ch1 = str.charAt(j); // a
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++){
                char each = str.charAt(i);
                if(ch1 == each){
                    count+=1;
                }
            }
            if(count == 1){
                unique+=ch1;
            }
        }
        System.out.println(unique);


    }
}
