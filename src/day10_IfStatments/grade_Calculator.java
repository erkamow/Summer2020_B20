package day10_IfStatments;
/*
grade : int score = 95;
90<=>100 ==> A
80<=>89 ==> B
70<=>79 ==> c
60<=>69 ==> d
 */
public class grade_Calculator {

    public static void main(String[] args) {

        int score = 12;

        if (score >= 90 && score <= 100) {
            System.out.println(score + " is A");
        } else if (score >= 80 && score <= 89) {
            System.out.println(score + " is B");
        } else if (score >= 70 && score <= 79) {
            System.out.println(score + " is C");
        } else if (score >= 60 && score <= 69) {
            System.out.println(score + " is D");
        } else {
            System.out.println(score + " is F");


        }
    }

}
