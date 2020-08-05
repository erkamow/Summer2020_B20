package day19_ForLoop_Break_Continue;

public class Loop_ContinueStatement {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){

            if( i == 3){   // use the if statement before print statement!!!
                continue;
            }
            System.out.print(i+ " ");
        }

        System.out.println("=================================================");

        for(char ch = 'A'; ch <= 'F'; ch++){

            if(ch == 'C' || ch == 'F'){
                continue;
            }
            System.out.print(ch+ " ");
        }
    }
}
