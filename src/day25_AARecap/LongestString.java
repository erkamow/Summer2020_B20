package day25_AARecap;

public class LongestString {

    public static void main(String[] args) {

        String[] arr = {"Anam","Nickolas","Amir","Nurmemet"};

        int maxLength = arr[0].length();
        for(String each: arr){
            if(each.length() > maxLength){
                maxLength = each.length();

            }
        }
        System.out.println(maxLength);
        for(String each : arr){
            if(each.length()==maxLength){
                System.out.println(each);
            }
        }


    }
}
