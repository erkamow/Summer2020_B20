package day37_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9));
       // Predicate<Integer> lessThan5 = p -> p < 5 ;
       // list.removeIf(lessThan5);

        list.removeIf(p -> p < 5);

        System.out.println(list);

        System.out.println("=======================================================");


        ArrayList<Integer> numbers = new ArrayList<>();
        Predicate<Integer> oddNumbers = p -> p % 2 != 0;
        for(int i = 0; i <= 100; i++){
            numbers.add(i);
        }
        //numbers.removeIf(oddNumbers);
        numbers.removeIf(p -> p % 2 == 0);
        System.out.println(numbers);

        System.out.println("=========================================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Marry","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"));
        names.removeIf(each -> each.startsWith("M"));
        System.out.println(names);

        System.out.println("==========================================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));

        nums.removeIf(p -> Collections.frequency(nums,p) != 1);
        System.out.println(nums);

        System.out.println("==========================================================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','c','d','1','2','3','4','$','@','#','&'));
        // chars.removeIf(p -> p >=97 && p <=122 || p>=48 && p <=57 || p>=65 && p<=90 );
        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);

        System.out.println("=========================================================");

        ArrayList<Character> chars1 = new ArrayList<>();
        chars1.addAll(Arrays.asList('1','2','5','%','*','a','b','c'));
        chars1.removeIf(p -> Character.isLetter(p) || Character.isDigit(p));
        System.out.println(chars1);

    }
}
