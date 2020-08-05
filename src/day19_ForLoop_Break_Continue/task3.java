package day19_ForLoop_Break_Continue;

public class task3 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i <=100; i+=2){
            sum += i;

        }
        System.out.println(sum);

        System.out.println("==========================================");

        int sumofOdd = 0;

        for(int a = 1; a < 100; a+=2){
            sumofOdd += a;
        }
        System.out.println(sumofOdd);
    }
}
