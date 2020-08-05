package day31_MethodsRecap;
import Library.Util;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AABBBCCC";
        String expectedResult = ""; // A2B3C3

        String nonDup =   Util.removeDup(str);// ABC
        for(char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each);
            expectedResult+= ""+each+count1;

        }
        System.out.println(expectedResult);
        System.out.println("================================================");
        String str2 = "qqqqqwwweeertygbbnn";
        String expectedresult2 = frequencyOfChar(str2);
        System.out.println(expectedresult2);

/*
        char ch1 = nonDup.charAt(0); // A
        int count1 = Util.frequency(str,ch1); // 2
        expectedResult+=""+ch1+count1;

        char ch2 = nonDup.charAt(1);
        int count2 = Util.frequency(str,ch2);
        expectedResult+=""+ ch2+count2;

        char ch3 = nonDup.charAt(2);
        int count3 = Util.frequency(str,ch3);
        expectedResult+=""+ch3+count3;

        System.out.println(expectedResult);
        */

    }
    public static String frequencyOfChar(String str){
        String expectedResult = ""; // A2B3C3

        String nonDup =   Util.removeDup(str);// ABC
        for(char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each);
            expectedResult+= ""+each+count1;

        }
        return expectedResult;
    }
}
