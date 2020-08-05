package day25_AARecap;
import java.util.Arrays;

public class First3Char {

    public static void main(String[] args) {
        String arr[] = {"apple", "banana", "strawberry", "peach","orange"};
        //                  0       1           2           3       4

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);

        for (int i = 0; i<=4;i++){
            System.out.println(arr[i].substring(0,3));
        }
    }
}
