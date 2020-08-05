package day29_CustomMethods;

public class MaxMin {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        MaxNum(numbers);
        MinNum(numbers);

    }





    public static void MaxNum(int[] arr){
        int max = 0;

        for(int each : arr){
            if(each>max){
                max = each;
            }
        }
        System.out.println("max: "+max);
    }

    public static void MinNum(int[] arr2){
        int min = 0;

        for(int each : arr2){
            if(each<min){
                min = each;
            }
        }
        System.out.println("min: "+min);

    }
}
