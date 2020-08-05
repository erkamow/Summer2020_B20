package day22_NestedLoop;

public class Tasknested1 {

    public static void main(String[] args) {

        for(int j = 1; j <= 10; j++){

            for(int i = 1; i <= 5; i++){
                System.out.print("*");

            }
            System.out.println();
        }

        int e = 1;
        while(e <= 10){
            for(int a = 1; a <= 5; a++){
                System.out.print("$");
            }
            System.out.println();
            e++;
        }
    }
}
