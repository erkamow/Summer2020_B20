package day30_CustomMethods;

public class ReturnMethod2 {


    public static void main(String[] args) {
        String name = "Level";
       // reverse2(name);
        String reversedName = reverse3(name);
        System.out.println(name.equalsIgnoreCase(reversedName));



    }



    public static void reverse2(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
           result += str.charAt(i);
        }
        System.out.println(result);
    }

    public static String reverse3(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
