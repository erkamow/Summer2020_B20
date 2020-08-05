package day32_MethodOverLoading;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

        String firstName = "ErKaM";
        String lastName = "AfSin";

        String fullName = Util.formatFullName(firstName,lastName);
        System.out.println(fullName);
        String uniques = Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);
        String reversed = Util.reverse(fullName);
        System.out.println(reversed);
        System.out.println("==============================================");

        int[] numbers = {100,200,50,60,99};
        int e1 = 350;
         numbers = Util.addElement(numbers,e1);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
