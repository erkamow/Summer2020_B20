package day53_Custom_Exception_FinalKeyword;

public class BreakTimeException extends RuntimeException{  //custom unchecked exception

    public BreakTimeException(){
        super("its time for a break");
        System.out.println("time to go home");
    }
    public BreakTimeException(String str){
        super(str);
        System.out.println("time to take 15 min break");

    }

}

class Test{

    public static void main(String[] args) {
        // throw new RuntimeException("This is Runtime exception");
        // throw new BreakTimeException("you need to give us a break");

       // System.out.println("Test Completed");

        // throw new Test();
        throw new BreakTimeException("its been 45 minutes");
    }
}


