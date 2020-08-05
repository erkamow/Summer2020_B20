package day33_locaLDateTime;

public class uniques {
    public static void main(String[] args) {

        int[] e = {4,5,5,6,6,7,8,8,8,8,9,12,23,23,13};
         uniqueElements(e);



    }

    public static void uniqueElements(int[] arr){


        for (int element : arr) {
            int count = 0;

            for (int each : arr) { // 2 2 1 3 3
                if (each == element) {
                    count++;
                }


            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();

    }
}
