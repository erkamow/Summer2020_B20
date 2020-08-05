package day20_whileLoops;

public class Erkam_Task {

    public static void main(String[] args) {

        int num = 0;
        while (num <= 100){
            if(num % 2 == 0){
                num++;
                continue;

            }
            System.out.print(num + " ");
            num++;
        }
    }
}
