package day51_Expections;

public class ExceptionsIntro {
    public static void main(String[] args)  {
        int[] arr = {1,2,3};

        System.out.println("Test Started");

        // System.out.println(arr[100]); // unchecked exceptions (unexpected event)

        // Thread.sleep(3000); // checked exceptions (unwanted event)

        String str = "Cybertek";
        System.out.println(str.charAt(-1));
    }
}
