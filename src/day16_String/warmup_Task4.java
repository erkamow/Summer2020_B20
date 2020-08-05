package day16_String;

public class warmup_Task4 {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ab";
        String str3 = "abc";
        boolean allSame = str1.length()==str2.length() && str1.length()==str3.length();
        boolean allDiffrent =str1.length()!=str2.length()&& str1.length()!=str3.length()&&str2.length()!=str3.length();
        if(allSame){
            System.out.println("All words are same lenght");
        }else if(allDiffrent){
            System.out.println("All different length");

        }else{
            System.out.println("not same nor different");
        }

    }
}
