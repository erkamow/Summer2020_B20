package day29_CustomMethods;

public class UniqueElements {

    public static void main(String[] args) {
        String[] arr = {"A","B","B","C",};
        Uniques(arr);
        System.out.println("hello");

        String[] arr2 = {"D","D","E","F","F"};
        Uniques(arr2);
    }

    public static void Uniques(String[] arr){


        for (String a : arr) {


            int count = 0;

            for (String each : arr) {
                if (a.equals(each)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.print(a+" ");
            }
        }
        System.out.println();
    }
}
