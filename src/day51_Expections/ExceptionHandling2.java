package day51_Expections;

public class ExceptionHandling2 {

    public static void main(String[] args) {

        String exceptionResult = "";


        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException error){
            exceptionResult = error.getMessage();
            System.out.println("ArithmeticException is detected");
        }
        System.out.println(exceptionResult);
    }
}
