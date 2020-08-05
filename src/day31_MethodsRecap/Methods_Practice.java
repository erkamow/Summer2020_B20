package day31_MethodsRecap;

public class Methods_Practice {
    public static void main(String[] args) {
        Max(23,12);

      int b =  Max2(20,30);

        System.out.println(Max2(20,30)  );
        System.out.println(Max2(20,30)*10);

    }






    public static void Max(int a,int b){
        int max = a > b? a : b;
        System.out.println(max);


   }
   public static int Max2(int a, int b){
        return a > b? a : b;

   }



}
