package day19_ForLoop_Break_Continue;

public class Loop_BreakStatement {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            System.out.println("hello");
            break;
        }

        System.out.println("=======================================");

        for(char ch = 'A'; ch <= 'H'; ch++){
            System.out.print(ch+ " ");
            if(ch == 'C'){
                break;
            }



            }
        System.out.println();
        System.out.println("======================================");
        for (int a = 10; a <= 50; a +=10){
            System.out.print(a+ " ");
            if(a == 30){
                break;
            }
        }
    }
}
