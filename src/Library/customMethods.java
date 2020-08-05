package Library;

import java.util.Arrays;

public class customMethods {

    public static void main(String[] args) {
        reverse("erkam");
        removeDup("");
        grade(0);
        eligibletoBuy(0);
        palinDrome("");


    }

    public static void reverse(String str){
        String result = "";
        for(int i = str.length()-1; i >=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
    public static void removeDup(String str){
        String nonDup = "";
        for(String each : str.split("")){
            if (!nonDup.contains(each)) {
                nonDup+=each;
            }
        }
        System.out.println(nonDup+" ");
    }
    public static void grade(int score){


        if(score < 0 || score > 100){
            System.out.println("invalid score");
            return;
        }

        char grade = (score >= 90)? 'A' : (score >= 80)? 'B' : (score >= 70)? 'C' : (score >= 60)? 'D'
                : 'F';
        System.out.println("Grade is: "+grade);
    }

    public static void eligibletoBuy(int age){

        if(age<21){
            System.out.println("you are not eligible");
        }else{
            System.out.println("eligible to buy");
        }
    }
    public static void palinDrome(String sentence){
        String result = "";
        for(int i = sentence.length()-1; i >= 0; i--){
            result+=sentence.charAt(i);
        }

        if (result.equalsIgnoreCase(sentence)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
    public static void MaxNum(int[] arr){
        int max = 0;

        for(int each : arr){
            if(each>max){
                max = each;
            }
        }
        System.out.println("max: "+max);
    }
    public static void MinNum(int[] arr2){
        int min = 0;

        for(int each : arr2){
            if(each<min){
                min = each;
            }
        }
        System.out.println("min: "+min);

    }








}
