package day52_Exeptions;

public class Practice{

    public static void main(String[] args) {


        try{
            System.out.println(9/0);
        }catch (ArithmeticException error){
            System.out.println(error.getMessage());
        }


        System.out.println("test completed");
    }
}
