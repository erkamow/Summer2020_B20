package day10_IfStatments;

public class Multi_Branch_IfStatement {

    public static void main(String[] args) {



        double a = 100;
        double b = 200;
        double c = 300;
        double d = 400;

        if( a < b && a < c && a < d){
            System.out.println(a + " is lowest"); //true
        }else if(b > c && b > d && b > a){
            System.out.println(b + " is lowest");//false
        }else if(c > a && c > b && c > d){
            System.out.println(c + " is lowest");
        }else{
            System.out.println(d + " is lowest");
        }



    }
}
