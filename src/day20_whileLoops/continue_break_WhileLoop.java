package day20_whileLoops;

public class continue_break_WhileLoop {

    public static void main(String[] args) {

        char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                continue;
            }

            System.out.print(ch + " ");
            ch++;
        }


        System.out.println();
        System.out.println("========================================");


    }

}
