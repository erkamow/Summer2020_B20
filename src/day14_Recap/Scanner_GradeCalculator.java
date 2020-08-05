package day14_Recap;

import java.util.Scanner;

public class Scanner_GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your Grade");
        double score = scan.nextDouble();
        scan.close();

        String result = "";

        if(score >=0 && score <= 100){
            if(score >= 90){
                result = "Excellent";

            }else if(score >= 80){
                result = "Great";
            }else if(score >= 70){
                result = "good";
            }else if(score >= 60){
                result = "passed";
            }else{
                result = "failed";
            }

        }else{
            result = "invalid Score";
        }
        System.out.println(" your result is: " +result);

    }
}
