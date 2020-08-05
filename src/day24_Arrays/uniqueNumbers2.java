package day24_Arrays;

public class uniqueNumbers2 {

    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9};

        for (int a : arr) { // 1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9   a

            int count = 0;
            for (int b : arr) { // only calculates the frequency of num1     1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9   b

                if (b == a) {
                    count += 1; // 2
                }
            }
            if (count == 1) {
                System.out.print(a + " "); // 2
            }
        }
    }
}
