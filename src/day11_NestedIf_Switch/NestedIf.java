package day11_NestedIf_Switch;

public class NestedIf {

    public static void main(String[] args) {


        int score = 100;
        String result = "";

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            }else{
                result = "F";
            }

        }else{
            result = "invalid";

        }
        System.out.println( result);
        String result2 = "";

        System.out.println("=====================================================");


        /*
        precondition: minumum salary is 30k
        sub condition: minumum 2 years of job history

         */

        int salary = 30000;
        int jobHis = 2;
        String eligibleForLoan = "";

        if(salary >= 30000){

            if(jobHis >= 2){
                eligibleForLoan = "Qualifed for loan";
            }else if(jobHis < 2){
                eligibleForLoan ="Not qualifed for loan";
            }else{
                eligibleForLoan = " Not qualifed for loan";
            }
        }else{
            eligibleForLoan = " Invalid";

        }
        System.out.println(eligibleForLoan);
    }
}
