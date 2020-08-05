package day23_Arrays;

public class MinAndMax {

    public static void main(String[] args) {

        int[] arr ={5,5,4,6,4,1};
        int max = arr[0]; // max is; 5
        int min = arr[0];
        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];


            }
        }
        System.out.println(max);
        System.out.println(min);

    }

}
