package day25_AARecap;

import java.util.Arrays;

public class EvenOdd2 {

    public static void main(String[] args) {

        int numbers[] = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }


        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
