package day31_MethodsRecap;

public class Methods_Practice2 {
    public static void main(String[] args) {
       String name = "erkam";
        reversed(name);
      String rev =  reversed2(name);
        System.out.println(name.equalsIgnoreCase(rev));
    }







    public static void reversed(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
           result += str.charAt(i);


        }
        System.out.println(result);

    }

    public static String reversed2(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result += str.charAt(i);


        }
        return result;

    }
}
