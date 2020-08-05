package day19_ForLoop_Break_Continue;

public class task4 {

    public static void main(String[] args) {

        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");

        }

        System.out.println();

        for(int i = 65; i <=90; i++){
            char cha = (char)i;
            System.out.print(cha + " ");
        }
        System.out.println();

        for(char s = 'Z'; s >= 'A'; s--){
            System.out.print(s+" ");
        }
        System.out.println();

        for(int i = 90; i >= 65; i--){
            System.out.print((char)i + " ");
        }
    }
}
