package day29_CustomMethods;

public class ReturnKeyboard {

    // 6.calculate the grade of the student based on score
    public static void main(String[] args) {
        grade(101);
        System.out.println("Task completed");
        eligibletoBuy(17);
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
}
