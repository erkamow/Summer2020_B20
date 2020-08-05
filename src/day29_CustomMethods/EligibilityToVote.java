package day29_CustomMethods;

public class EligibilityToVote {

    public static void eligibletoBuyAlcohol(boolean hasID,int age){
        if(hasID && age >=21){
            System.out.println("you are eligible to buy alcohol");
        }else{
            System.out.println("go buy milk bro");
        }
    }

    public static void main(String[] args) {
        vote("john",28,true,"biden");
        vote("daniel",17,true,"kanye");
        eligibletoBuyAlcohol(true,19);
        calculator(100,'*',20);
    }


    public static void  vote(String name,int age,boolean citizen,String canditateName){
        boolean eligibletoVote = age >=18 && citizen == true;
        if(eligibletoVote){
            System.out.println(name+" eligible to vote");
        }else{
            System.out.println(name+" not eligible to vote");
        }
    }

    public static void calculator(double num1,char operator,double num2){
        // + , - , % ,/ ,*
        switch (operator){
            case'+':
                System.out.println("addition: "+(num1+num2));
                break;
            case'-':
                System.out.println("subtraction: "+(num1-num2));
                break;
            case'*':
                System.out.println("multiplication: "+(num1*num2));
                break;
            case '%':
                System.out.println("remainder: "+(num1%num2));
                break;
            case '/':
                System.out.println("division: "+(num1/num2));
            default:
                System.out.println("invalid operator");
        }
    }
}
