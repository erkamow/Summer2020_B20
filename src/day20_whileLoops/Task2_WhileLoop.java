package day20_whileLoops;

public class Task2_WhileLoop {

    public static void main(String[] args) {

        String str = "Erkam";

        int lin = str.length()-1;

        while (lin >= 0){
            System.out.print(str.charAt(lin));
            lin-=1;
        }
    }
}
