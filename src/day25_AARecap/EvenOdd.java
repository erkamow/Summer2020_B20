package day25_AARecap;
 import java.util.Arrays;

public class EvenOdd {

    public static void main(String[] args) {

        int numbers[] = new int[100];

        for (int i = 0; i<100;i++){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));

        int evenCount = 0;
        int oddCount = 0;
        //print out even numbers:
        for (int i = 0; i<100;i++){
            if (i%2==0){
                oddCount+=1;
            }else {
                evenCount+=1;
            }
        }

        System.out.println("There are: " + oddCount + " odd numbers in your array");

        System.out.println("There are: " + evenCount + " even numbers in your array");

    }
}
