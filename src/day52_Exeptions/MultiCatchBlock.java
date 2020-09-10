package day52_Exeptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        int[] arr = {10,20};

        try {
            System.out.println(arr[20]);
        }catch (ArithmeticException error){
            System.out.println("arithmetic exception is handled");
        }catch (ClassCastException error) {
            System.out.println("class cast exception");
        }catch (ArrayIndexOutOfBoundsException error){
            System.out.println("array index out of bound exception");
        }catch (IndexOutOfBoundsException error){
            System.out.println("index out of bound exception");
        }

        System.out.println("=====================================================");

        String str = "cybertek";
        try {
            System.out.println(str.charAt(200));
        }catch (RuntimeException error){
            System.out.println(error.getMessage());
        }



    }
}
