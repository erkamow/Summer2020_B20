package day0;
import Library.customMethods;
import java.util.Arrays;

public class MethodCall {

    public static void main(String[] args) {
        int[] number = {300,200,100,10000,300000,-5000,40000};
        customMethods.MaxNum(number);
        customMethods.MinNum(number);
    }
}
