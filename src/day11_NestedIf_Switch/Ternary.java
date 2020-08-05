package day11_NestedIf_Switch;

public class Ternary {

    public static void main(String[] args) {

        int num = 100;

        String result = "";

        if(num % 2 == 0){
            result = "even";
        }else{
            result = "odd";
        }
        System.out.println(result);
        System.out.println("====================================================");


        String result2 = (num % 2 == 0)?"even" : "odd";
        System.out.println(result2);
        System.out.println("====================================================");

        int num1 = 10;
        int num2 = 20;
        int max1 = 0;
        if(num1 > num2){
            max1 = num1;
        }else{
            max1 = num2;
        }
        System.out.println(max1);

        int max2 = (num1 > num2)? num1 :  num2 ;
        System.out.println(max2);
        System.out.println("=======================================");

        int age = 19;
        boolean eligible = false;
        if(age >= 21){
            eligible = true;
        }else{
            eligible = false;
        }
        System.out.println(eligible);
        System.out.println("=========================================");

        boolean eligible2 = (age >=21)? true : false;
        System.out.println(eligible2);
        System.out.println("============================================");

        String citizenship = "USA";
        String CanVoteOrNot =(age >= 18 && citizenship == "USA")? "CanVote" : "CanNotVote";
        System.out.println(CanVoteOrNot);

        int num3 = 10;
        int num4 = 20;
        String equalOrNot = (num3 == num4)? "Equal" : "Not Equal";
        System.out.println(equalOrNot);
        System.out.println("===============================================");

        int num5 = 100;
        String result5 = "";

        String result6 = (num5 > 0)? "Positive" : (num5 < 0)? "Negative" : "Zero";
        System.out.println(result6);
        System.out.println("==================================================");

        int x = 10;
        int y = 20;
        String WhichIsGreater = (x > y)? " X is greater" : "Y is greater";
        System.out.println(WhichIsGreater);
        System.out.println("===================================================");

        double k = 23.7;
        double l = 17.3;
        String WhichIsLower = (l < k)? " l Is lower" : " k is greater";
        System.out.println(WhichIsLower);
        System.out.println("=====================================================");

        int z = 30;
        int g = 30;
        String IfItsEqual = (z == g)? " z  equal to g" : "z not equal to g";
        System.out.println(IfItsEqual);




    }
}
