package day24_Arrays;

public class UniqueNumbers {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,5,5,6,6,7,8,8,9,9};

        for(int j = 0; j <= arr.length-1; j++){
            int num1 = arr[j];
            int count = 0;
            for(int i = 0; i <= arr.length-1; i++){ // only calculates the frequency of num1
                int each = arr[i];
                if(each == num1){
                    count+=1;
                }
            }
            if(count == 1){
                System.out.print(num1+" ");
            }
        }



    }
}
